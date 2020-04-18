/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u162007
 */
public class SelectionSort {
    private long[] a;
    private int n;
    public SelectionSort(int max){
    a= new long[max];
    n=0;}
    public void insert(long val){
        a[n]=val;
        n++;
    }
    public void display(){
        for(int j=0;j<n;j++)
        System.out.print(a[j]+" ");
        System.out.println(" ");
    }
    public void selectionsort(){
        int out,in,min
;
        for(out =0;out<n-1;out++)
        {
            min = out;
            for(in=out+1;in<n;in++)
                if(a[in]<a[min])
                    min=in;
            swap(out,min);
        }
    }
    private void swap(int one,int two){
        long temp= a[one];
        a[one]= a[two];
        a[two]= temp;
        
    }
    public static void main(String[] args){
        int size =100;
        SelectionSort arra = new SelectionSort(size);
        System.out.println("array...");
        arra.insert(23);
         arra.insert(19);
          arra.insert(5);
           arra.insert(90);
            arra.insert(10);
             arra.insert(45);
              arra.insert(38);
               arra.insert(85);
               arra.display();
               System.out.println("after selectio soirt...");
               arra.selectionsort();
        arra.display();
    }
}
