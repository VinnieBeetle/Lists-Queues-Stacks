
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListExamples{
   public static void main(String[] args){
      
      List<String> myList = new ArrayList<String>();
      
      //adds to the end of the list
      //If not using generics <> i could add what ever data type
      myList.add("Object 1");//0
      myList.add("Objesct 2");//1
      myList.add("Object 3");//2
      
      System.out.println(myList);
      //remove object 3
      myList.remove(2);
      System.out.println(myList);
      
      System.out.println(myList.get(0));
      System.out.println(myList.size());
      
      System.out.println();
      
      //1st way to iterate (old)
      //runs thru em
      Iterator iterator = myList.iterator();
      while(iterator.hasNext()){
         Object next = iterator.next();
         System.out.println(next);
      }
      
       System.out.println();
      
      //2nd way - for loop
      for(Object next : myList){
         System.out.println(next);
      }
      
      System.out.println();
      //3rd way
      //fast for arrya list but slow for linked list
      for (int i = 0; i < myList.size(); i++){
          System.out.println(myList.get(i));
      }
      
      
      
      
      //removes all of it
      myList.clear();
      
      
   }
}