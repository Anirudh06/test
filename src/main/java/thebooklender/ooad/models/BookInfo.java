package thebooklender.ooad.models;

public class BookInfo {
	private String book_id;
	private String title;
	private String author;
	private String publisher;
	private String description;
	private String isbn;
	private String available;
	private String image;
	private String category;
	private String owner_id;
	
	public BookInfo()
	{
		
	}

	public BookInfo(String book_id, String title, String author, String publisher, String description, String isbn,
			String available, String image, String category,String owner_id) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.description = description;
		this.isbn = isbn;
		this.available = available;
		this.image = image;
		this.category = category;
		this.owner_id=owner_id;
	}



	public String getBook_id() {
		return book_id;
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(String owner_id) {
		this.owner_id = owner_id;
	}

	@Override
	public String toString() {
		return "BookInfo [book_id=" + book_id + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", description=" + description + ", isbn=" + isbn + ", available=" + available + ", image=" + image
				+ ", category=" + category + ", owner_id=" + owner_id + "]";
	}

	
	
	
	
}
