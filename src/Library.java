
public class Library {
	
	public static void displayBook(String title, String authorFirstName, String authorName, String category, String isbn) {
		Book harryPotter = new Book("Harry Potter", "JK", "Rowling", "Fantastique", "2070584623");
		Book lordOfTheRing = new Book("Lord of the Ring", "JRR", "Tolkien", "Fantastique", "0261102354");
		System.out.println("Le livre "+title+" a été écrit par "+authorFirstName+" "+authorName+" et appartient au genre fantastique"+". Son code est : "+authorName.substring(0,2).toUpperCase()+authorFirstName.substring(0,2).toUpperCase()+category.substring(0,1)+isbn.substring(8,10)+".");
	}
}
