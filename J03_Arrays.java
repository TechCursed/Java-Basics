import java.util.*;
   
   class J03_Arrays {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("Enter array size : ");
        size = input.nextInt();                                                                             //initializing the size of array

        int[] array = new int[size];                                                                      //declaring an array and allocating memory to it
        
        for(int i=0; i<size; i++)
        {
            array[i] = input.nextInt();                                                                        // taking n inputs
        }


        for(int j=0; j< array.length; j++)                                                                      //printing the array
        {
            System.out.println(array[j]);
        }

    }
}
