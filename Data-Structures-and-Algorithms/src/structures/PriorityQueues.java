package structures;

import java.util.*;

public class PriorityQueues {
  // Priority Queues = A FIFO data structure that serves elements
  // with the highest priorities first
  // before elements with lower priorities

  public static void main(String[] args) {
    Queue<String> queue = new PriorityQueue<String>(Collections.reverseOrder());

    queue.offer("B");
    queue.offer("C");
    queue.offer("A");
    queue.offer("F");
    queue.offer("D");
    queue.offer("E");

    System.out.println(queue);

    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }
  }
}
