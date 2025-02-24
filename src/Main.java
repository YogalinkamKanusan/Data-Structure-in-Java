import java.util.*;

public class Main {
    public static void main(String[] args) {
        int val,pos,index;
        DynamicArray list = new DynamicArray();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---------------------------------- ");
            System.out.println("1.Insert at End");
            System.out.println("2.Display the list");
            System.out.println("3.Insert at specified position");
            System.out.println("4.Delete  from specified position");
            System.out.println("5.Delete at end");
            System.out.println("6.Delete at Beginning");
            System.out.println("7.Insert at Beginning");
            System.out.println("8.Get Index of an element");
            System.out.println("9.Update a value");
            System.out.println("10.Search an element of index");
            System.out.println("11.clear");
            System.out.println("12.Exit");
            System.out.println("---------------------------------- ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter value ");
                    val = sc.nextInt();
                    list.insert(val);
                    break;
                case 2:
                    list.display();
                    break;

                case 3:
                    System.out.println("Enter position");
                    pos = sc.nextInt();
                    System.out.println("Enter value");
                    val = sc.nextInt();
                    list.insertAtPos(pos,val);
                    break;

                case 4:
                    System.out.println("Enter the position to delete");
                    pos=sc.nextInt();
                    list.delAtPos(pos);
                    break;
                case 5:
                    list.delAtEnd();
                    break;
                case 6:
                    list.delAtPos(1);
                    break;
                case 7:
                    System.out.println("Enter the value");
                    val= sc.nextInt();
                    list.insertAtPos(1,val);
                    break;
                case 8:
                    System.out.println("Enter the index to get the element");
                    index= sc.nextInt();
                    list.getElement(index);
                    break;
                case 9:
                    System.out.println("which index of an element do you want to update");
                    index=sc.nextInt();
                    System.out.println("which value do you want to update");
                    val=sc.nextInt();
                    list.update(index,val);
                    break;
                case 10:
                    System.out.println("Enter the element to identify its index");
                    int element=sc.nextInt();
                    list.identifyIndex(element);
                    break;
                case 11:
                    list.clear();
                    break;

                case 12:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong choice");


            }
        }
    }
}