package com.sorting;

/**
 * Created by root on 4/6/16.
 */
public class Sorting {
    Integer pivot;
    public Sorting(){

    }

    public void insertionSort(Integer arr[]){


        for(int j = 1; j < arr.length;){
            System.out.println(arr[j]);
            pivot = arr[j];
            int i = j-1;
            while(i >= 0 && arr[i] > pivot){
                arr[ i + 1] = arr[i];
                i = i -1;
            }
            arr[i + 1] = pivot;
            j += 1;
        }
        System.out.println("Insertion Sort");
        for (int i =0; i < arr.length  ; i++){
            System.out.println(arr[i]);
        }
    }
}
