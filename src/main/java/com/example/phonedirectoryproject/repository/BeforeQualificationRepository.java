package com.example.phonedirectoryproject.repository;

import com.example.phonedirectoryproject.model.BeforeQualification;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
public interface BeforeQualificationRepository extends JpaRepository<BeforeQualification, UUID> {
}
