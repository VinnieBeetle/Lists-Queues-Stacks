
import java.util.*;

public class PrioQue{
   public static void main (String[] args){
      //Priority Queue = A First in First serve that serves higher priorities elements 
      //before elements with lower prioroities
      
      //Queue<Double> queue = new LinkedList<>();
      //normally descends bu the collects reverese it
      //PriorityQueue<>(a comparator goes in here) but we are using a default on
      Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
      
      //offer and add are alike except off throws t/f if adition is made
      queue.offer(3.8);
      queue.offer(2.5);
      queue.offer(3.2);
      queue.offer(1.5);
      queue.offer(4.0);
      
      Queue<Double> queue2 = new PriorityQueue<>(Collections.reverseOrder());
      queue2.offer(1.9);
      queue2.offer(3.5);
      
      queue.addAll(queue2);
      
      //prints firstcome first serve if as a Linked list
      //but as a PriorityQueue it puts em in order
      while(!queue.isEmpty()){
         System.out.println(queue.poll());
         
      }
      
      System.out.println();
      
      while(!queue2.isEmpty()){
         System.out.println(queue2.poll());
         
      }
      
      System.out.println();
      
      //alphabetical order
      //normally a first but this reverses starting with z
      Queue<String> queueAlph = new PriorityQueue<>(Collections.reverseOrder());
      queueAlph.offer("B");
      queueAlph.offer("C");
      queueAlph.offer("A");
      queueAlph.offer("F");
      queueAlph.offer("D");
      
      while(!queueAlph.isEmpty()){
         System.out.println(queueAlph.poll());
         
      }
   }
   
}