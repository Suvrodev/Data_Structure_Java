package Search_Cng_Excg_Rev;

public class Chg_Exc_Rv extends Search_Operation{
    int Change_Item_in_Index(int[] Data, int Position, int Item, int[] Limit){
        if(Position<1 || Position>Limit[0]){
            return 0;
        }else {
            Data[Position]=Item;
            Display(Data,Limit);
            return -1;
        }
    }

    int Exchange_Data(int[] Data, int Position, int Position_, int[] Limit)
    {
        if(Position<1 || Position>Limit[0]){
            if(Position_<1 || Position_>Limit[0]){
                return 0;
            }
        }else {
            int Temp=Data[Position];
            Data[Position]=Data[Position_];
            Data[Position_]=Temp;

            Display(Data,Limit);
            return -1;

        }
        return 1;

    }
    int Change_All_Data(int[] Data, int Item, int Item_, int[] Limit){
        int count=0;
        for(int i=1;i<=Limit[0];i++){
            if(Item==Data[i]){
                Data[i]=Item_;
                count++;
            }
        }
        if(count==0){
            return 0;
        }else {
            Display(Data,Limit);
            return -1;
        }
    }

    void Exchange_All_Data(int[] Data, int Item, int Item_,int[] Limit){
        int count=0;
        for(int i=1;i<=Limit[0];i++){
            if(Item==Data[i]){
               Data[i]=Item_;
               count++;
            }
            if(count==0){
                if(Data[i]==Item_){
                    Data[i]=Item;
                }
            }
            count=0;
        }
        Display(Data,Limit);
    }

    void  Reverse_data(int[] Data, int[] Limit){
        System.out.printf("Reverse Data: ");
        for(int i=Limit[0];i>=1;i--){
            System.out.printf(Data[i]+" ");
        }
    }
}
