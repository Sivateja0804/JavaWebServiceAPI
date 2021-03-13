package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ctofservice")
public class CtoFService {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Product convertCtoF() {
		Product product=new Product();
		Double fahrenheit;
		Double celsius = 36.8;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		product.setFarheniet(fahrenheit);
		return product;
	}
 
	@Path("{c}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Product convertCtoFfromInput(@PathParam("c") Double c) {
		Double fahrenheit;
		Double celsius = c;
		fahrenheit = ((celsius * 9) / 5) + 32;
		Product product=new Product();
		product.setFarheniet(fahrenheit);
		return product;
	}
}
