package pagarme.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pagarme.dao.OrderDao;
import pagarme.model.OrderModel;
import pagarme.model.WebhookModel;

@Path("/order")
public class OrderController {

	@EJB
	OrderDao orderService;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response index() {
		return Response.ok("Order").build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response save(WebhookModel webhookModel) throws IOException {
		OrderModel savedOrder = orderService.save(webhookModel.getData());
		return Response.status(Response.Status.CREATED).entity(savedOrder).build();
	}

}
