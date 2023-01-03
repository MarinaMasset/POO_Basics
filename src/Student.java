
public class Student {
	private String firstname;
	private String surname;
	private double gradeMaths;
	private double gradeEnglish;
	private double gradeGeography;
	private double gradeLitterature;
	
	public void calculateAverage(double gradeMaths, double gradeEnglish, double gradeGeography, double gradeLitterature) {
		double result =  (gradeMaths + gradeEnglish + gradeGeography + gradeLitterature)/4;
		System.out.println("La moyenne de tes notes est de "+result);
	}
	
	public void displayInitials(String firstname, String surname) {
		System.out.println("Vos initiales sont : "+firstname.substring(0,1)+surname.substring(0,1));
	}
	
	public void displayTrigram(String firstname, String surname) {
		surname = surname.toUpperCase();
		System.out.println("Votre trigramme est : "+firstname.substring(0,1)+surname.substring(0,1)+surname.charAt(surname.length()-1));
	}
}
