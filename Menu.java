import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);


        Stack<PilaObjeto> Registro = new Stack<>();

        boolean continuar = true;
        Metodos m = new Metodos();

        while (continuar) {
            System.out.println("");
            System.out.println("");
            System.out.println("'''''''''''''''''''''''''''");
            System.out.println("Bienvenido a Cambio de texto parcial plus OMG por YEISON GUERRA"); // yo queria el punto 3
            System.out.println("''''''''''''''''''''''''''''");
            System.out.println("¿Que desea realizar????");
            System.out.println("1. Registrar Cambio ");
            System.out.println("2. Historial de cambios");
            System.out.println("3. ver el ultimo cambio realizado" );
            System.out.println("4. eliminar ultimo cambio realizado" );
            System.out.println("5 Salir"); 
            System.out.println("");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    Registro = m.LlenarPila(Registro);
                    break;
                case 2:
                    m.MostrarPila(Registro);
                    break;
                case 3:
                    m.BuscarPeek(Registro);
                    break;
                case 4:
                    Registro = m.EliminarUltimoRegistro(Registro);
                    break;
                case 5:
                    System.out.println("Hasta pronto :)");
                    System.out.println("-------------------");
                    continuar = false;
                    break;
                default:
                    System.out.println("OPCION NO VALIDA" );
                    break;
            }
        }
        sc.close();
    }
}
