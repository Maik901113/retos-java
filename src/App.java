import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         //definir un objeto;
         Scanner leer=new Scanner(System.in);
         //reciba el radio del circulo y calcule y su area
  
         //datos de entrada
         final double PI=3.1416;
         double radio,area;
        System.out.println("ingrese el dato del circulo");
        radio=leer.nextDouble();
        //procesas la informacion
        area= PI*radio*radio;
  
        //procesar la informacion
        System.out.println("el area del circulo con radio es "+radio+" es"+area);
        leer.close();
 }
 }
 
    

