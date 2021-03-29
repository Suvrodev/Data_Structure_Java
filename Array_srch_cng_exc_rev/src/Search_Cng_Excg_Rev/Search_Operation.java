package Search_Cng_Excg_Rev;

public class Search_Operation {

    int Search_by_Position(int[] Data, int Position, int[] Limit){
        if(Position<1 || Position>Limit[0]){
            return 0;
        }else {
            return Data[Position];
        }
    }
    int Search_By_Item(int[] Data, int Item, int[] Limit){
        int i=0;
        for(i=1;i<=Limit[0];i++){
            if(Item==Data[i]){
                break;
            }
        }
        if(i>Limit[0]){
            return 0;
        }else {
            return i;
        }
    }
    int Search_Items_permanence(int[] Data, int Item, int[] Limit){
        int count=0;
        for(int i=1;i<=Limit[0];i++){
            if(Item==Data[i]){
                count++;
            }
        }
        if(count==0){
            return 0;
        }else {

            return count;
        }
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
