public class LineComparison{
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);
        Point point3 = new Point(1, 2);
        Point point4 = new Point(7, 8);

        Geometry line1 = new Geometry(point1, point2);
        Geometry line2 = new Geometry(point3, point4);

        double length1 = line1.calculateLength();
        System.out.println("UC1: Length of Line 1: " + length1);

        System.out.println("UC2: Line 1 equals Line 2: " + line1.equals(line2));

        int comparisonResult = line1.compareLength(line2);
        if (comparisonResult > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else if (comparisonResult < 0) {
            System.out.println("Line 1 is less than Line 2");
        } else {
            System.out.println(" Line 1 is equal to Line 2");
        }
    }
} 
    

