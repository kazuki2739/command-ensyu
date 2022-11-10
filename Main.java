public class Main{
	public static void main(String[] args){
		double i = 3.24;
		double s = 78.0;
		double bmi = s / i;
		double r = (Math.round(bmi * 100)) /100;
		System.out.println(r);
	}
}
