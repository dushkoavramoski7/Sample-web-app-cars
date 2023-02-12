package com.example.library.Model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Table(name = "Cars", schema = "dbo")
public class Car {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @Nationalized
    private String name;

    @Column(name = "model")
    @Nationalized
    private String model;

    @Column(name = "car_description")
    @Nationalized
    private String description;
}