package com.ecnu.petHospital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private int id;

    private String userName;

    private String password;
    @NotNull(message=" 邮箱作为登录不能为空 ")
    private String email;

    private boolean admin;
}
