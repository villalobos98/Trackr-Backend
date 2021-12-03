package com.server.trackr.Trackr.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Admin {

    private String adminUserName;
    private String adminPassWord;

}
