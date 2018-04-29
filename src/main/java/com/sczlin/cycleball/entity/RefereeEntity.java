package com.sczlin.cycleball.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_referee", schema = "public")
public class RefereeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "surname")
    private String surname;
}
