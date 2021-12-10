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
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response login(Users user) throws URISyntaxException{
        int val = new UserService().login(user);
        if (val != -1)
            return Response.ok().entity(val).build();
        else
            return Response.status(404).entity("Invalid Username or password").build();
    }

    @GET
    @Path("/get_salary_info")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public Response getSalaryInfo(String u_id) throws URISyntaxException{
        Users user = UserService.getSalaryInfo(u_id);
        if (user==null)
            return Response.noContent().build();
        else
            return Response.ok().entity(user).build();
    }
}
