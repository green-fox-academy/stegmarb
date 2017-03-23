/**
 * Created by stegmarb on 2017. 03. 23..
 */
public class TodoPrint {
  public static void main(String[] args) {
    String todoText = " - Buy milk\n";
    String[] textParts = {"My todo:\n", " - Download games\n","     - Diablo\n"};
    todoText = textParts[0] + todoText + textParts[1] + textParts[2];


    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected outpt:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    System.out.println(todoText);
    }
  }