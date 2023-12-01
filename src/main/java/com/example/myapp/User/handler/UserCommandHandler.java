package com.example.myapp.User.handler;

import com.example.myapp.User.command.CreateUserCommand;
import com.example.myapp.User.command.DeleteUserCommand;
import com.example.myapp.User.command.UpdateUserCommand;
import com.example.myapp.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserCommandHandler {

    private final UserRepository userRepository;

    @Autowired
    public UserCommandHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void handleCreateUser(CreateUserCommand command) {
        // User creation logic
    }

    public void handleDeleteUser(DeleteUserCommand command) {
        // User deletion logic
    }

    public void handleUpdateUser(UpdateUserCommand command) {
        // User update logic
    }
}
