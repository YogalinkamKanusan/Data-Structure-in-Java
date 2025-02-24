import java.util.Arrays;

public class DynamicArray{
    private static final int initial_Capacity=10;
    private int[] arr;
    private int capacity;
    private int size;


    public DynamicArray(){
       arr=new int[initial_Capacity];
       capacity=initial_Capacity;
        size=0;
    }

    public void insert(int value){
        if(size==capacity){
            expandArray();
        }
        arr[size++]=value;

    }

    private void expandArray(){
        capacity=capacity*2;
        arr=java.util.Arrays.copyOf(arr,capacity);

    }

    public void display(){
        for(int i=0 ; i<size ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public void insertAtPos(int pos, int val){
        if(pos>=0 && pos<=size ){
        for(int i=size;i>pos-1;i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]=val;
        size++;}
        else {System.out.println("Wrong Position");}
    }
   public void delAtPos(int pos) {
       if (pos < size && pos >= 0) {
           for (int i = pos - 1; i < size - 1; i++) {
               arr[i] = arr[i + 1];
           }
           size--;
           if (capacity > initial_Capacity && 3 * size < capacity) {
               shrinkArray();
           }
       }
       else {
           System.out.println("Wrong Position");
       }}
  public void shrinkArray() {
           capacity /= 2;
           arr = Arrays.copyOf(arr, capacity);
    }
  public void delAtEnd(){
        size--;
  }

  public void getElement(int index){
      System.out.println(arr[index]);
  }
  public void update(int index,int value){
        arr[index]=value;

  }
  public void identifyIndex(int element){
        for(int i=0;i<size;i++){
            if(arr[i]==element){
                System.out.printf("Element %d is in index %d \n",element,i);
            }

        }

      }

  public void clear(){
        size=0;
  }


}






