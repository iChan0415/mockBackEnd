package com.example.sandboxv2.sandboxv2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sandboxv2.sandboxv2.entity.Support;
import com.example.sandboxv2.sandboxv2.repository.SupportRepository;

@Service
public class SupportService {
    @Autowired
    private SupportRepository supportRepository;

    public List<Support> getAllSupport() {
        return supportRepository.findAll();
    }

    public Support getSupportById(Long supportID) {
        return supportRepository.findById(supportID).orElse(null);
    }

    public Support saveSupport(Support support) {
        return supportRepository.save(support);
    }

    public void deleteSupport(Long supportID) {
        supportRepository.deleteById(supportID);
    }
}
