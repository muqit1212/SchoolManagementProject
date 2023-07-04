package com.example.phonedirectoryproject.repository;

import com.example.phonedirectoryproject.model.StudentRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRecordRepository extends JpaRepository<StudentRecord,UUID> {

}
