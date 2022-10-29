
    import java.util.Random;
import java.util.Scanner;
 
import javax.lang.model.element.Element;
 
public class Reto3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int CaraSello;
        CaraSello= (int)(Math.random() *2 +1);
 
 
        int eleccion;
   
        System.out.println("digite 1 para cara o 2 para sello");
        eleccion= leer.nextInt();
   
 
     
       
       
       
        if (eleccion==2 && CaraSello==1){
            System.out.println("perdio");
 
        }
        else if(eleccion==2 && eleccion==2){
            System.out.println("ganaste");
        }
        else if(CaraSello==1 && CaraSello==1){
            System.out.println("ganaste sog");
        }
        else if(CaraSello==1 && eleccion==2){
            System.out.println("perdiste pa :v");
        }
        leer.close();
 
 
 
 
   
}
}


