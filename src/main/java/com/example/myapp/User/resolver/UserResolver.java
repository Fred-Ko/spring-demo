package com.example.myapp.User.resolver;

import com.example.myapp.User.aggregate.User;
import com.netflix.dgs.codegen.generated.DgsConstants;
import com.netflix.graphql.dgs.*;
import jakarta.validation.Valid;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;


@DgsComponent
public class UserResolver {

    @DgsQuery
    public void getUser(@InputArgument("id") Long id) {
        System.out.println("id: " + id);
    }

    @DgsMutation
    public User createUser(@NotNull @Valid DgsConstants.QUERY.GETUSER_INPUT_ARGUMENT input) {
        return User.builder().id(Long.parseUnsignedLong(input.Id)).email("123@naver.com").password("123").name("juno").build();
    }
}
