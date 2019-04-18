package thebooklender.ooad.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import thebooklender.ooad.business.BuyerService;
import thebooklender.ooad.models.BuyerInfoModel;
import thebooklender.ooad.models.ItemInfo;
import thebooklender.ooad.models.LoginModel;
import thebooklender.ooad.models.SignUpModel;
import thebooklender.ooad.models.BookInfo;
import thebooklender.ooad.business.BookService;



	@Path("book")
	public class BookResource {
		private BookService bookService = new BookService();

		@POST
		@Path("addbook")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.TEXT_PLAIN)
		public boolean signUp(BookInfo bookinfo) {
			// System.out.println(signUpObj);
			return bookService.addbook(bookinfo);
		}
		
		@GET
		@Path("particularItem/{bookId}")
		@Produces(MediaType.APPLICATION_JSON)
		public List<BookInfo> getParticularItem(@PathParam("bookId") int bookId) {
			System.out.println("a");
			return bookService.getParticularItem(bookId);
		}
		
		@GET
		@Path("ownerItem/{ownerId}")
		@Produces(MediaType.APPLICATION_JSON)
		public List<ItemInfo> getOwnerItem(@PathParam("ownerId") int ownerId) {
			System.out.println("a");
			return bookService.getOwnerItem(ownerId);
		}
		@GET
		@Path("getRequestedItempending/{ownerId}")
		@Produces(MediaType.APPLICATION_JSON)
		public List<ItemInfo> getRequestedItempending(@PathParam("ownerId") int ownerId) {
			System.out.println("a");
			return bookService.getRequestedItempending(ownerId);
		}	
		
		@GET
		@Path("getRequestedItemaccepted/{ownerId}")
		@Produces(MediaType.APPLICATION_JSON)
		public List<ItemInfo> getRequestedItemaccepted(@PathParam("ownerId") int ownerId) {
			System.out.println("a");
			return bookService.getRequestedItemaccepted(ownerId);
		}
		
		@GET
		@Path("requestedPendingme/{ownerId}")
		@Produces(MediaType.APPLICATION_JSON)
		public List<ItemInfo> requestedPendingme(@PathParam("ownerId") int ownerId) {
			System.out.println("a");
			return bookService.requestedPendingme(ownerId);
		}
		@GET
		@Path("requestedAcceptedme/{ownerId}")
		@Produces(MediaType.APPLICATION_JSON)
		public List<ItemInfo> requestedAcceptedme(@PathParam("ownerId") int ownerId) {
			System.out.println("a");
			return bookService.requestedAcceptedme(ownerId);
		}
}
