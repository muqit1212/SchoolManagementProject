package com.example.phonedirectoryproject.repository;

import com.example.phonedirectoryproject.model.TeacherRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TeacherRecordRepository extends JpaRepository<TeacherRecord, UUID> {
}
