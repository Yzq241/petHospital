package com.ecnu.petHospital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Case {
    @Id
    private int id;

    private String name;

    private int diseaseId;

    private String consultation;

    private String examination;

    private String diagnosis;

    private String treatment;

}