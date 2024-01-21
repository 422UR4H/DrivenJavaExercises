import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex05 extends Exercise {
  public Ex05() {
    super("Ex05: No Duplicates!",
        "This program finds the same elements in 2 lists",
        "Insert empty <enter> to end each list");
  }

  public void execute(Scanner input) {
    ArrayList<String> list1 = new ArrayList<String>();
    ArrayList<String> list2 = new ArrayList<String>();

    // clean Scanner input buffer
    input.nextLine();

    System.out.println("Insert list 1:");
    String value = input.nextLine();
    while (!value.equals("")) {
      list1.add(value);
      value = input.nextLine();
    }

    System.out.println("Insert list 2:");
    value = input.nextLine();
    while (!value.equals("")) {
      list2.add(value);
      value = input.nextLine();
    }

    // optimizing with hashmap: O(n^2) -> O(n)
    Map<String, Boolean> hashmap1 = new HashMap<>();
    for (int i = 0; i < list1.size(); i++) {
      hashmap1.put(list1.get(i), true);
    }

    System.out.println("Print deduplicated values!");
    for (int i = 0; i < list2.size(); i++) {
      if (hashmap1.containsKey(list2.get(i))) {
        System.out.println(list2.get(i));
      }
    }
  }
}
