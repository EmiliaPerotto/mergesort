import java.io.*;
import java.util.*;
public class MergeSort{
  public static void mergeSort (int[] arr1){
    int length = arr1.length;
    if(length <= 1){
      return;
    } //base case
    int middle = (length) / 2;
    int[] leftArr = new int[middle];
    int[] rightArr = new int[length - middle];
    for(int i = 0; i < middle; i++){
        leftArr[i] = arr1[i];
      }
    for(int i = middle; i < length; i++){
        rightArr[i-middle] = arr1[i];
      }
    mergeSort(leftArr);
    mergeSort(rightArr);
    merge(leftArr, rightArr, arr1);
    }
  public static void merge(int[] leftArr, int[] rightArr, int[] arr3){
    int leftSize = leftArr.length;
    int rightSize = rightArr.length;
    int i = 0;
    int l = 0;
    int r = 0;//index
    //conditions for merging
    while(l < leftSize && r < rightSize){
      if (leftArr[l] < rightArr[r]){
        arr3[i] = leftArr[l];
        i++;
        l++;
      }
      else{
        arr3[i] = rightArr[r];
        i++;
        r++;
      }
    }
    while (l < leftSize) {
      arr3[i] = leftArr[l];
      i++;
      l++;
    }
    while (r < rightSize) {
      arr3[i] = rightArr[r];
      i++;
      r++;
    }
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
    mergeSort(arr);
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