package com.example.myapp.User.resolver;

import com.example.myapp.User.aggregate.User;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import org.springframework.beans.factory.annotation.Autowired;

@DgsComponent
public class UserResolver {

    @DgsQuery
    public void getUser(@InputArgument("id") Long id) {
        System.out.println("id: " + id);
    }
}
