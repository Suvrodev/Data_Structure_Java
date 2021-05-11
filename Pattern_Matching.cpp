#include <bits/stdc++.h>
using namespace std;
class Suvrodev{
public:
    int Pattern_Matching(string,string);
    void Length(string);
};
int Suvrodev::Pattern_Matching(string Text,string Pattern){
    int count=0;
    int LText=Text.length();
    int LPattern=Pattern.length();
    int Length=LText-LPattern;
    int i,j;
    for(i=0;i<=Length;i++){
      //  cout<<i<<". "<<Text[i]<<endl;
        for(j=0;j<LPattern;j++){
            if(Text[i+j]!=Pattern[j]){
                break;
            }
        }
        if(j==LPattern){
            cout<<Pattern<<" has found at "<<i+1<<" number position"<<endl;
            count++;
        }
    }
    if(count>0){
        return -1;
    }else{}
}
void Suvrodev::Length(string str){
    int c=0;
    int i;
    for(i=0;str[i]!='\0';i++){
         c++;
         cout<<i<<". "<<str[i]<<endl;
    }
    cout<<"Length:"<<c<<endl;
    cout<<"Length:"<<i<<endl;
}
int main()
{
    Suvrodev v;
    string Text,Pattern;
    cout<<"Write Full Text:";
    getline(cin,Text);
    cout<<"Enter Pattern:";
    getline(cin,Pattern);
   // v.Length(Pattern);
    int Return_Value=v.Pattern_Matching(Text,Pattern);
    if(Return_Value!=-1){
        cout<<Pattern<<" has Not found"<<endl;
    }
    return 0;
}

