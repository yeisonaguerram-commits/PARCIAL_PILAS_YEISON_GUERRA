import java.util.Stack;
import java.util.Scanner;
public class Metodos {

Scanner sc = new Scanner(System.in);

    public Stack<PilaObjeto> LlenarPila(Stack<PilaObjeto> Registro) {
        System.out.println("Ingrese texto anterior");
        System.out.println("-----------------------------");
        String textoAnterior = sc.next();
        System.out.println("Ingrese el texto nuevo");
        System.out.println("--------------------");
        String textoNuevo = sc.next();
        System.out.println("Ingrese la fecha de cambio");
        System.out.println("--------------------------");
        String Fecha = sc.next();
        System.out.println("Ingrese nombre de usuario");
        System.out.println("------------------------");
        String NombreUsuario = sc.next();
        int estado = 1;

        PilaObjeto nuevoEquipo = new PilaObjeto(textoAnterior, textoNuevo, Fecha, NombreUsuario, estado);
        Registro.push(nuevoEquipo);
        System.out.println("El cambio del usuario [" + NombreUsuario + "] ha sido registrado");
        System.out.println("--------------------------------------");
        return Registro;
        } //fin pila





    public void MostrarPila(Stack<PilaObjeto> Registro) {
        if (Registro.isEmpty()) {
            System.out.println("El Historial esta vacio.");
            System.out.println("--------------------------------------");
            return;
        }
        Stack<PilaObjeto> aux = new Stack<>();
        System.out.println("=== HISTORIAL ===");
        while (!Registro.isEmpty()) {
            PilaObjeto cambio = Registro.pop();
            System.out.println("Registro anterior: " + cambio.getTextoAnterior());
            System.out.println("Registro nuevo: " + cambio.getTextoNuevo());
            System.out.println("Fecha del cambio: " + cambio.getFecha());
            System.out.println("Nombre del usuario: " + cambio.getNombreUsuario());
            System.out.println("--------------------------------------");

            aux.push(cambio);
        }
        while (!aux.isEmpty()) {
            Registro.push(aux.pop());
        }
    } // fin mostrar almacen




    public void BuscarPeek(Stack<PilaObjeto> Registro) {
        if (Registro.isEmpty()) {
            System.out.println("Registro vacio.");
            System.out.println("--------------------------------------");
            return;
        } 
            PilaObjeto cambio = Registro.peek();
            
            System.out.println("--- Ultimo cambio registrado ---");
            System.out.println("Registro anterior: " + cambio.getTextoAnterior());
            System.out.println("Registro nuevo: " + cambio.getTextoNuevo());
            System.out.println("Fecha del cambio: " + cambio.getFecha());
            System.out.println("Nombre del usuario: " + cambio.getNombreUsuario());
            System.out.println("--------------------------------------");
        }
    // fin buscar equipo





    public Stack<PilaObjeto> EliminarUltimoRegistro(Stack<PilaObjeto> Registro) {
        if (Registro.isEmpty()) {
            System.out.println("Registro vacio. No hay nada para eliminar.");
            System.out.println("--------------------------------------");
            return Registro;
        }
            PilaObjeto actual = Registro.pop();
                System.out.println("El Registro del usuario [" + actual.getNombreUsuario() + "] ha sido eliminado del historial!");
        return Registro;
    } // fin eliminar equipo
} // FIN METODOS

