import java.util.Scanner;

public class HelloWorld {

	##Adding New Feature202 Version 1
	
	public class Main {

  public static void main(String[] args) {

    int num = 33, i = 2;
    boolean flag = false;
    
    // 0 and 1 are not prime numbers
    if (num == 0 || num == 1) {
        flag = true;
    }
    
    while (i <= num / 2) {

      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }

      ++i;
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}

##End of New feature 202 version 1
	
	
	public static void main(String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();

        // println() prints the following line to the output screen
        System.out.println("You entered: " + number);
    }
}
