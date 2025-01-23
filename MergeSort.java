import java.io.*;
import java.util.*;
public class MergeSort{
  public static int[] merge(int[] arr1, int[]arr2){
    
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
    for (int i = 0; i < arr.length; i++){
      if(i != arr.length -1){
        System.out.print(arr[i] + " , ");
      }
      else{
        System.out.print(arr[i]);
    }
  }
  }
}