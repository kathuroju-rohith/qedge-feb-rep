  import java.util.Scanner;

public class HelloWorld {

 Added new version 2 start
	
	public class Main {
  public static void main(String[] args) {
    String firstName = "John ";
    String lastName = "Doe";
    String fullName = firstName + lastName;
    System.out.println(fullName);  
  }
}

# New Version_1 update Star
  
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


