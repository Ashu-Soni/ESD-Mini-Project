package com.example.project.controller;

import com.example.project.Service.UserService;
import com.example.project.bean.Users;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;

@Path("/users")
public class UserController {

    @POST
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response login(Users user) {
        int val = new UserService().login(user);
        System.out.println(val);
        if (val != -1)
            return Response.status(200).entity(val).build();
        else
            return Response.status(404).entity("Invalid Username or password").build();
    }

    @GET
    @Path("/get_salary_info/{user_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSalaryInfo(@PathParam("user_id") int u_id){
        System.out.println(u_id);
        Users user = UserService.getSalaryInfo(u_id);
        System.out.println(user);
        if (user==null)
            return Response.noContent().build();
        else
            return Response.ok().entity(user).build();
    }
}
