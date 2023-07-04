package com.example.phonedirectoryproject.service.impl;

import com.example.phonedirectoryproject.model.StudentRecord;
import com.example.phonedirectoryproject.repository.StudentRecordRepository;
import com.example.phonedirectoryproject.service.StudentRecordService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service

public class StudentRecordServiceImpl implements StudentRecordService {

    StudentRecordRepository studentRecordRepository;

    public StudentRecordServiceImpl(StudentRecordRepository studentRecordRepository) {
        this.studentRecordRepository = studentRecordRepository;
    }

    @Override
    public String createStudentRecord(StudentRecord studentRecord) {
        studentRecordRepository.save(studentRecord);
        return "Success";
    }

    @Override
    public String updateStudentRecord(StudentRecord studentRecord) {
        studentRecordRepository.save(studentRecord);
        return "Success";
    }
    @Override
    public UUID deleteStudentRecord(UUID id) {
        studentRecordRepository.deleteById(id);
        return null;
    }

    @Override
    public StudentRecord getStudentRecord(UUID id) {
        return studentRecordRepository.findById(id).get();
    }

    @Override
    public List<StudentRecord> getAllStudentRecord() {
        return studentRecordRepository.findAll();
    }
}
