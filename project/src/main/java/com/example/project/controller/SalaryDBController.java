package com.example.project.controller;

import com.example.project.Service.SalaryDBService;
import com.example.project.bean.SalaryDB;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.List;

@Path("salarydb")
public class SalaryDBController {

    @GET
    @Path("/get_all_salaries")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public Response getAllSalaries(String u_id) throws URISyntaxException{
        List<SalaryDB> salaries = SalaryDBService.getSalaries(u_id);
        if (salaries==null)
            return Response.noContent().build();
        else
            return Response.ok().entity(salaries).build();
    }
}
