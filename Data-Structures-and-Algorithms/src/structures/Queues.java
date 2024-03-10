package structures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
  /*
   * queue - FIFO data structure
   * first in, first out
   * A collection designed for holding elements prior to processing.
   * Linear data structure
   * 
   * add = enqueue, offer
   * remove = dequeue, poll
   * 
   * Where use?
   * 1. keyboard Buffer (letters should appear on the screen in order they were
   * pressed)
   * 2. Printer Queue (print jobs in order they are received)
   * 3. Used in LinkedList, PriorityQueue, Breadth-First Search
   */
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<String>();

    System.out.println(queue.isEmpty());

    queue.offer("Karen");
    queue.offer("John");
    queue.offer("Jane");
    queue.offer("Harold");

    System.out.println(queue.isEmpty());
    System.out.println(queue.size());
    System.out.println(queue.contains("Harold"));
    System.out.println(queue);

    // System.out.println(queue.poll());
    // queue.poll();
    // queue.poll();
    // System.out.println(queue);
  }
}
