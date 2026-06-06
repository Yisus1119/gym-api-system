package com.example.gym_api_system.Controller;

import com.example.gym_api_system.Dtos.UserDTO;
import com.example.gym_api_system.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {

        return ResponseEntity.ok(userService.get());
    }

    @GetMapping("/userId/{userId}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long userId) {

        return ResponseEntity.ok(userService.getById(userId));
    }

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {

        return new ResponseEntity<>(userService.post(userDTO), HttpStatus.CREATED);
    }

    @PutMapping("/userId/{userId}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long userId, @RequestBody UserDTO userDTO) {

        return ResponseEntity.ok(userService.put(userId, userDTO));
    }

    @DeleteMapping("/userId/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {

        userService.delete(userId);

        return ResponseEntity.noContent().build();
    }
}