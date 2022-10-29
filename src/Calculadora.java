import java.util.Scanner;

public class Calculadora {
    
 

    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int op,num1,num2,total;
        System.out.println("menu oppciones 1 suma, 2 resta, 4 multiplicacion 5 division \n ingrese el numero de la opcion que desea realizar");
        op=leer.nextInt();
 
        System.out.println("ingrese el numero 1");
        num1=leer.nextInt();
        System.out.println("ingrese numero 2");
        num2=leer.nextInt();
        leer.close();
       
 
        switch(op){
 
            case 1:
                 total=num1+num2;
       System.out.println("el total es "+total);
            break;
 
            case 2:
            total=num1-num2;
            System.out.println("el total es"+total);
 
            break;
            case 3:
            total=num1/num2;
            System.out.println("el total es"+total);
 
           
            break;
 
            case 4:
            int totalp = (int)(Math.pow(num1,num2));
            System.out.println("el total es"+totalp);
 
            break;
 
            case 5:
             total =(int)(Math.sqrt(num1));
              int total2 =(int)(Math.sqrt(num2));
            System.out.println("la raiz del primer numero es"+total+" \n la raiz del segundo numero es"+total2);
 
 
            break;
 
        }
 
 
 
 
}
}
