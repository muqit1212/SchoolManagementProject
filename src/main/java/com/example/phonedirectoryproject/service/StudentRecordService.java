package com.example.phonedirectoryproject.service;

import com.example.phonedirectoryproject.model.StudentRecord;

import java.util.List;
import java.util.UUID;

public interface StudentRecordService {
    public String createStudentRecord(StudentRecord studentRecord);
    public String updateStudentRecord(StudentRecord studentRecord);
    public UUID deleteStudentRecord(UUID id);
    public StudentRecord getStudentRecord(UUID id);
    public List<StudentRecord> getAllStudentRecord();
}
