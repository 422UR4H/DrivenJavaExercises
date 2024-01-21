import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Exercise> exercises = new ArrayList<>();
        exercises.add(new Ex01());
        exercises.add(new Ex02());

        System.out.println("Hello, World!");
        System.out.println("This program runs Java exercises. Choose which one you want to run (ctrl+c to exit):");

        try {
            while (true) {
                for (int i = 0; i < exercises.size(); i++) {
                    System.out.println("[" + (i + 1) + "]" + exercises.get(i).getName());
                }
                Exercise exercise = getExerciseByInput(input, exercises);
                exercise.printMessages();
                exercise.execute(input);

                System.out.println("");
            }
        } catch (Exception e) {
            System.err.println(e);
            System.out.println("Ops! invalid input");
        }
        input.close();
    }

    private static Exercise getExerciseByInput(Scanner input, ArrayList<Exercise> exercises) {
        try {
            int number = input.nextInt();
            return exercises.get(number - 1);
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("Invalid input number. Set 1, 2, etc.");
            return getExerciseByInput(input, exercises);
        }
    }
}
