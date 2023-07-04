package com.example.phonedirectoryproject.service.impl;

import com.example.phonedirectoryproject.model.BeforeQualification;
import com.example.phonedirectoryproject.repository.BeforeQualificationRepository;
import com.example.phonedirectoryproject.service.BeforeQualificationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BeforeQualificationServiceImpl implements BeforeQualificationService {
    BeforeQualificationRepository beforeQualificationRepository;
    public BeforeQualificationServiceImpl(BeforeQualificationRepository beforeQualificationRepository){
        this.beforeQualificationRepository=beforeQualificationRepository;
    }
    @Override
    public String createBeforeQualification(BeforeQualification beforeQualification) {
        beforeQualificationRepository.save(beforeQualification);
        return "Success";
    }

    @Override
    public String updateBeforeQualification(BeforeQualification beforeQualification) {
        beforeQualificationRepository.save(beforeQualification);
        return "Success";
    }

    @Override
    public UUID deleteBeforeQualification(UUID id) {
        beforeQualificationRepository.deleteById(id);
        return null;
    }

    @Override
    public BeforeQualification getBeforeQualification(UUID id) {
        return beforeQualificationRepository.findById(id).get();
    }

    @Override
    public List<BeforeQualification> getAllBeforeQualification() {
        return beforeQualificationRepository.findAll();
    }
}
