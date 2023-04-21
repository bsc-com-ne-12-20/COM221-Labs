import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the coordinates of the first point
        System.out.print("Enter x-coordinate of first point: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y-coordinate of first point: ");
        double y1 = scanner.nextDouble();
        
        // Get user input for the coordinates of the second point
        System.out.print("Enter x-coordinate of second point: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y-coordinate of second point: ");
        double y2 = scanner.nextDouble();
        
        // Create two Point objects using user input
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        
        // Compute the distance between the two points
        double distance = p1.distance(p2);
        
        // Print the result
        System.out.println("The distance between the two points is: " + distance);
        
        scanner.close();
    }
}
