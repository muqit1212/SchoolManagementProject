package com.example.phonedirectoryproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "qualification")
public class BeforeQualification {
    @Id
    @GeneratedValue(generator="id")
    private UUID id;
    private String subject_matric;
    private String o_level;
    private String inter_Subject;
    private String diploma;
    private String bs;
    private String phd;
    private String mphil;
    private String mcs;
    private String engenering;

    public BeforeQualification() {
    }

    public BeforeQualification(UUID id, String subject_matric, String o_level, String inter_Subject, String diploma, String bs, String phd, String mphil, String mcs, String engenering) {
        this.id = id;
        this.subject_matric = subject_matric;
        this.o_level = o_level;
        this.inter_Subject = inter_Subject;
        this.diploma = diploma;
        this.bs = bs;
        this.phd = phd;
        this.mphil = mphil;
        this.mcs = mcs;
        this.engenering = engenering;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSubject_matric() {
        return subject_matric;
    }

    public void setSubject_matric(String subject_matric) {
        this.subject_matric = subject_matric;
    }

    public String getO_level() {
        return o_level;
    }

    public void setO_level(String o_level) {
        this.o_level = o_level;
    }

    public String getInter_Subject() {
        return inter_Subject;
    }

    public void setInter_Subject(String inter_Subject) {
        this.inter_Subject = inter_Subject;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    public String getPhd() {
        return phd;
    }

    public void setPhd(String phd) {
        this.phd = phd;
    }

    public String getMphil() {
        return mphil;
    }

    public void setMphil(String mphil) {
        this.mphil = mphil;
    }

    public String getMcs() {
        return mcs;
    }

    public void setMcs(String mcs) {
        this.mcs = mcs;
    }

    public String getEngenering() {
        return engenering;
    }

    public void setEngenering(String engenering) {
        this.engenering = engenering;
    }
}
