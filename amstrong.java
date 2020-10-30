import java.util.*;
class amstrong{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int p=s.nextInt();
int rem=0;
int rev=0;
int count=0;
int r=p;
while(p!=0)
{
 count++;
 p/=10;
}
p=r;
int length=count;
while(p!=0)
{
 rem=p%10;
 rev+=Math.pow(rem,length);
 p/=10;
}
if(r==rev){
   System.out.println(r + " is amstrong");}
    else {
System.out.println(r+ " is not amstrong");}
}
}
      
    
    
       
