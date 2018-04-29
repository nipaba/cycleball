package com.sczlin.cycleball.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_club", schema = "public")
public class ClubEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

}
