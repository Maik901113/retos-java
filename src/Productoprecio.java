import java.util.Scanner;

public class Productoprecio {
    /**
         * @param args
         * @throws Exception
         */

   public static void main(String[] args) throws Exception {
       int producto,precio=0, referencias=0,cantidad,subtotal,total=0,billete=0,cambio=0,rprodcuto=0,moexito=1,tf=1;
       String respuestaString,seguir="s";

      Scanner leer=new Scanner(System.in);
    

      for (int x=1;x<=5;x++){
       System.out.println("digite precio producto");
       precio=leer.nextInt();
       System.out.println("digite cantidad producto");
       cantidad=leer.nextInt();
       subtotal=precio*cantidad;

       System.out.println(cantidad+" del producto del precio "+precio+" es " +subtotal);
       //contador de minutos
       referencias=referencias+1;
       //iniciamos acumulador para total de la compra
       total=total+subtotal;
      
      
  
      
      }
      System.out.println("la cantidad de minutos de la compra es "+referencias);
      System.out.println("el total de su compra  "+total);
      System.out.println("su cambio es de "+cambio);
      System.out.println("digite el valor del billete con el que va a pagar");
      billete= leer.nextInt();
      cambio=billete-precio;
      System.out.println("su cambio es" + cambio);
      System.out.println("digite  si tiene minutos movil exito o 1 si 2 si no");
       respuestaString=leer.nextLine();
      
   if (tf==1){
       System.out.println("la cantidad de minutos es"+referencias);
      
  
   }
   else{
       System.out.println("no tienes minutos por no tener movil exito");
   }



      leer.close();
}
}


