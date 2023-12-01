package com.example.myapp.User.resolver;

import com.example.myapp.User.aggregate.User;
import com.example.myapp.User.command.CreateUserCommand;
import com.example.myapp.User.command.DeleteUserCommand;
import com.example.myapp.User.command.UpdateUserCommand;
import com.example.myapp.User.handler.UserCommandHandler;
import com.netflix.dgs.codegen.generated.DgsConstants;
import com.netflix.graphql.dgs.*;
import jakarta.validation.Valid;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

@DgsComponent
public class UserResolver {

    private final UserCommandHandler userCommandHandler;

    @Autowired
    public UserResolver(UserCommandHandler userCommandHandler) {
        this.userCommandHandler = userCommandHandler;
    }

    @DgsQuery
    public User getUser(@InputArgument("id") Long id) {
        // User query logic
        return null;
    }

    @DgsMutation
    public User createUser(@NotNull @Valid CreateUserCommand command) {
        userCommandHandler.handleCreateUser(command);
        // User creation logic
        return null;
    }

    @DgsMutation
    public boolean deleteUser(@NotNull @Valid DeleteUserCommand command) {
        userCommandHandler.handleDeleteUser(command);
        // User deletion logic
        return true;
    }

    @DgsMutation
    public User updateUser(@NotNull @Valid UpdateUserCommand command) {
        userCommandHandler.handleUpdateUser(command);
        // User update logic
        return null;
    }
}
