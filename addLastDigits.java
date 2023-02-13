

import java.io.*;
import java.util.*;
class UserMainCode{

public int addLastDigits(int input1, int input2){
int a,b;
if(input1<0)
input1=input*-1;
if(input2<0)
input2*-1;
a=input1%10;
b=input2%10;
return a+b;
}
}