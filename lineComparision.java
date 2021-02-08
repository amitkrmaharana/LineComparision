import java.util.Scanner;
import java.lang.Math;
public class lineComparision {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation Program");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values of the Co-ordinates as follows: x1 y1 x2 y2");
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double length = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		System.out.println("Length of the line formed between the two co-ordinates is: " +length);
	}
}
