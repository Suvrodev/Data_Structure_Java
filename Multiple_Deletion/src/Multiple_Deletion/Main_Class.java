package Multiple_Deletion;

import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args) {

        System.out.println("Multiple Deletion by Suvrodev");
        Scanner ip=new Scanner(System.in);
        Operation operation=new Operation();

        int Limit_,Time;
        int[] Data=new int[100];
        int[] All_Position=new int[100];
        char ch;

        System.out.printf("Enter the Limit of Data: ");
        Limit_=ip.nextInt();
        int[] Limit=new int[]{Limit_};

        System.out.println("Enter input from here");
        for (int i=1;i<=Limit[0];i++){
            System.out.printf(i+". Enter input: ");
            Data[i]=ip.nextInt();
        }
        operation.Display(Data,Limit);

        for (;;) {
            System.out.printf("\nDeletion-> Press d\nMultiple_Deletion->m:\nNow Press: ");
            ch = ip.next().charAt(0);
            switch (ch) {
                case 'd':
                    System.out.printf("Enter Position for Deletion: ");
                    int Position=ip.nextInt();
                    int Return_Value=operation.Deletion(Data,Limit,Position);
                    if(Return_Value==0){
                        System.out.println("\nErrorPosition");
                    }else {
                        System.out.println("Deleted Successfully");
                    }
                    break;
                case 'm':
                    System.out.printf("How many time do you want to Delete:");
                    Time=ip.nextInt();
                    for(int i=1;i<=Time;i++){
                        System.out.printf(i+". Enter Position:");
                        All_Position[i]=ip.nextInt();
                    }
                    operation.Multiple_Deletion(Data,Limit,Time,All_Position);
                    break;
                default:
                    System.out.println("\nInvalid Character");
            }
        }
    }
}
