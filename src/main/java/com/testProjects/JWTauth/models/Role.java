package com.testProjects.JWTauth.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;
}
