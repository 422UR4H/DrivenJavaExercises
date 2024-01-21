import java.util.Scanner;

public class Ex01 extends Exercise {
  public Ex01() {
    super("Ex01: parity and signal",
        "This program returns if a number is even or odd, positive or negative",
        "Set a number");
  }

  public void execute(Scanner input) {
    int number = input.nextInt();

    if (number % 2 == 0) {
      System.out.print(number + " is pair");
    } else {
      System.out.print(number + " is odd");
    }
    if (number > 0) {
      System.out.println(" and positive.");
    } else if (number < 0) {
      System.out.println(" and negative.");
    } else {
      System.out.println(".");
    }
  }
}
