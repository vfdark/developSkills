import java.util.Scanner;
public class Ex11 {
    //! Write a java program that takes three numbers as input and print the average of the numbers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first num: ");
        double num1=input.nextInt();
        System.out.println("Enter the second num:");
        double num2=input.nextInt();
        System.out.println("Enter the third num:"); 
        double num3=input.nextInt();
        double sum=0;
        sum+= num1+num2+num3;
        double avg = sum/3;
        System.out.println("The average is: "+avg);
        

    
}
}
