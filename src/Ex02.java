import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ex02 extends Exercise {
  public Ex02() {
    super("Ex02: Fibonacci Sequence",
        "This program calculates the Fibonacci sequence",
        "Enter the size of Fibonacci sequence");
  }

  public void execute(Scanner input) {
    int size = input.nextInt();

    List<Integer> lastResults = new LinkedList<>();
    System.out.println("--------------------");

    lastResults.add(0);
    System.out.print(0 + " ");
    lastResults.add(1);
    System.out.print(1 + " ");

    for (int i = 2; i < size; i++) {
      lastResults.add(lastResults.get(0) + lastResults.get(1));
      lastResults.remove(0);
      System.out.print(lastResults.get(1) + " ");
    }
    System.out.println();
  }
}
