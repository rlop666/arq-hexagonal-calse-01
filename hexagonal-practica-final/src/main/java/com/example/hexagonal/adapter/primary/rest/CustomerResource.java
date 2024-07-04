package com.example.hexagonal.adapter.primary.rest;

import com.example.hexagonal.domain.entity.Customer;
import com.example.hexagonal.domain.entity.Order;
import com.example.hexagonal.domain.service.CustomerService;
import com.example.hexagonal.domain.service.OrderService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.Optional;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @Inject
    CustomerService customerervice;

    @POST
    public Response createOrder(Customer customer) {
        customerervice.createCustomer(customer);
        return Response.status(Response.Status.CREATED).entity(customer).build();
    }

    @GET
    public List<Customer> getAllOrders(){
        return customerervice.getAllCustomers();
    }

    @GET
    @Path("/{customerId}")
    public Optional<Optional<Customer>> getOrderById(@PathParam("customerId") Long customerId) {
        return customerervice.getCustomer(customerId);
    }
}
