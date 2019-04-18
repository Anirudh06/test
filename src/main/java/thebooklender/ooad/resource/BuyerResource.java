package thebooklender.ooad.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import thebooklender.ooad.business.BuyerService;
import thebooklender.ooad.models.BuyerInfoModel;
import thebooklender.ooad.models.LoginModel;
import thebooklender.ooad.models.SignUpModel;

@Path("buyer")
public class BuyerResource {
	private BuyerService buyerService=new BuyerService();
	@POST
	@Path("login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public BuyerInfoModel login(LoginModel loginObj) {
		System.out.println("b");
		return buyerService.validateLogin(loginObj);
	}
	@POST
	@Path("signup")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public boolean signUp(SignUpModel signUpObj) {
		//System.out.println(signUpObj);
		return buyerService.signUp(signUpObj); 
	}
	@POST
	@Path("validate")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public boolean validate(String email) {
		System.out.println(email);
		boolean b=buyerService.validate(email); 
		System.out.println("validate");
		return b;
	}
}
