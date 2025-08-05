/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s = "swiss";
	    Character result = firstNonRepeatingCharacter(s);
	    System.out.println(result!=null?result:"No Non repeating character found");
	}
	public static Character firstNonRepeatingCharacter(String s){
	    Map<Character,Integer> map = new LinkedHashMap<>();
	    for(char c:s.toCharArray()){
	        map.put(c,map.getOrDefault(c,0)+1);
	    }
	    
	    for(Map.Entry<Character,Integer> entry:map.entrySet()){
	        if(entry.getValue()==1){
	            return entry.getKey();
	        }
	    }
	    return null;
	}
}
