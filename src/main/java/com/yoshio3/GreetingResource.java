package com.yoshio3;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-resteasy")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        foo();
        return "Hello RESTEasy";
    }

    private void foo(){
        var fruits = Arrays.asList("apple","lemon", "orange");

        Person person = new Person();
        person.setName("Yoshio");
        String name = person.getName();

        System.out.println(name);
    }

    private void bar(){
        System.out.println("Hello World 2");
    }

}