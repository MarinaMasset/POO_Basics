
public class Main {

	public static void main(String[] args) {
		countCharacters("Hello everyone!");
		displayLowerAndUpperCase("Hello everyone!");
		replaceWithStar("Hello everyone!");
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
