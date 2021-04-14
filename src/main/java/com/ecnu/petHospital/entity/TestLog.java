package com.ecnu.petHospital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Table(name="test_log")
public class TestLog {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private Integer testId;

    private Integer userId;

    private Integer score;

    private Timestamp submitTime;
}
