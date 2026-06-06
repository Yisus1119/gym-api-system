package com.example.gym_api_system.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double weight;
    private Double height;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Routine> routines;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Progress> progressHistory;
}