#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int size,i;
    cin>>size;
    int arr[size];
    for(i=0;i<size;i++)
    {
        cin>>arr[i];
    }
    for(int j=size-1;j>=0;j--)
    {
        cout<<arr[j]<<" ";
    }
    
    
    return 0;
}
