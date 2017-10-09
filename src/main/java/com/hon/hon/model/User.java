package com.hon.hon.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by beerman on 10.10.2017.
 */
@Entity
public class User {
    private static final long SerialVersionUUID = Long.MAX_VALUE;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private Integer id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;
}
