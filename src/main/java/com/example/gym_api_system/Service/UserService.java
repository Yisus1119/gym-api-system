package com.example.gym_api_system.Service;

import com.example.gym_api_system.Dtos.UserDTO;
import com.example.gym_api_system.Models.User;

import com.example.gym_api_system.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor // Lombok genera el constructor para la inyección de dependencias
public class UserService {

    private final UserRepository userRepository;

    public List<UserDTO> getAllUsers() {

        return userRepository.findAll(Sort.by(Sort.Direction.ASC, "id")).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public UserDTO getUserById(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User with the ID: " + userId + " was not found in the database"));

        return convertToDTO(user);
    }

    public UserDTO createUser(UserDTO userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setCurrentWeight(userDto.getCurrentWeight());
        user.setHeight(userDto.getHeight());

        User savedUser = userRepository.save(user);

        return convertToDTO(savedUser);
    }

    public UserDTO updateUser(Long userId, UserDTO userDto) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User with the ID: " + userId + " was not found in the database"));

        user.setName(userDto.getName());
        user.setCurrentWeight(userDto.getCurrentWeight());
        user.setHeight(userDto.getHeight());

        User updatedUser = userRepository.save(user);

        return convertToDTO(updatedUser);
    }

    public void deleteUser(Long userId) {
        if (!userRepository.existsById(userId)) {
            throw new RuntimeException("User with the ID: " + userId + " was not found in the database");
        }

        userRepository.deleteById(userId);
    }

    // Método auxiliar de mapeo (En el futuro podrías usar MapStruct para esto)
    private UserDTO convertToDTO(User user) {
        UserDTO dto = new UserDTO();

        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setCurrentWeight(user.getCurrentWeight());
        dto.setHeight(user.getHeight());

        return dto;
    }
}