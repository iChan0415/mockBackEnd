package com.example.sandboxv2.sandboxv2.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.sandboxv2.sandboxv2.entity.Certification;
import com.example.sandboxv2.sandboxv2.entity.QuizTaken;
import com.example.sandboxv2.sandboxv2.services.CertificationService;
import com.example.sandboxv2.sandboxv2.services.QuizTakenService;

@RestController
@RequestMapping("/api/certifications")
@CrossOrigin("http://localhost:5173/")
public class CertificationController {
    @Autowired
    private CertificationService certificationService;

    @Autowired
    private QuizTakenService quizTakenService; // Assuming you have QuizTakenService to retrieve QuizTaken

    @GetMapping
    public List<Certification> getAllCertification() {
        return certificationService.getAllCertification();
    }

    @GetMapping("/{certificateID}")
    public Certification getCertificationById(@PathVariable Long certificateID) {
        return certificationService.getCertificationId(certificateID);
    }

    @GetMapping("/myCertification/{user_ID}")
    public List<Certification> getCertificationByUserId(@PathVariable Long user_ID) {
        return certificationService.getCertificationByUserId(user_ID);
    }

    @PostMapping
    public ResponseEntity<String> saveCertification(@RequestParam("serial_no") String serial_no, 
                                                     @RequestParam("file") MultipartFile certificate_file, 
                                                     @RequestParam("date_issued") Date date_issued, 
                                                     @RequestParam("criteria") String criteria, 
                                                     @RequestParam("quiztkn_ID") Long quiztkn_ID) {
        if (certificate_file.isEmpty()) {
            return ResponseEntity.badRequest().body("File is empty");
        }

        try {
            byte[] bytes = certificate_file.getBytes();
            String originalFilename = certificate_file.getOriginalFilename();
            String filenameWithoutPrefix = originalFilename.startsWith("PDF") ? originalFilename.substring(3) : originalFilename;
            Path path = Paths.get("C:\\Users\\vsbu\\Desktop\\workingbackendjoin-main\\workingbackendjoin-main\\certGenV2-main\\certGenV2-main\\genCert\\public\\PDF\\" + filenameWithoutPrefix);
            Files.write(path, bytes);

            QuizTaken quizTaken = quizTakenService.getQuizTakenId(quiztkn_ID); // Assuming you have a service to find QuizTaken by ID
            if (quizTaken == null) {
                return ResponseEntity.badRequest().body("QuizTaken not found with ID: " + quiztkn_ID);
            }

            Certification certification = new Certification();
            certification.setSerial_no(serial_no);
            certification.setDate_issued(date_issued);
            certification.setCertificate_file(filenameWithoutPrefix);
            certification.setCriteria(criteria);
            certification.setQuizTaken(quizTaken); // Set QuizTaken in Certification
            certificationService.savCertification(certification);

            return ResponseEntity.ok("Certificate saved successfully");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save certificate: " + e.getMessage());
        }
    }

    @DeleteMapping("/{certificateID}")
    public void deleteCertification(@PathVariable Long certificateID) {
        certificationService.deleteCertification(certificateID);
    }
}

