
public class Main {

	public static void main(String[] args) {
		countCharacters("Hello everyone!");
		displayLowerAndUpperCase("Hello everyone!");
		replaceWithStar("Hello everyone!");
		Library.displayBook("Lord of the Ring", "JRR", "Tolkien", "Fantastique", "0261102354");
		Triangle.calculatePerimeter(5.0, 5.0, 5.0);
		Triangle.calculateArea(5.0, 4.33);
	
		Maths operation = new Maths();
		operation.add(2, 3);
		operation.substract(2, 3);
		operation.multiply(2, 3);
		operation.divide(2, 3);
		Student StudentInfo = new Student();
		StudentInfo.calculateAverage(12, 8, 15, 13);
		StudentInfo.displayInitials("Marina", "Masset");
		StudentInfo.displayTrigram("Marina", "Masset");
	}
	
	public static void countCharacters(String str) {
		 int nbOfCharacters = str.length();
	     System.out.println("Nombre de caractères : " + nbOfCharacters);
	}

	public static void displayLowerAndUpperCase(String str) {
		String lowerCase = str.toLowerCase();
		String upperCase = str.toUpperCase();
		System.out.println(lowerCase+"\n"+upperCase);
	}
	
	
	public static void replaceWithStar(String str) {
		StringBuilder newString = new StringBuilder();

	    for(int i=0; i<str.length(); i++){
	        if(i%2!=0) {
	        	newString.append("*");
	        }
	        else {
	        	newString.append(str.charAt(i));
	        }
	     }
	     System.out.println(newString.toString());
	}
}
