import java.util.Scanner;

public class Ex03 extends Exercise {
  public Ex03() {
    super("EX03: Tabuada", "Insira um número para ver sua tabuada!");
  }
  public void execute(Scanner input) {
    int number = input.nextInt();

    System.out.println("Tabela de multiplicação por " + number);
    for (int i = 1; i <= 10; i++) {
      System.out.println(number + " x " + i + " = " + number * i);
    }
  }
}
