import java.util.Scanner;
 
 public class Hazlotu {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int calificacion;

        System.out.println("deme las calificaciones del alumno");
        calificacion=leer.nextInt();

        if (calificacion>5) {
            System.out.println("el aprendiz aprobo");
        }
  

        }

        leer.close();

    }
    


