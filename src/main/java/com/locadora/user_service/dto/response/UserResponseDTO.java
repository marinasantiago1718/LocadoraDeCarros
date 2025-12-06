package com.locadora.user_service.dto.response;

public class UserResponseDTO {
    private String id;
    private String name;
    private String email;

    // Construtor vazio
    public UserResponseDTO() {}

    // Construtor com parâmetros
    public UserResponseDTO(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
