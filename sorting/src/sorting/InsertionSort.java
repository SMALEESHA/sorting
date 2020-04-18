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
public class InsertionSort {
    private long[] a;
    private int n;
    public InsertionSort(int max){
        a = new long[max];
        n = 0;
    }
    public void insert(long val){
        a[n] = val;
        n++;
    }
    public void display(){
        for(int j=0; j<n; j++)
            System.out.print(a[j]+" ");
        System.out.println(" ");
    }
    public void InsertionSort(){
        int in,out;
        for(out = 1; out<n; out++){
            long temp = a[out];
            in = out;
            while(in>0 && a[in-1]>=temp){
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;
        }
    }
    public static void main(String args[]){
        int size = 100;
        InsertionSort arr = new InsertionSort(size);
        System.out.println("Array.....");
        arr.insert(44);
        arr.insert(19);
        arr.insert(5);
        arr.insert(90);
        arr.insert(10);
        arr.insert(45);
        arr.insert(38);
        arr.insert(85);
        arr.display();
        
        System.out.println("After InsertionSort.....");
        arr.InsertionSort();
        arr.display();
    }
}

    

