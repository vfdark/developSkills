import java.util.Scanner;
public class Ex12 {
    //! Write a java program to print the area and perimeter of a rectangle.
    //? Test Data: width =  5.5 , height = 8.5
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the width of the rectangle");
        double width = input.nextDouble();
        System.out.println("enter the height of the rectangle");
        double height = input.nextDouble();
        double area = width*height;
        double perimeter = 2*(width+height);
        System.out.println("the area of the rectangle is "+area);
        System.out.println("the perimeter of the rectangle is "+perimeter);


    
}
}
