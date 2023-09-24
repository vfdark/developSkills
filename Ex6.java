import java.util.Scanner;
public class Ex6 {
    //! Write a java program to print the sum, multiply, subtract, divide, remainder of two numbers.
    //? Test Data input first num = 125
    //? sec Num = 24
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the First Number :");
            int FirstNum = input.nextInt();
            System.out.println("Enter the second number: ");
            int SecNumber = input.nextInt();
            System.out.println(FirstNum + " + " + SecNumber +"  = " +(FirstNum + SecNumber));
            System.out.println(FirstNum + " - " + SecNumber + " = " +(FirstNum - SecNumber));
            System.out.println(FirstNum + " x " + SecNumber + " = " +(FirstNum * SecNumber));
            System.out.println(FirstNum + " / " + SecNumber + " = " +(FirstNum / SecNumber));
            System.out.println(FirstNum + " mod " + SecNumber + " = " +(FirstNum% SecNumber));
        }



    
}
}
