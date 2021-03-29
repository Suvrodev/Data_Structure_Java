package Deletion_Array;

public class Operation {

    int Delete_Position(int[] Data,int Position, int[] Limit){
        if(Position<=0 || Position>=Limit[0]){
            return 0;
        }else {
            for (int i = Position; i <= Limit[0]; i++) {
                Data[i] = Data[i + 1];
            }
            Limit[0] = Limit[0] - 1;
            Display(Data, Limit);
            return -1;
        }
    }
    int Delete_item(int[] Data, int Item, int[] Limit){
        int Position=0;
        for(int i=1;i<=Limit[0];i++){
            if(Data[i]==Item){
                Position=i;
            }
        }
        if(Position==0){
            return 0;
        }else {
            for (int i = Position; i <= Limit[0]; i++) {
                Data[i] = Data[i + 1];
            }
            Limit[0] = Limit[0] - 1;
            Display(Data, Limit);
            return -1;
        }
    }

    void Delete_First_Position(int[] Data, int[] Limit){
        for(int i=1;i<=Limit[0];i++){
            Data[i]=Data[i+1];
        }
        Limit[0]=Limit[0]-1;
        Display(Data, Limit);
    }
    void Delete_Last_Position(int[] Data, int[] Limit){

       // Data[Limit[0]-1]=Data[Limit[0]];

        Limit[0]=Limit[0]-1;
        Display(Data, Limit);
    }

    void Delete_First_And_Last(int[] Data, int[] Limit){
        for(int i=1;i<=Limit[0];i++){
            Data[i]=Data[i+1];
        }
        Limit[0]=Limit[0]-2;
        Display(Data,Limit);
    }

    void Multiple_Deletion(int[] Data,int[] Limit, int Time,int[] Total_Position){
        int Help=0;
        for(int x=1;x<=Time;x++){
            for(int i=Total_Position[x]-Help;i<=Limit[0];i++){
                Data[i]=Data[i+1];
            }
            Help++;
            Limit[0]=Limit[0]-1;
        }
        Display(Data,Limit);

    }
    void Display(int[] Data, int[] Limit){
        int i=0;
        System.out.printf("Display: ");
        for( i=1;i<=Limit[0];i++){
            System.out.print(Data[i]+" ");
        }
        System.out.println("\nTotal Element: "+(i-1));
    }
}
