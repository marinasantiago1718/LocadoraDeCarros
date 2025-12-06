package com.locadora.user_service.service;

import com.locadora.user_service.dto.request.UserRequestDTO;
import com.locadora.user_service.dto.response.UserResponseDTO;
import com.locadora.user_service.model.User;
import com.locadora.user_service.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;

    // Construtor manual
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponseDTO create(UserRequestDTO request) {
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        User saved = userRepository.save(user);
        return toResponse(saved);
    }

    public UserResponseDTO getById(String id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        return toResponse(user);
    }

    public List<UserResponseDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    public void deleteUser(String id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado.");
        }
        userRepository.deleteById(id);
    }

    public UserResponseDTO update(UserRequestDTO request, String id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado."));

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        User updated = userRepository.save(user);
        return toResponse(updated);
    }

    private UserResponseDTO toResponse(User user) {
        UserResponseDTO res = new UserResponseDTO();
        res.setId(user.getId());
        res.setName(user.getName());
        res.setEmail(user.getEmail());
        return res;
    }
}
