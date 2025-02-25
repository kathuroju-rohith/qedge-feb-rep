import java.util.Scanner;

public class HelloWorld {

# New Version_1 update Start

	public static void main(String[] args) {

        // Creates a reader instance which takes

   // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
 
#New Version_2 end
 
 int number = reader.nextInt();

        // println() prints the following line to the output screen
        System.out.println("You entered: " + number);
    }
}


