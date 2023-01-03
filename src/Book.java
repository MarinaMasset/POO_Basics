
public class Book {

	private String title;
	private String authorName;
	private String authorFirstName;
	private String category;
	private String isbn;

	Book(String title, String authorFirstName, String authorName, String category, String isbn) {
		this.title = title;
		this.authorName = authorName;
		this.authorFirstName = authorFirstName;
		this.category = category;
	}
}
