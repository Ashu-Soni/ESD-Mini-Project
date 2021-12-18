package com.example.project.controller;

import com.example.project.Service.SalaryDBService;
import com.example.project.bean.SalaryDB;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.List;

@Path("/salaryDB")
public class SalaryDBController {

    @GET
    @Path("/get_all_salaries/{user_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllSalaries(@PathParam("user_id") int u_id) throws URISyntaxException{
        System.out.println(u_id);
        List<SalaryDB> salaries = SalaryDBService.getSalaries(u_id);
        if (salaries==null)
            return Response.noContent().build();
        else
            return Response.ok().entity(salaries).build();
    }
}
