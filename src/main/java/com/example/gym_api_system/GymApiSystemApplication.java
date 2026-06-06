package com.example.gym_api_system;

import com.example.gym_api_system.Service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GymApiSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymApiSystemApplication.class, args);
	}

    @GetMapping("/")
    public String hello() {
        return "<h1>Bienvenidos</h1>";
    }
}