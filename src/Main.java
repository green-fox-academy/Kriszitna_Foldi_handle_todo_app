import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    if (args[0].equals("help")) {
      System.out.println("-l List all the tasks");
      System.out.println("-a Adds a new task");
      System.out.println("-r Removes an task");
      System.out.println("-c Complets an task");
    }

    if (args[0].equals("-l")){
      listTasks();
    }
    }
    public static void listTasks(){
    List<String> tasks = new ArrayList<String>();
    tasks.add("Walk the dog");
    tasks.add("Buy milk");
    tasks.add("Do homework");
      for (int i = 1; i < tasks.size() + 1; i++) {
        System.out.println(i + " - " + tasks.get(i-1));
      }

    }


}

