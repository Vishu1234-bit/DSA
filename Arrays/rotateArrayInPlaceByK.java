/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr={1,2,3,4,5,6,7};
		rotateArrayInPlace(arr,3);
		System.out.println(Arrays.toString(arr));
	}
	public static void rotateArrayInPlace(int[] arr,int k){
	    int n =arr.length;
	    k%=n;
	    rotate(arr,0,n-1);
	    rotate(arr,0,k-1);
	    rotate(arr,k,n-1);
	}
	public static void rotate(int[] arr,int start,int end){
	    while(start<end){
	        int temp =arr[start];
	        arr[start]=arr[end];
	        arr[end]=temp;
	        start+=1 ;
	        end-=1;
	    }
	}
}
