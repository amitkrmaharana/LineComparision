import java.util.Scanner;
import java.lang.Math;
public class lineComparision {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation Program");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values of the Co-ordinates for 2 lines as follows: x1 y1 x2 y2 for line1 as well as for line2");
		double line1_x1 = scan.nextDouble();
		double line1_y1 = scan.nextDouble();
		double line1_x2 = scan.nextDouble();
		double line1_y2 = scan.nextDouble();
		double line2_x1 = scan.nextDouble();
                double line2_y1 = scan.nextDouble();
                double line2_x2 = scan.nextDouble();
                double line2_y2 = scan.nextDouble();
                double length_line1 = Math.sqrt(Math.pow((line1_x2-line1_x1),2) + Math.pow((line1_y2-line1_y1),2));
		double length_line2 = Math.sqrt(Math.pow((line2_x2-line2_x1),2) + Math.pow((line2_y2-line2_y1),2));
		if (length_line1 == length_line2)
			System.out.println("Both lines have equal lengths");
		else if (length_line1 > length_line2)
			System.out.println("Length of line1 with length "+length_line1+" is GREATER than Length of line2 with length "+length_line2);
		else
			System.out.println("Length of line1 with length "+length_line1+" is LESSER than Length of line2 with length "+length_line2);
	}
}
