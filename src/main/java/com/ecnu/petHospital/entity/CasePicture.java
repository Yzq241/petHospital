package com.ecnu.petHospital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CasePicture {
    @Id
    private int id;

    private String url;

    private int caseId;

    private String describe;

    private String procedure;

}
