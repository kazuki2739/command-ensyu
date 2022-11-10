import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		double height = (double)s.nextInt();
		double i = (height / 100) * (height / 100);
		double weight = (double)s.nextInt();
		double bmi = weight / i;
		double r = (Math.round(bmi * 100)) /100;
		System.out.println(r);
		
                double height2 = (double)s.nextInt();
                double u = (height2 / 100) * (height2 / 100);
                double weight2 = (double)s.nextInt();
                double bmi2 = weight2 / u;
                double r2 = (Math.round(bmi2 * 100)) /100;
                System.out.println(r2);

	}
}
