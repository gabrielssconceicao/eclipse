package structures;

import java.util.Stack;

public class Stacks {
  public static void main(String[] args) {
    /*
     * stack - LIFO data structure
     * last in, first out
     * push() to add to the top
     * pop() to remove from the top
     */

    Stack<String> stack = new Stack<String>();

    System.out.println(stack.isEmpty());
    stack.push("Minecraft");
    stack.push("Skyrim");
    stack.push("Fallout");
    stack.push("Diablo");
    stack.push("Warcraft");

    System.out.println(stack);
    System.out.println("Last item: " + stack.peek() + "\n\n");
    System.out.println(stack.search("Skyrim"));

    stack.pop();
    stack.pop();
    String item = stack.pop();

    System.out.println(item);
    System.out.println(stack);
    System.out.println("Last item: " + stack.peek() + "\n\n");

    System.out.println();

    /*
     * Uses:
     * 1. undo/redo features in text editors
     * 2. moving back/forward in browser history
     * 3. backtracking algorithms (maze,file directory)
     * 4. calling functions (call stack)
     */

  }
}
