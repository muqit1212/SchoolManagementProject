package com.example.phonedirectoryproject.controller;
import com.example.phonedirectoryproject.model.StudentRecord;
import com.example.phonedirectoryproject.service.StudentRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/studentrecord")
public class StudentRecordController {
    @Autowired
    StudentRecordService studentRecordService;

    public StudentRecordController(StudentRecordService studentRecordService) {
        this.studentRecordService = studentRecordService;
    }

    @GetMapping("{id}")
    public StudentRecord getStudentRecordDetails(@PathVariable("id") UUID id){
        return studentRecordService.getStudentRecord(id);
    }
    @GetMapping
    public List<StudentRecord> getAllStudentRecordDetails(){
        return studentRecordService.getAllStudentRecord();
    }
    @PostMapping
    public String createStudentRecordDetails(@RequestBody StudentRecord studentRecord){
        //Autowire Hibernate Repository JPA
        //phoneRepository.save(studentRecord);
        studentRecordService.createStudentRecord(studentRecord);
        return "Student Record is created.";
    }
    @PutMapping
    public String updateStudentRecordDetails(@RequestBody StudentRecord studentRecord){
        studentRecordService.updateStudentRecord(studentRecord);
        return "Student Record is updated.";
    }
    @DeleteMapping("{id}")
    public String deleteStudentRecordDetails(@PathVariable("id") UUID id){
        studentRecordService.deleteStudentRecord(id);
        return "Student Record is deleted.";
    }
}
