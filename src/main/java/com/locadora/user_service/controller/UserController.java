package com.locadora.user_service.controller;

import com.locadora.user_service.dto.request.UserRequestDTO;
import com.locadora.user_service.dto.response.UserResponseDTO;
import com.locadora.user_service.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    // Construtor manual
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserResponseDTO create(@RequestBody UserRequestDTO request){
        return userService.create(request);
    }

    @GetMapping
    public List<UserResponseDTO> listUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserResponseDTO getUser(@PathVariable String id){
        return userService.getById(id);
    }

    @PutMapping("/{id}")
    public UserResponseDTO updateUser(@RequestBody UserRequestDTO req, @PathVariable String id){
        return userService.update(req, id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
        userService.deleteUser(id);
    }
}
