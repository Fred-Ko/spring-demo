package com.example.myapp.User.command;

public class DeleteUserCommand {

    private final Long userId;

    public DeleteUserCommand(Long userId) {
        this.userId = userId;
    }

    // Getter
    public Long getUserId() {
        return userId;
    }
}
