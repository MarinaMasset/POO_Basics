
public class Book {

	private String author;
	private String title;

	Book (String title, String author) {
		this.title = title;
		this.author = author;
		System.out.println("Le livre "+title+" a été écrit par "+author);
	}
}
