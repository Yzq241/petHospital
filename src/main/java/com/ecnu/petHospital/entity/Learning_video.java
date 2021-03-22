package com.ecnu.petHospital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="learning_video")
public class Learning_video {
    @Id
    private int id;

    private int resourceId;

    private String url;

    private String describe;
}
