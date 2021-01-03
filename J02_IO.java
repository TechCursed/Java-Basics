import java.util.*;
import java.util.Scanner;                                                                            //importing Scanner Class

 class J02_IO {

    public static void main(String[] args)                                                //main method
    {
        Scanner input = new Scanner(System.in);                                                          //scanner object
        String name;                                                                                    // string datatype to store name
        int age;                                                                                      //integer datatype to store age

        System.out.print("Enter Name : ");
        name = input.nextLine();                                                            //takes name as input
        System.out.print("Enter Age : ");
        age = input.nextInt();                                                              //takes age as input

        System.out.println("Name : " +name+ " Age : " +age);                                               //printing the values
    }
}
