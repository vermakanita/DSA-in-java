package Array;

import java.util.Scanner;

public class MaxFind {
    public static void main(String args[]){
        Scanner sc = new Scanner( System.in);
        System.out.println("enter length");
        int n = sc.nextInt();
        int []arr= new int[n];
 
         for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
         }
        //main logic
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
             if(arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println(max);
    }
}
