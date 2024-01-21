import java.util.ArrayList;
import java.util.Scanner;

public abstract class Exercise implements IExecutable {
  private String name;
  private ArrayList<String> messages = new ArrayList<String>();

  public Exercise(String name, String ...msgs) {
    this.name = name;

    for (int i = 0; i < msgs.length; i++) {
      this.messages.add(msgs[i]);
    }
  }

  public abstract void execute(Scanner input);

  public final String getName() {
    return this.name;
  }

  public final String getMessage(int i) {
    return messages.get(i);
  }

  public final int getMessagesSize() {
    return messages.size();
  }

  public final void setName(String name) {
    this.name = name;
  }

  public final void addMessage(String message) {
    this.messages.add(message);
  }
}
