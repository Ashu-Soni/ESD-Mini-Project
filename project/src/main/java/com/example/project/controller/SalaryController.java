package com.example.project.controller;

import com.example.project.Service.SalaryService;
import com.example.project.bean.Salaries;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;

@Path("salaries")
public class SalaryController {

    @GET
    @Path("/get_salary_info")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public Response getSalaryInfo(String u_id) throws URISyntaxException{
        Salaries salary = SalaryService.getSalaryInfo(u_id);
        if (salary==null)
            return Response.noContent().build();
        else
            return Response.ok().entity(salary).build();
    }
}
