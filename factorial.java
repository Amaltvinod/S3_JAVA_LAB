import java.util.*;
class factorial{
public static void main(String[] args){
   Scanner s=new Scanner(System.in);
  System.out.println("enter the number");

    int p=s.nextInt();
   int i;
  int fact=1;
 for(i=1;i<=p;i++){
   fact*=i;
     }
  System.out.println(fact +" is factorial of "+p);
 }
}

   
