import java.util.Scanner;

public class Ex02_Recursive extends Exercise {
  public Ex02_Recursive() {
    super("Ex02_Recursive",
        "Welcome to recursive Ficonacci calculator!",
        "Insert the size of the Fibonacci Sequence!");
  }

  public void execute(Scanner input) {
    int size = input.nextInt();

    System.out.print(0 + " ");
    fibonacci(size, 0, 1);
    System.out.println();
  }

  private static void fibonacci(int size, int arg1, int arg2) {
    if (size <= 1) {
      return;
    }
    size--;
    System.out.print(arg2 + " ");

    fibonacci(size, arg2, arg1 + arg2);
  }
}
