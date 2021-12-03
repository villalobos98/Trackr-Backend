package com.server.trackr.Trackr.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "USER_CREDENTIAL")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Credential {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Integer userID;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PASS_WORD")
    private String password;

}
