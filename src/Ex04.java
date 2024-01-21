import java.util.Scanner;

public class Ex04 extends Exercise {
  public Ex04() {
    super("Ex04: Pyramid of Numbers", "Insira um inteiro positivo!");
  }

  public void execute(Scanner input) {
    int number = input.nextInt();
    if (number <= 0) {
      System.out.println("Poxa, você não sabe brincar...");
      return;
    }

    for (int i = 1; i <= number; i++) {
      String line = String.valueOf(i).repeat(i);
      System.out.println(line);
    }
  }
}
