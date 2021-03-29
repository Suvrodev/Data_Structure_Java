package Insertion;

import javax.swing.text.Position;

public class Operation {
    int Insert(int[] Data,int Item,int Position,int[] Limit){
       if(Position<1 || Position>Limit[0]+1){
           return 0;
       }else {
           for(int i=Limit[0];i>=Position;i--){
               Data[i+1]=Data[i];
           }
           Data[Position]=Item;
           Limit[0]=Limit[0]+1;
           Display(Data,Limit);
           return -1;
       }
    }

    void Insert_First_Index(int[] Data,int Item,int[] Limit){
         for(int i=Limit[0];i>=1;i--){
             Data[i+1]=Data[i];
         }
         Data[1]=Item;
         Limit[0]=Limit[0]+1;
         Display(Data,Limit);
    }

    void Insert_Last_Index(int[] Data, int Item, int[] Limit){
        Data[Limit[0]+1]=Item;
        Limit[0]=Limit[0]+1;
        Display(Data,Limit);
    }

    void Insert_First_And_Last_index(int[] Data, int Item, int Item_, int[] Limit){
        for(int i=Limit[0];i>=1;i--){
            Data[i+1]=Data[i];
        }
        Data[1]=Item;
        Limit[0]=Limit[0]+1;
        Data[Limit[0]+1]=Item_;
        Limit[0]=Limit[0]+1;
        Display(Data,Limit);
    }

    void Multiple_Insertion(int[] Data, int[] All_Item, int[] All_position, int[] Limit,int Time){
//        int Find=0;
//        for(int i=1;i<=Time;i++){
//            if(All_position[i]<=0 || All_position[i]>=Limit[0]+1){
//                Find++;
//            }
//        }
//        if(Find==0) {
            for (int x = 1; x <= Time; x++) {
                for (int i = Limit[0]; i >= All_position[x]; i--) {
                    Data[i + 1] = Data[i];
                }
                Data[All_position[x]] = All_Item[x];
                Limit[0] = Limit[0] + 1;
            }
            Display(Data, Limit);
//        }
    }

    void Display(int[] Data,int[] Limit_Ref){
        int i=0;
        System.out.printf("Display Element: ");
        for( i=1;i<=Limit_Ref[0];i++){
            System.out.printf(Data[i]+" ");
        }
        System.out.printf("\nTotal Element: "+(i-1));
    }
}
