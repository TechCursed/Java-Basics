import java.util.*;

public class J08_LinkedList {

    public static void main(String args[])
    {

        LinkedList<String> list = new LinkedList<String>();                                                      // Creating linked list object

        list.add("ELEMENT ONE");                                                                               // adding elements to the linked list
        list.add("ELEMENT TWO");
        list.add("ELEMENT THREE");
        list.add("ELEMENT FOUR");

        System.out.println(list);                                                                            //prints the linked list

        list.remove(1);                                                                               //removes the particular index of list
        System.out.println(list);                                                                          //prints the updated linked list

        System.out.println(list.getFirst());                                                               //returns the first element
    }
}
