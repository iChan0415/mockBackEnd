package com.example.sandboxv2.sandboxv2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sandboxv2.sandboxv2.entity.Support;
import com.example.sandboxv2.sandboxv2.services.SupportService;

@RestController
@RequestMapping("/api/supports")
public class SupportController {
    @Autowired
    private SupportService supportService;

    @GetMapping
    public List<Support> getAllSupports() {
        return supportService.getAllSupport();
    }

    @GetMapping("/{supportID}")
    public Support getSupportById(@PathVariable Long supportID) {
        return supportService.getSupportById(supportID);
    }

    @PostMapping
    public Support saveSupport(@RequestBody Support support) {
        return supportService.saveSupport(support);
    }

    @DeleteMapping("/{supportID}")
    public void deleteSupport(@PathVariable Long supportID) {
        supportService.deleteSupport(supportID);
    }
}
