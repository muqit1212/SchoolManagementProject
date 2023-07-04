package com.example.phonedirectoryproject.controller;
import com.example.phonedirectoryproject.model.BeforeQualification;
import com.example.phonedirectoryproject.service.BeforeQualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/beforequalification")
public class BeforeQualificationController {
    @Autowired
    BeforeQualificationService beforeQualificationService;
    public BeforeQualificationController(BeforeQualificationService beforeQualificationService) {
        this.beforeQualificationService = beforeQualificationService;
    }

    @GetMapping("{id}")
    public BeforeQualification getBeforeQualificationDetails(@PathVariable("id") UUID id){
        return beforeQualificationService.getBeforeQualification(id);
    }
    @GetMapping
    public List<BeforeQualification> getAllBeforeQualificationDetails(){
        return beforeQualificationService.getAllBeforeQualification();
    }
    @PostMapping
    public String createBeforeQualificationDetails(@RequestBody BeforeQualification beforeQualification){
        beforeQualificationService.createBeforeQualification(beforeQualification);
        return "Qualification Record is created.";
    }
    @PutMapping
    public String updateBeforeQualificationDetails(@RequestBody BeforeQualification beforeQualification){
        beforeQualificationService.updateBeforeQualification(beforeQualification);
        return "Qualification Record is updated.";
    }
    @DeleteMapping("{id}")
    public String deleteBeforeQualificationDetails(@PathVariable("id") UUID id){
        beforeQualificationService.deleteBeforeQualification(id);
        return "Qualification Record is deleted.";
    }
}
