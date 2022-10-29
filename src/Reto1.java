import java.util.Scanner;

public class Reto1 {
    

    public static void main(String[] args) {
        System.out.println("ayuda a la abuela!");
        Scanner leer=new Scanner(System.in);

        final double Gradosc=0;
        final double Gradosf=32;
        double Celsious,farenheit;
        System.out.println("ingrese grados farenheit");
        farenheit=leer.nextDouble();
        Celsious=(farenheit-32)/1.8;
        System.out.println("los grados farenhait pasaron  "+farenheit+" a "+Celsious);
        leer.close();
 
 
 
   
    }
}


