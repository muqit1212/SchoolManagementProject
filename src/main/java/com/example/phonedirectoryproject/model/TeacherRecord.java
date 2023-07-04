package com.example.phonedirectoryproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "teacher_record")
public class TeacherRecord {
    @Id
    @GeneratedValue(generator = "id")
    private UUID id;
    private String name;
    private String father_name;
    private String cnic;
    private String qualification;

    public TeacherRecord() {
    }

    public TeacherRecord(UUID id, String name, String father_name, String cnic, String qualification) {
        this.id = id;
        this.name = name;
        this.father_name = father_name;
        this.cnic = cnic;
        this.qualification = qualification;
    }

    public UUID getUuid() {
        return id;
    }

    public void setUuid(UUID uuid) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String semester) {
        this.qualification = qualification;
    }
}
