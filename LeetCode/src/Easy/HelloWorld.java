package Easy;
public class HelloWorld {
   
       public static void func(int n)
       {
         if(n>0)
         {
           func(--n);
           System.out.println(n++ +" ");
           func(n/2);
         }
       }
       
       public static void main(String[] args)
       {
         HelloWorld n= new HelloWorld();
         n.func(2);
       }
    }