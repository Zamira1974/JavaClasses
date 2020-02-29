package com.class36;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/*Create a Method in Main class using below specification. 
Method Name: Display. 
Return Type: Void
Parameters : Map<String,Integer>
Logic: 
First the method will check the given map is empty or not. 
If the map is not empty print pairs of key and value using loops
If map is empty simply print "map is empty"

NOW IN MAIN METHOD
Create HashMap of String keys and Integer values
add values as below
map.put("mango", 10); 
map.put("apple", 30); 
map.put("orange", 20); 

-using created display method to display. 
-then clear the map. 
-use the same method to display
 * */
	
	
public class Repl209 {
	
	  public void display(Map<String, Integer> fruit){
	    if(!fruit.isEmpty()){
	      
	      for(String key:fruit.keySet()){
	        System.out.println(key+" : "+fruit.get(key));
	      }
	    }
	    else{
	      System.out.println("map is empty");
	    }
	  }
	  public static void main(String[] args){
	    Map<String, Integer> map=new HashMap<>();
	    map.put("mango", 10); 
	    map.put("apple", 30); 
	    map.put("orange", 20); 
	    
	    Repl209 mm=new Repl209();
	    mm.display(map);
	    map.clear();
	    mm.display(map);
	  }
	  
	}

