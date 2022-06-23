import java.util.Stack;

//last in first out
public class Stacks{
   public static void main(String[] args){
      
      Stack<String> games = new Stack<String>();
      
      games.add("COD");// on the bottom
      games.add("Hitman");
      games.add("Valorant");// on top
      
      //to look at very top, you peek (doesn't remove it from the stack)
      System.out.println(games.peek());
      ////pop off what ever is on top
      System.out.println(games.pop());
      System.out.println(games);
      
      System.out.println();
      
      Stack<Character> tower = new Stack<Character>();
      
      tower.add('R');
      tower.add('B');
      tower.add('Y');
      
      //peek sees from top
      System.out.println(tower.peek());
      //change 
      System.out.println(tower.set(0, 'P'));
      System.out.println(tower);
      //check if it has
      System.out.println(tower.contains('O'));
      //see size
      System.out.println(tower.size());
      //check if empty
      System.out.println(tower.empty());
      //reveive from index (bot to top)
      System.out.println(tower.get(1));
      
      
   }
}