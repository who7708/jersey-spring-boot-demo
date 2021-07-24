package com.example.jersey.demo;

import com.example.jersey.demo.v1.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

@Path("v1")
@Component
public class ApiV1 {

    @Autowired
    UserResource userResource;

    @Path("users")
    public UserResource getUserResource() {
        return userResource;
    }
}
