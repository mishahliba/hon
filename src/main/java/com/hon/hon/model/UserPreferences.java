package com.hon.hon.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by beerman on 10.10.2017.
 */
@Entity
public class UserPreferences {
    private static final long SerialVersionUUID = Long.MAX_VALUE;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private Integer id;

    @Getter @Setter
    @Column
    private String name;

    @Getter @Setter
    @Column
    private Boolean trigger;

    @Getter @Setter
    @OneToOne(fetch = FetchType.LAZY,  mappedBy = "id")
    private User user;
}
