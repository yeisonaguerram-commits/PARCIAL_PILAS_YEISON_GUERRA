import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);


        Stack<PilaObjeto> Almacen = new Stack<>();

        boolean continuar = true;
        Metodos m = new Metodos();

        while (continuar) {
            System.out.println("'''''''''''''''''''''''''''");
            System.out.println("Bienvenido a compute parcial plus por YEISON GUERRA");
            System.out.println("''''''''''''''''''''''''''''");
            System.out.println("¿Que desea realizar????");
            System.out.println("1) Ingresar equipo a almacen (Push)");
            System.out.println("2) Mostrar almacen de equipos");
            System.out.println("3) Buscar un equipo dentro de la pila");
            System.out.println("4) Eliminar un equipo específico X");
            System.out.println("5) Organizar almacen en orden");
            System.out.println("6) Contar total de equipos activos");
            System.out.println("7) Clonar/Duplicar almacen actual");
            System.out.println("8) Invertir el orden de la pila");
            System.out.println("9) Salir");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    Almacen = m.LlenarPila(Almacen);
                    break;
                case 2:
                    m.MostrarPila(Almacen);
                    break;
                case 3:
                    m.BuscarEquipo(Almacen);
                    break;
                case 4:
                    Almacen = m.EliminarEquipoX(Almacen);
                    break;
                case 5:
                    Almacen = m.OrganizarOrden(Almacen);
                    break;
                case 6:
                    m.ContarEquipos(Almacen);
                    break;
                case 7:
                    m.DuplicarPila(Almacen);
                    break;
                case 8:
                    Almacen = m.InvertirPila(Almacen);
                    break;
                case 9:
                    System.out.println("Hasta pronto :)");
                    System.out.println("-------------------");
                    continuar = false;
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }
        }
        sc.close();
    }
}
