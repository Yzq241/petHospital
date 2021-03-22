package com.ecnu.petHospital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Disease {
    @Id
    private int id;

    private String name;

    private int classId;
}
