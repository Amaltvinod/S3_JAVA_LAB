import java.util.*;

class palindrome{
   public static void main(String[] args){
    Scanner s = new Scanner(System.in);
     int p=s.nextInt();
     int rev=0;
     int r=p;

 while(p!=0){
        int rem=p%10;
         
         rev=rev*10+rem;
        p/=10;
     }
   if(r==rev){
    System.out.println(r+ "is a palindrome");}

    else {
System.out.println(r+"is not a palindrome");}
}
}


      
