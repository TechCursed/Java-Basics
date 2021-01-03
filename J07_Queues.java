import java.util.*;

class J07_Queues {

    public static void main(String args[])
    {
        Queue <String> Q = new LinkedList<>();                                                       //Creating a Queue object

        Q.add("USER_1");                                                                               //add elements to Queue
        Q.add("USER_2");
        Q.add("USER_3");
        Q.add("USER_4");

        System.out.println(Q);                                                                             //printing the Queue

        Q.remove("USER_4");                                                                          //removes element from the Queue
        System.out.println(Q);                                                                          //printing the updated Queue

        Q.poll();                                                                                       //removes the front element of the Queue
        System.out.println(Q);                                                                            //printing the updated Queue

    }
}
