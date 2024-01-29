package com.example.sample.generatedcert.generatedcertificate.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.example.sample.generatedcert.generatedcertificate.Entity.Certificatetwo;
import com.example.sample.generatedcert.generatedcertificate.Repository.CertificatetwoRepostirory;

@RestController
@CrossOrigin("http://localhost:5173/")
public class CertificatetwoController {

    @Autowired
    private CertificatetwoRepostirory CertificatetwoRepostirory;

    @PostMapping("/saveCertificate")
    public ResponseEntity<String> saveCertificate(@RequestParam("name") String name,
                                                  @RequestParam("course") String course,
                                                  @RequestParam("instructor") String instructor,
                                                  @RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("File is empty");
        }

        try {
            // Save file to folder
            byte[] bytes = file.getBytes();
            String originalFilename = file.getOriginalFilename();
            String filenameWithoutPrefix = originalFilename.startsWith("PDF") ? originalFilename.substring(3) : originalFilename;
            Path path = Paths.get("C:\\Users\\vsbu\\Downloads\\certGenV2-main\\certGenV2-main\\genCert\\public\\PDF\\" + filenameWithoutPrefix);
            Files.write(path, bytes);

            // Save certificate data to database
            Certificatetwo certificatetwo = new Certificatetwo();
            certificatetwo.setName(name);
            certificatetwo.setCourse(course);
            certificatetwo.setInstructor(instructor);
            certificatetwo.setPdfFileName(filenameWithoutPrefix);
            CertificatetwoRepostirory.save(certificatetwo);

            return ResponseEntity.ok("Certificate saved successfully");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save certificate: " + e.getMessage());
        }
    }
}
