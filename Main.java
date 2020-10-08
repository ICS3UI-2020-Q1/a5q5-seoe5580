import java.util.Scanner;
/**
 * This program will create an x amount of star depending on the user's choice
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user to input a number between 1 ~ 10
    System.out.println("Please enter a number between 1 and 10");

    // Gets the number from the user
    int num = input.nextInt();

    // using the for loop it will type "* " until the 1 number before
    for(int i = 1; i < num; i++){
      System.out.print("* ");
    }
    // This will get rid of the space after the * for the last loop
    System.out.print("*");
  }
}
