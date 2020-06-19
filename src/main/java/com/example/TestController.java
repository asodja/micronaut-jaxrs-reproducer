package com.example;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import io.micronaut.http.HttpStatus;

@Path("/test")
public class TestController {

    @POST
    public HttpStatus index(@HeaderParam("header") String header) {
        return HttpStatus.OK;
    }
}