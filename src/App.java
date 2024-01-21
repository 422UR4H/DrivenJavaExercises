import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Exercise> exercises = new ArrayList<>();
        exercises.add(new Ex01());
        // Map<String, Exercise> exerciseMap = new HashMap<String, Exercise>();
        // exerciseMap.put(Ex01.getName(), new Ex01());

        // exerciseMap.put(Ex02.getName(), new Ex02());
        // exerciseMap.put(Ex03.getName(), new Ex03());
        // exerciseMap.put(Ex04.getName(), new Ex04());
        // exerciseMap.put(Ex05.getName(), new Ex05());

        System.out.println("Hello, World!");
        System.out.println("This program runs Java exercises. Choose which one you want to run:");

        try {
            // for (int i = 0; i < 6; i++) {

            // }
            Exercise ex = exercises.get(0);
            System.out.println(ex.getName());
            for (int i = 0; i < ex.getMessagesSize(); i++) {
                System.out.println(ex.getMessage(i));
            }
            ex.execute(input);
        } catch (Exception e) {
            System.out.println(e);
            System.err.println("Ops! Entrada inválida"); // Não insira vírgulas
        }

        input.close();
    }
}
