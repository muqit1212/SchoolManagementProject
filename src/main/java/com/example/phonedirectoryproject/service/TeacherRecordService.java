package com.example.phonedirectoryproject.service;
import com.example.phonedirectoryproject.model.TeacherRecord;

import java.util.List;
import java.util.UUID;

public interface TeacherRecordService {
    public String createTeacherRecord(TeacherRecord teacherRecord);
    public String updateTeacherRecord(TeacherRecord teacherRecord);
    public UUID deleteTeacherRecord(UUID id);
    public TeacherRecord getTeacherRecord(UUID id);
    public List<TeacherRecord> getAllTeacherRecord();
}
