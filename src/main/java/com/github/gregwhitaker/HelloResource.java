package com.github.gregwhitaker;

import com.github.gregwhitaker.model.HelloResponse;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Simple Hello World Resource
 */
@Path("/hello")
public class HelloResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello(@DefaultValue("You") @QueryParam("name") String name) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        HelloResponse body = new HelloResponse();
        body.setCreateTime(sdf.format(new Date()));
        body.setMessage(String.format("Hello, %s!", name));

        return Response.ok(body)
                .encoding(MediaType.APPLICATION_JSON)
                .build();
    }
}