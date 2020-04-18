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
public class BubbleSort {
    private long[] arr;
    private int nElements;
    
    public BubbleSort(int max){
        arr = new long[max];
        nElements = 0;
        

    }
    public void insert(long value){
        arr[nElements]= value;
        nElements++;
    }
    public void display(){
        for(int j=0;j<nElements;j++)
        System.out.print(arr[j]+" ");
        System.out.println(" ");
    }
    
    public void bubblesort(){
        int out,in;
//boolean sawapped = true;
        //out=nElements-1;
        //while(swapped && out>0){
        //swapped = false;}
        //for(in=0;in<out;in++)
        //if(arr[in]>arr[in+1])
        //swap(in,in+1);
//swapped = true;}
        //out--;//another method to do the same.
        
    
    
    for(out=nElements-1;out>1;out--)//to get the decsending order//for(out=0;out<nElemts;out++)
                                    
        for(in=0;in<out;in++)//for(in=0;in<nElements-out;in++)
        if(arr[in]>arr[in+1])//if(arr[in]<arr[in+1])
        swap(in,in+1);
    }
    public void swap(int one,int two){
        long temp = arr[one];
        arr[one]= arr[two];
        arr[two]=temp;
    }
    public static void main(String[] args){
        int maxsize = 100
;       BubbleSort array = new BubbleSort(maxsize);
        System.out.println("Array...");
        array.insert(77);
        array.insert(99);
        array.insert(55);
        array.insert(88);
        array.insert(11);
        array.insert(00);
        array.insert(66);
        array.insert(22);
        array.insert(33);
        
        array.display();
        
        System.out.println("after bubble sort...");
        
        array.bubblesort();
        
        array.display();
        
    }
    
}
