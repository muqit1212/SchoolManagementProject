package com.example.phonedirectoryproject.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.UUID;

@Entity
@Table(name = "student_record")
public class StudentRecord {
    @Id
    @GeneratedValue(generator = "id")
    private UUID id;
    private String name;
    private String father_name;
    private String cnic;
    private String semester;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "before_qualification")
    private BeforeQualification beforeQualification;

    public StudentRecord() {
    }

    public StudentRecord(UUID id, String name, String father_name, String cnic, String semester) {
        this.id = id;
        this.name = name;
        this.father_name = father_name;
        this.cnic = cnic;
        this.semester = semester;
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

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    }
