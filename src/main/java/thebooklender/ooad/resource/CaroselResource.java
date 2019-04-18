package thebooklender.ooad.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import thebooklender.ooad.business.CaroselService;
import thebooklender.ooad.models.ItemInfo;

@Path("carosel")
public class CaroselResource {
	private CaroselService caroselService=new CaroselService();
	@GET
	@Path("/getAllItemsForACategory/{cat}")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<ItemInfo> getAllItemsForACategory(@PathParam("cat") String cate ){
		System.out.println("all items for a category"+cate);
		return caroselService.getAllItemsForACategory(cate);
	}

}
