#include<iostream>
using namespace std;
int main(){
    int r,c;
    cout<<"Enter rows and columns: ";
    cin>>r>>c;
    int a[r][c];

    cout<<"Enter array elements: "<<endl;
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            cin>>a[i][j];
        }
    } 

    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(a[i][j]==0){
                for(int m=0;m<r;m++){
                    a[m][j] = -1;
                }
                for(int m=0;m<c;m++){
                    a[i][m] = -1;
                }
            }
        }
    }  

    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(a[i][j]==-1){
                a[i][j] = 0;
            }
        }
    } 

    cout<<"New Array: "<<endl;
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            cout<<a[i][j]<<" ";
        }
        cout<<endl;
    }  
}