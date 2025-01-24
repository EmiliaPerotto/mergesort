import java.io.*;
import java.util.*;
public class MergeSort{
  public static int[] merge_split (int[] arr1, int low, int high){
    int middle = (low + high) / 2;
    return middle;
    int[] arr_right = new int[middle];
    int[] arr_left = new int[middle];
    int right = middle;
    int 
    

  }
  public static void main (String args[]) throws IOException{
    Scanner in = new Scanner(System.in);
    System.out.println("Input filename: ");
    String filename = in.nextLine();
    Scanner fin = new Scanner(new File(filename));
    int lines = fin.nextInt();
    int[] arr = new int[lines];
    int j = 0;
    while(fin.hasNextLine()){
      arr[j] = fin.nextInt();
      j++;
    } 
    int low = 0;
    int high = arr.length -1;
    for (int i = 0; i < arr.length; i++){
      if(i != arr.length -1){
        System.out.print(arr[i] + " , ");
      }
      else{
        System.out.print(arr[i]);
    }
  }
      //System.out.println("Middle val: " + merge_split(arr, low, high));    this works
  }
}