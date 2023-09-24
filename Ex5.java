import java.util.Scanner;

public class Ex5 {
    // ! Write a java program that takes two numbers as input and displays the
    // product of two numbers.
    // ? Test Data: input first num = 25, input second num = 5
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the first Number:");
            int FirstNum = input.nextInt();
            System.out.println("Enter the sec number:");
            int SecNum = input.nextInt();
            int answer = FirstNum * SecNum;
            System.out.println("the answer is  " + answer);
        }

    }
}
