package com.example.gym_api_system.Dtos;
import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String name;
    private Double currentWeight;
    private Double height;
}