package Insertion;

import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args) {
        System.out.println("Array Insertion By Suvrodev");
        Operation obj=new Operation();
        Scanner ip=new Scanner(System.in);


        int Limit_,Item,Item_,Position,Return_Value;
        int[] All_item=new int[100];
        int[] All_position=new int[100];


        System.out.printf("Enter Limit of Data: ");
        Limit_=ip.nextInt();

        int[] Limit=new int[] {Limit_};

        int[] Data=new int[100];
        System.out.println("Enter Input From Here");
        for(int i=1;i<=Limit[0];i++){
            System.out.print(i+". Enter Input: ");
            Data[i]=ip.nextInt();
        }


       for(;;) {

           System.out.printf("\n1.For Insertion press i\n2.For insert 1st index press f\n3.For insert Last index press l\n" +
                   "4.For insert First and Last press w\n5.For Multiple Insertion press m\n**For Display Press d \nNow Press: ");
           char ch = ip.next().charAt(0);
           switch (ch) {
               case 'i':
                   System.out.printf("Enter Element to insertion:");
                   Item = ip.nextInt();
                   System.out.printf("Enter Position for insertion: ");
                   Position = ip.nextInt();
                   Return_Value = obj.Insert(Data, Item, Position, Limit);
                   if (Return_Value == 0) {
                       System.out.println("\nPosition not found");
                   } else {
                       System.out.println("\nData Inserted Successfully");
                   }
                   break;
               case 'f':
                   System.out.printf("Enter Element to insertion:");
                   Item = ip.nextInt();
                   obj.Insert_First_Index(Data,Item,Limit);
                   break;
               case 'l':
                   System.out.printf("Enter Element to insertion:");
                   Item = ip.nextInt();
                   obj.Insert_Last_Index(Data,Item,Limit);
                   break;
               case 'w':
                   System.out.printf("Enter Element to insertion:");
                   Item = ip.nextInt();
                   System.out.printf("Enter Element to insertion:");
                   Item_ = ip.nextInt();
                   obj.Insert_First_And_Last_index(Data,Item,Item_,Limit);
                   break;
               case 'm':
                   System.out.printf("How many item do you insert: ");
                   int Time=ip.nextInt();
                   for(int i=1;i<=Time;i++){
                       System.out.printf(i+". Insert Item: ");
                       All_item[i]=ip.nextInt();
                       System.out.printf(i+". Enter Position: ");
                       All_position[i]=ip.nextInt();
                   }
                   obj.Multiple_Insertion(Data,All_item,All_position,Limit,Time);
                   break;
               case 'd':
                   obj.Display(Data,Limit);
                   break;
               default:
                   System.out.println("Invalid Character");
                   break;

           }
       }

    }
}
