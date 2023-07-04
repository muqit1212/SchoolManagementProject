package com.example.phonedirectoryproject.service.impl;
import com.example.phonedirectoryproject.model.TeacherRecord;
import com.example.phonedirectoryproject.repository.TeacherRecordRepository;
import com.example.phonedirectoryproject.service.TeacherRecordService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TeacherRecordServiceImpl implements TeacherRecordService {
    TeacherRecordRepository teacherRecordRepository;
    public TeacherRecordServiceImpl(TeacherRecordRepository teacherRecordRepository) {
        this.teacherRecordRepository = teacherRecordRepository;
    }

    @Override
    public String createTeacherRecord(TeacherRecord teacherRecord) {
        teacherRecordRepository.save(teacherRecord);
        return "Success";
    }

    @Override
    public String updateTeacherRecord(TeacherRecord teacherRecord) {
        teacherRecordRepository.save(teacherRecord);
        return "Success";
    }
    @Override
    public UUID deleteTeacherRecord(UUID id) {
        teacherRecordRepository.deleteById(id);
        return null;
    }

    @Override
    public TeacherRecord getTeacherRecord(UUID id) {
        return teacherRecordRepository.findById(id).get();
    }

    @Override
    public List<TeacherRecord> getAllTeacherRecord() {
        return teacherRecordRepository.findAll();
    }
}
