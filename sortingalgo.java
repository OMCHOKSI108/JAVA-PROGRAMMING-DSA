
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//File is made by Om Choksi 23aiml010
//code is for sorting algorithm 
//BubbleSort
//SelectionSort
//insertion Sort 
//MergeSort
//Couting Sort

class sortingalgo{

    public static void BubbleSort(int arr[]){
         for(int turn = 0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

         }
    }
    
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr =arr[i];
            int prev=i-1;
            //finding out the correct pos
            while(prev>=0 && arr[prev]>curr){
              arr[prev+1] = arr[prev]; 
              prev--;    
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
    public static void SelectionSort(int arr[]){
            for(int i=0;i<arr.length-1;i++){
                int minPose=i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[minPose]>arr[j]){
                        minPose=j; 
                    }
                }
                //swap in outer loop
                int temp=arr[minPose];
                arr[minPose]=arr[i];
                arr[i]=temp;
            }

    }

    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
           int arr[] = {5,4,1,3,2};
         //BubbleSort(arr);
         //SelectionSort(arr);
         //insertionSort(arr);  
         //PrintArray(arr);
         //Arrays.sort(arr);
         Arrays.sort(arr,0,5);
         Arrays.sort(arr,0,5,Collections.reverseOrder())
         PrintArray(arr);
         
        }

}