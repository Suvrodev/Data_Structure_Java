package Deletion_Array;

import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args) {
        System.out.println("Deletion Array Element by Suvrodev");

        Operation operation=new Operation();
        Scanner ip=new Scanner(System.in);
        int Limit_,Item,Item_,Position,Return_value;
        int[] Total_Position=new int[100];

        System.out.printf("Enter the Limit of Data: ");
        Limit_=ip.nextInt();
        int[] Limit=new int[] {Limit_};
        int[] Data=new int[100];
        System.out.println("Enter Input From Here");
        for(int i=1;i<=Limit[0];i++){
            System.out.print(i+". Enter Input: ");
            Data[i]=ip.nextInt();
        }

        operation.Display(Data,Limit);
        for (;;){
            System.out.printf("\n1.For Delete Position press p\n" +
                    "2.For Delete Item press i\n" +
                    "3.For Deletion First from index press f\n" +
                    "4.For Deletion Last from index press l\n"+
                    "5.For insert First and Last press w\n" +
                    "6.For Multiple Insertion press m \n**For Display Press d\nNow Press: ");
            char ch = ip.next().charAt(0);
            if(ch=='p'){
                System.out.printf("Input Position: ");
                Position=ip.nextInt();
                Return_value=operation.Delete_Position(Data,Position,Limit);
                if(Return_value==0){
                    System.out.println("\nPosition Error");
                }else {
                    System.out.println("\nDeletion Successfully");
                }
            }
            else if(ch=='i'){
                System.out.printf("Input Item: ");
                Item=ip.nextInt();
                Return_value=operation.Delete_item(Data,Item,Limit);
                if(Return_value==0){
                    System.out.println("Item Not Found");
                }else {
                    System.out.println("\nDeleted Successfully");
                }
            } else if (ch == 'd') {
                operation.Display(Data,Limit);
            }
            else if(ch=='f'){
                System.out.println("Deleted 1st Position");
                operation.Delete_First_Position(Data,Limit);
            }
            else if(ch=='l'){
                System.out.println("Deleted Last Position");
                operation.Delete_Last_Position(Data,Limit);
            }
            else if(ch=='w'){
                System.out.println("Deleted Last && First Position");
                operation.Delete_First_And_Last(Data,Limit);
            }else if(ch=='m'){
                System.out.print("How many item do you want to delete: ");
                int Time=ip.nextInt();
                for(int i=1;i<=Time;i++){
                    System.out.printf(i+". Enter Position: ");
                    Total_Position[i]=ip.nextInt();
                }
                operation.Multiple_Deletion(Data, Limit,Time,Total_Position);
            }
            else {
                System.out.println("Invalid Character");
            }
        }

    }
}
