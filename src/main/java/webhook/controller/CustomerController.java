package webhook.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import webhook.model.CustomerModel;
import webhook.service.CustomerService;

@Path("/customer")
public class CustomerController {

	@EJB
	CustomerService customerService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<CustomerModel> findAll() throws IOException {
		return customerService.findAll();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response save(CustomerModel customerModel) throws IOException {
		CustomerModel savedCustomer = customerService.save(customerModel);
		return Response.status(Response.Status.CREATED).entity(savedCustomer).build();
	}

}
