package thebooklender.ooad.models;
import java.util.ArrayList;

public class ItemInfo {

	private int id;
	private String book_id;
	private String tittle;
	private int owner_id;
	private String author;
	private String isbn;
	private String category;
	private String image;
	private String publisher;
	private String description;	
	public ItemInfo()
	{
		
	}
	
	public ItemInfo(int id, String book_id, String tittle, int owner_id, String author, String isbn, String category,
			String image, String publisher, String description) {
		super();
		this.id = id;
		this.book_id = book_id;
		this.tittle = tittle;
		this.owner_id = owner_id;
		this.author = author;
		this.isbn = isbn;
		this.category = category;
		this.image = image;
		this.publisher = publisher;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBook_id() {
		return book_id;
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public int getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ItemInfo [id=" + id + ", book_id=" + book_id + ", tittle=" + tittle + ", owner_id=" + owner_id
				+ ", author=" + author + ", isbn=" + isbn + ", category=" + category + ", image=" + image
				+ ", publisher=" + publisher + ", description=" + description + "]";
	}

	

}
