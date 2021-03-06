package com.mycompany.beanvaljersey2;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("person")
public class PersonService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        return Response.ok(new Person("dick", 41)).build();
    }
    
//    @GET
//    @Path("id")
//    public Response getPerson(@QueryParam("age") @NotNull Integer age) {
//         return Response.ok(new Person("jeff", 38)).build();
//    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response post(@Valid Person p) {
        System.out.println("Person: " + p);

//        try {
//            MyObjectMapperProvider.createDefaultMapper().writeValue(System.out, p);
//        } catch (IOException ex) {
//            System.err.println("FAiled to write output");
//        }
        return Response.ok(p).build();

    }
}
