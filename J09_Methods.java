import java.util.*;

 class Methods {

        static void printMethod()                                                                //this is a void method,it does'nt returns any value
        {
            System.out.println("this method returns nothing");
        }

        static int intMethod(int n)                                                              //this method returns an integer
       {
        return n;
       }

       static String stringMethod(String s)                                                     //this method returns a String
       {
           return s;
       }


    public static void main(String args[])                                   //this is the Main Method
    {
        printMethod();                                                                             //calling printMethod()
        System.out.println(intMethod(5));                                                        //calling intMethod() 
        System.out.println(stringMethod("heyy"));                                                 //calling stringMethod()                   

    }
}
