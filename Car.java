//comparable -- whatever that means
import java.util.ArrayList;
import java.util.Collections;

public class Car implements Comparable<Car>{
   
   private String name;
   private int id;
   
   public Car(String name, int id){
      this.name = name;
      this.id = id;
      
   }
   
   public int getId(){
      return id;
   }
   
   
   
   //override      
   public int compareTo(Car o){
      if(this.getId() == o.getId())
         return 0;
      //if you flip the 1 and negative 1 they will flip the sorting
      else if (this.getId() > o.getId())
         return 1;
      else return -1;
      
      
   }
   
   public static void main(String[] args){
      
      Car c1 = new Car("BMW", 69);
      Car c2 = new Car("Volkswagon", 22);
      Car c3 = new Car("Buggy", 9999);
      
      
      
      ArrayList<Car> arr = new ArrayList<Car>();
      arr.add(c1);
      arr.add(c2);
      arr.add(c3);
      
      for(Car c : arr){
         System.out.println(c.id);
      }
      
      System.out.println();
      
      //sorted the id's
      Collections.sort(arr);
      
      for(Car c : arr){
         System.out.println(c.id);
      }
      
      
   }
   
   
}