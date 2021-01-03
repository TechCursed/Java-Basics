import java.util.*;

 class J10_Objects {

    public static void main(String args[])                              //main method
    {
          objectsarefun car = new objectsarefun();                                     //creating object of class "objectsarefun"


          objectsarefun.model();                                                      //using the object to call the class method
          objectsarefun.bodyDesign();
          objectsarefun.speed();
    }
}
 
class objectsarefun{

    public static void model()                                                               //methods for the class
    {
        System.out.println("Car Model is TESLA");
    }

     public static void speed()
     {
         System.out.println("Car Speed is 300 Mph");
     }

     public static void bodyDesign()
     {
         System.out.println("Bodytype is SEDAN");
     }
 }

