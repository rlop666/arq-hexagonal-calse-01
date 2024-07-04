package com.example.hexagonal.adapter.primary.rest;

import com.example.hexagonal.domain.entity.Order;
import com.example.hexagonal.domain.service.OrderService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.Optional;

@Path("/orders")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OrderResource {
    @Inject
    OrderService orderService;

    @POST
    public Response createOrder(Order order) {
        orderService.createOrder(order);
        return Response.status(Response.Status.CREATED).entity(order).build();
    }

    @GET
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GET
    @Path("/{orderId}")
    public Optional<Optional<Order>> getOrderById(@PathParam("orderId") Long orderId) {
        return orderService.getOrder(orderId);
    }


}