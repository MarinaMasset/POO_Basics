
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
	
	
	public static replaceWithStar(String str, int n) {
		StringBuilder sb = new StringBuilder();

	    for(int i=0, n=str.length;i<n;i++){
	        if(i%n!=0) {
	            sb.append("*");
	        else {
	            sb.append(str.charAt(i));
	        }
	     }
	     return sb.toString();
	}
}
