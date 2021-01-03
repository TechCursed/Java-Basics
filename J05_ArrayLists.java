import java.util.*;

class J05_ArrayLists {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> alist = new ArrayList<>();                                      //creating an Arraylist of Strings
        alist.add("Hello");                           
        alist.add("there");                                                            //adding elements into the list
        alist.add("folks");

        System.out.println(alist);                                                       //printing the ArrayList

        alist.remove(1);                                                         //deleting an element from the list
        System.out.println(alist);                                             //printing the updated Arraylist
    }
    
}
