import java.util.Queue;
import java.util.LinkedList;
//first in first out
public class que{
   public static void main(String[] args){
      //queue
      //important is seeing them and taking them out
      Queue<String> bbqLine = new LinkedList<String>();
      
      //adding
      bbqLine.add("Jackson");
      bbqLine.add("Tyrone");
      bbqLine.add("Susan");
      
      //removing - taking out of line
      /*
      bbqLine.poll();//removes jackson
      bbqLine.poll();//removes Tyrone
      bbqLine.poll();//removes Susan
      */
      
      //return the element
      System.out.println(bbqLine.poll());
      
      //see whats next
      System.out.println(bbqLine.peek());
      
      //prints whole thing
      System.out.println(bbqLine);
      
      System.out.println();
      
      Queue<String> q = new LinkedList<String>();
      q.add("A");
      q.add("B");
      q.add("C");
      
      //show length
      System.out.println(q.size());
      //check if it has
      System.out.println(q.contains("C"));
      //convert to array
      System.out.println(q.toArray()[1]);
      
   }
}