import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of rectangle ");
        double length = input.nextDouble();

        System.out.print("Enter width of rectangle ");
        double width = input.nextDouble();

        // Calculate area
        double area = length * width;

             System.out.println("Area of the rectangle is " + area);
        
        input.close(); 
    }
}
