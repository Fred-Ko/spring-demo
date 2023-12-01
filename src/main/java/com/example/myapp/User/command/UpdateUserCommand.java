package com.example.myapp.User.command;

public class UpdateUserCommand {

    private final Long userId;
    private final String username;
    private final String email;

    public UpdateUserCommand(Long userId, String username, String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
    }

    // Getters
    public Long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
