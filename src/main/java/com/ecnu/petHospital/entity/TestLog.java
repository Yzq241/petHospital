package com.ecnu.petHospital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="test_log")
public class TestLog {
    @Id
    private int id;

    private int testId;

    private int userId;

    private int score;

    private Timestamp submitTime;
}
