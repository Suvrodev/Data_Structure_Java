package Search_Cng_Excg_Rev;

import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args) {
        System.out.println("Simple DS By Suvrodev");

        Scanner ip=new Scanner(System.in);
        Search_Operation operation=new Search_Operation();
        Chg_Exc_Rv chg_exc_rv=new Chg_Exc_Rv();


        int Limit_,Item,Return_Value,Position,Item_;
        int[] Data=new int[100];
        System.out.printf("Enter Limit of Array: ");
        Limit_=ip.nextInt();
        int[] Limit=new int[] {Limit_};

        System.out.println("Enter Input From Here");
        for(int i=1;i<=Limit[0];i++){
            System.out.print(i+". Enter Input: ");
            Data[i]=ip.nextInt();
        }

        operation.Display(Data,Limit);
        for (;;) {
            System.out.printf("\n1.p for Search bu position p\n" +
                    "2.i For Search by Item\n" +
                    "3.t for A item how many time staying in Data\n" +
                    "4.r For Reverse Data \n" +
                    "5.c For change Data\n" +
                    "6.e For Exchange Data \n" +
                    "7.C for Change All Data \n**d For Display\nNow Press: ");
            char ch = ip.next().charAt(0);
            switch (ch){
                case 'd':
                    operation.Display(Data,Limit);
                    break;
                case 'p':
                    System.out.printf("Input Position for Search item:");
                    Position=ip.nextInt();
                    Return_Value=operation.Search_by_Position(Data,Position,Limit);
                    if(Return_Value==0){
                        System.out.println("Invalid Position");
                    }else {
                        System.out.println("In "+Position+" Position Item is: "+Return_Value);
                    }
                    break;
                case 'i':
                    System.out.printf("Input item for Search Position:");
                    Item=ip.nextInt();
                    Return_Value=operation.Search_By_Item(Data,Item,Limit);
                    if(Return_Value==0){
                        System.out.println(" Item not Found");
                    }else {
                        System.out.println(Item+" has found at: "+Return_Value+" Number Position");
                    }
                    break;
                case 't':
                    System.out.printf("Input item for show its Permanence:");
                    Item=ip.nextInt();
                    Return_Value=operation.Search_Items_permanence(Data,Item,Limit);
                    if(Return_Value==0){
                        System.out.println(Item+" Not Found");
                    }else {
                        System.out.println(Item+" has found at "+Return_Value+" Times");
                    }
                    break;
                case 'c':
                    System.out.println("Change Positions Item");
                    System.out.printf("Enter Item: ");
                    Item=ip.nextInt();
                    System.out.printf("Enter Position: ");
                    Position=ip.nextInt();
                    Return_Value=chg_exc_rv.Change_Item_in_Index(Data,Position,Item,Limit);
                    if(Return_Value==0){
                        System.out.println("Position Not Found");
                    }else {
                        System.out.println("Data Change Successfully");
                    }
                    break;
                case 'e':
                    System.out.printf("For Exchange give first index: ");
                    Position=ip.nextInt();
                    System.out.printf("Second Data: ");
                    int Position_=ip.nextInt();

                    Return_Value=chg_exc_rv.Exchange_Data(Data,Position,Position_,Limit);
                    if(Return_Value==0){
                        System.out.println("Position Not Found");
                    }else {
                        System.out.println("Data has Exchanged Successfully");
                    }
                    break;
                case 'r':
                    chg_exc_rv.Reverse_data(Data,Limit);
                    break;
                case 'C':
                    System.out.printf("Which Data do you want to change: ");
                    Item=ip.nextInt();
                    System.out.printf("Data will be: ");
                    Item_=ip.nextInt();

                    Return_Value=chg_exc_rv.Change_All_Data(Data,Item,Item_,Limit);
                    if(Return_Value==0){
                        System.out.println("item not Found");
                    }else {
                        System.out.println("Changed Successfully");
                    }
                    break;
                case 'E':
                    System.out.printf("For Exchange First Data: ");
                    Item=ip.nextInt();
                    System.out.printf("Second Data: ");
                    Item_=ip.nextInt();
                    chg_exc_rv.Exchange_All_Data(Data,Item,Item_,Limit);
                    break;
                default:
                    System.out.println("invalid Character");
            }


        }

    }
}
