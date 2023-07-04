package com.example.phonedirectoryproject.service;
import com.example.phonedirectoryproject.model.BeforeQualification;
import java.util.List;
import java.util.UUID;

public interface BeforeQualificationService {
    public String createBeforeQualification(BeforeQualification beforeQualification);
    public String updateBeforeQualification(BeforeQualification beforeQualification);
    public UUID deleteBeforeQualification(UUID id);
    public BeforeQualification getBeforeQualification(UUID id);
    public List<BeforeQualification> getAllBeforeQualification();
}
