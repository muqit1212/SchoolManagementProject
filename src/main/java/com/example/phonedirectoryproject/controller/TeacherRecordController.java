package com.example.phonedirectoryproject.controller;
import com.example.phonedirectoryproject.model.TeacherRecord;
import com.example.phonedirectoryproject.service.TeacherRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/teacherrecord")
public class TeacherRecordController {
    @Autowired
    TeacherRecordService teacherRecordService;

    public TeacherRecordController(TeacherRecordService teacherRecordService) {
        this.teacherRecordService = teacherRecordService;
    }

    @GetMapping("{id}")
    public TeacherRecord getTeacherRecordDetails(@PathVariable("id") UUID id){
        return teacherRecordService.getTeacherRecord(id);
    }
    @GetMapping
    public List<TeacherRecord> getAllTeacherRecordDetails(){
        return teacherRecordService.getAllTeacherRecord();
    }
    @PostMapping
    public String createTeacherRecordDetails(@RequestBody TeacherRecord teacherRecord){
        //Autowire Hibernate Repository JPA
        //phoneRepository.save(studentRecord);
        teacherRecordService.createTeacherRecord(teacherRecord);
        return "Teacher Record is created.";
    }
    @PutMapping
    public String updateTeacherRecordDetails(@RequestBody TeacherRecord teacherRecord){
        teacherRecordService.updateTeacherRecord(teacherRecord);
        return "Teacher Record is updated.";
    }
    @DeleteMapping("{id}")
    public String deleteTeacherRecordDetails(@PathVariable("id") UUID id){
        teacherRecordService.deleteTeacherRecord(id);
        return "Teacher Record is deleted.";
    }
}
