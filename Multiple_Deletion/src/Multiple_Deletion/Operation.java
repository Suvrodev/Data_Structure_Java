package Multiple_Deletion;

public class Operation {
    void Display(int[] Data, int[] Limit){
        int i=0;
        System.out.printf("Data: ");
        for(i=1;i<=Limit[0];i++){
            System.out.printf(Data[i]+" ");
        }
        System.out.println("\nTotal Element: "+(i-1));
    }
    int Deletion(int[] Data, int[] Limit, int Position){
        if (Position<1 || Position>Limit[0]){
            return 0;
        }else {
            for (int i=Position;i<=Limit[0];i++){
                Data[i]=Data[i+1];
            }
        }
        Limit[0]=Limit[0]-1;
        Display(Data,Limit);
        return -1;
    }
    void Multiple_Deletion(int[] Data, int[] Limit, int Time, int[] Position){
        int count=0;
        for(int x=1;x<=Time;x++){
            if(x>1){
                if(Position[x]>Position[x-1]){
                    for(int i=Position[x]-count;i<=Limit[0];i++){
                        Data[i]=Data[i+1];
                    }
                    count++;
                }else {
                    for(int i=Position[x];i<=Limit[0];i++){
                        Data[i]=Data[i+1];
                    }
                    count++;
                }
            }else {
                for(int i=Position[x];i<=Limit[0];i++){
                    Data[i]=Data[i+1];
                }
                count++;
            }

        }
        Limit[0]=Limit[0]-Time;
        Display(Data,Limit);
    }
}
