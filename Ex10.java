import java.util.Scanner;
public class Ex10 {
    //! Write a Java program to print the area and perimeter of a circle.
    //? Test Data: Radius = 7.5
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius =input.nextDouble();
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The area of the circle is: " + area);
        System.out.println("The perimeter of the circle is: " + perimeter);
        
        

    
}
}