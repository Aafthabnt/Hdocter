package com.hospital.Docter.entities;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name="\"DOCTER_INFO\"",schema="\"docter\"")
public class DocterInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="DOCTER_ID")
    private long docterId;

    @Column(name="DOCTER_NAME")
    private String docterName;

    @Column(name="AGE")
    private int docterAge;

    @Column(name="GENDER")
    private String gender;

    @Column(name="SPECIALITY")
    private String speciality;

    @Column(name = "HOSPITAL_NAME")
    private String hospitalName;



}
