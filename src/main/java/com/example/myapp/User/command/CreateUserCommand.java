package com.example.myapp.User.command;

import com.example.myapp.Common.Command.Interface.Command;

public class CreateUserCommand implements Command {

    private final String username;
    private final String password;
    private final String email;

    public CreateUserCommand(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
