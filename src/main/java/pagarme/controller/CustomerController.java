package pagarme.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pagarme.dao.CustomerDao;
import pagarme.model.CustomerModel;

@Path("/customer")
public class CustomerController {

	@EJB
	CustomerDao customerService;

	@GET
	@Path("{id:\\d+}")
	@Produces(MediaType.APPLICATION_JSON)
	public CustomerModel findById(@PathParam("id") String id) throws IOException {
		return customerService.findById(id);
	}

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
