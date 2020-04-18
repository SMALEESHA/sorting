/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author u162007
 */
public class MergeSort {
    
     private int [] array;
    private int[] tempMergArr;
    private int length;
    
    public void sort(int inputArray[]){
        this.array = inputArray;
        this.length = inputArray.length;
        this.tempMergArr = new int[length];
        doMergeSort(0,length-1);
    }
    public void doMergeSort(int lowerIndex, int higherIndex){
        if(lowerIndex<higherIndex){
            int middle = lowerIndex + (higherIndex-lowerIndex)/2;
            doMergeSort(lowerIndex,middle);    //merge left side of the array
            doMergeSort(middle+1,higherIndex); //merge right side of the array
            //merge both parts
            mergeparts(lowerIndex,middle,higherIndex);
        }
    }
        private void mergeparts(int lowerIndex, int middle, int higherIndex){
        for(int i = lowerIndex; i<=higherIndex; i++){
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle+1;
        int k = lowerIndex;
        while(i<=middle && j<=higherIndex){
            if(tempMergArr[i]<= tempMergArr[j]){
                array[k] = tempMergArr[i];
                i++;
            }else{
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while(i<=middle){
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
        }
        public static void main(String a[]){
            int[] arr = {67,89,32,76,41,99,12,05,40,53};
            System.out.println("Array before sorting is ");
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]);
                System.out.print(" ");
            }
            MergeSort mers = new MergeSort();
            mers.sort(arr);
            System.out.println(" ");
            System.out.println("Array after sorting is ");
            for(int i:arr){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }


    




































