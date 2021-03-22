package com.ecnu.petHospital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="test_question")
public class TestQuestion {
    @Id
    private int id;

    private int paperId;

    private int questionId;

    private int questionNumber;

}
