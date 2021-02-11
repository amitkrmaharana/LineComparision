import java.lang.Math;

class Compare {
	public void compareTo(double len_line1, double len_line2) {
        if (len_line1 > len_line2)
                System.out.println("Length of line 1 is greater than Length of line 2");
        else if (len_line1 < len_line2)
                System.out.println("Length of line 1 is lesser than Length of line 2");
        else
                System.out.println("Both lines are equal");
        System.out.println("Length of line1 is "+len_line1);
        System.out.println("Length of line2 is "+len_line2);
	}
}

public class LineComparision {
	private final double x1;
	private final double y1;
	private final double x2;
	private final double y2;

	public LineComparision(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation Program");
		LineComparision line1 = new LineComparision(5.5, 2.9, 3.6, 5.8);
		LineComparision line2 = new LineComparision(9.4, 4.7, 5.2, 8.2);
        	double length_line1 = Math.sqrt(Math.pow((line1.x2-line1.x1),2) + Math.pow((line1.y2-line1.y1),2));
		double length_line2 = Math.sqrt(Math.pow((line2.x2-line2.x1),2) + Math.pow((line2.y2-line2.y1),2));
		Compare comparision = new Compare();
		comparision.compareTo(length_line1, length_line2);
	}
}
