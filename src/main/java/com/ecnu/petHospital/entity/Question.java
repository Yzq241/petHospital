package com.ecnu.petHospital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    private Integer id;

    private Integer diseaseId;

    private String title;

    private String a;

    private String b;

    private String c;

    private String d;

    private String answer;
}
