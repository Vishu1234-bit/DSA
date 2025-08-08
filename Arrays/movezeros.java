class Solution(object):
    def moveZeroes(self, nums):
        """
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
   
    public static void main(String[] args) {
        int[] arr = {1,4,0,5,6};
        int nonzero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[nonzero];
                arr[nonzero] = arr[i];
                arr[i] = temp;
                nonzero+=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
                   
                
