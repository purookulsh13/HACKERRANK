#include <iostream>
#include <cstring>
using namespace std;

int main() {
	string s1,s2;
    cin>>s1>>s2;
    int count1,count2;
    count1=s1.size();
    count2=s2.size();
    cout<<count1<<" "<<count2<<endl;
    cout<<s1+s2<<endl;
    char a,b;
    a = s2[0];
    b = s1[0];        
    s1[0] = a;
    s2[0] = b;
    cout<<s1<<" "<<s2;
    return 0;
}
