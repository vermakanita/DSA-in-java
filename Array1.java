package Array;
public class Array1 {
    public static  void main (String [] arge){
    int [] arr = {1,4,7,9,8};


    //get element
    System.out.println("get element");
    System.out.println(arr[2]);


    //set element
    System.out.println("set element");
    arr[2] = 30;

    //length of array
    System.out.println("length element");
    System.out.println(arr.length);

    //travers 
    System.out.println("travers element");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }


    }
}
