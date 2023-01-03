
public class Maths {
	private double nb1;
	private double nb2;

	public void add(double nb1, double nb2) {
		double result = nb1+nb2;
		System.out.println("Le résultat de "+nb1+" + "+nb2+" est "+result);
	}
	
	public void substract(double nb1, double nb2) {
		double result = nb1-nb2;
		System.out.println("Le résultat de "+nb1+" - "+nb2+" est "+result);
		}
	
	public void multiply(double nb1, double nb2) {
		double result = nb1*nb2;
		System.out.println("Le résultat de "+nb1+" x "+nb2+" est "+result);
	}
	
	public void divide(double nb1, double nb2) {
		double result = nb1/nb2;
		System.out.println("Le résultat de "+nb1+" ÷ "+nb2+" est "+result);
	}
}
