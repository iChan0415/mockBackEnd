package com.example.sandboxv2.sandboxv2.services;

import com.example.sandboxv2.sandboxv2.dto.VerificationResponse;
import com.example.sandboxv2.sandboxv2.entity.Certification;
import com.example.sandboxv2.sandboxv2.repository.CertificationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificationService {

  @Autowired
  private CertificationRepository certificationRepository;

  public List<Certification> getAllCertification() {
    return certificationRepository.findAll();
  }

  public Certification getCertificationId(Long certificateID) {
    return certificationRepository.findById(certificateID).orElse(null);
  }

  public List<Certification> getCertificationByUserId(Long user_ID) {
    return certificationRepository.findByUserId(user_ID);
  }

  public Certification savCertification(Certification certification) {
    return certificationRepository.save(certification);
  }

  public void deleteCertification(Long certificateID) {
    certificationRepository.deleteById(certificateID);
  }

  public List<VerificationResponse> getCertificationDetailsBySerialNumber(String serial_no) {
    return certificationRepository.findBySerialNumberWithDetails(serial_no);
}

}
