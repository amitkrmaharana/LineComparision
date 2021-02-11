import java.util.Scanner;
import java.lang.Math;
import java.util.Collections;
public class LineComparision {
	public void comparing(double len_line1, double len_line2) {
                Double line1 = Double.valueOf(len_line1);
                Double line2 = Double.valueOf(len_line2);
                double compare = line1.compareTo(line2);
                if (compare > 0)
                        System.out.println("Length of line 1 is greater than Length of line 2");
                else if (compare < 0)
                        System.out.println("Length of line 1 is lesser than Length of line 2");
                else
                        System.out.println("Both lines are equal");
                System.out.println("Length of line1 is "+len_line1);
                System.out.println("Length of line2 is "+len_line2);

	}
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
		LineComparision comparision = new LineComparision();
		comparision.comparing(length_line1, length_line2);
	}
}
