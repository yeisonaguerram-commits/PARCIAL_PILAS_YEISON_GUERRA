import java.util.Stack;
import java.util.Scanner;
public class Metodos {

Scanner sc = new Scanner(System.in);

    public Stack<PilaObjeto> LlenarPila(Stack<PilaObjeto> Almacen) {
        System.out.println("Ingrese nombre del equipo");
        System.out.println("-----------------------------");
        String nombre = sc.next();
        System.out.println("Ingrese el codigo del equipo");
        System.out.println("--------------------");
        int codigo = sc.nextInt();
        System.out.println("Ingrese el precio unitario");
        System.out.println("--------------------------");
        double precio = sc.nextDouble();
        System.out.println("Ingrese la cantidad de equipos de este tipo ingresados ");
        System.out.println("------------------------");
        int cantidad = sc.nextInt();
        int estado = 1;

        PilaObjeto nuevoEquipo = new PilaObjeto(nombre, codigo, precio, cantidad, estado);
        Almacen.push(nuevoEquipo);
        System.out.println("¡Equipo [" + nombre + "] apilado con éxito!");
        System.out.println("--------------------------------------");
        return Almacen;
        } //fin pila





    public void MostrarPila(Stack<PilaObjeto> Almacen) {
        if (Almacen.isEmpty()) {
            System.out.println("El almacen esta vacio.");
            System.out.println("--------------------------------------");
            return;
        }
        Stack<PilaObjeto> aux = new Stack<>();
        System.out.println("\n=== ELEMENTOS EN EL ALMACEN (PILA) ===");
        while (!Almacen.isEmpty()) {
            PilaObjeto equipo = Almacen.pop();
            System.out.println("Nombre de producto: " + equipo.getNombre());
            System.out.println("Codigo de equipo: " + equipo.getCodigo());
            System.out.println("Cantidad: " + equipo.getCantidad());
            System.out.println("Precio: " + equipo.getPrecio());
            System.out.println("--------------------------------------");

            aux.push(equipo);
        }
        while (!aux.isEmpty()) {
            Almacen.push(aux.pop());
        }
    } // fin mostrar almacen




    public void BuscarEquipo(Stack<PilaObjeto> Almacen) {
        if (Almacen.isEmpty()) {
            System.out.println("Almacen vacio.");
            System.out.println("--------------------------------------");
            return;
        }
        System.out.println("Ingrese el nombre del equipo a buscar:");
        String nom = sc.next();
        Stack<PilaObjeto> aux = new Stack<>();
        boolean encontrado = false;

        while (!Almacen.isEmpty()) {
            PilaObjeto equipo = Almacen.pop();

            if (equipo.getNombre().equalsIgnoreCase(nom) && encontrado == false) {
                System.out.println("\n--- Equipo Encontrado ---");
                System.out.println("Nombre: " + equipo.getNombre());
                System.out.println("Codigo: " + equipo.getCodigo());
                System.out.println("Precio: " + equipo.getPrecio());
                System.out.println("Cantidad: " + equipo.getCantidad());
                System.out.println("--------------------------------------");
                encontrado = true;
            }
            aux.push(equipo);
        }
        while (!aux.isEmpty()) {
            Almacen.push(aux.pop());
        }
        if (!encontrado) {
            System.out.println("No se encontro el equipo indicado.");
            System.out.println("--------------------------------------");
        }
    } // fin buscar equipo





    public Stack<PilaObjeto> EliminarEquipoX(Stack<PilaObjeto> Almacen) {
        if (Almacen.isEmpty()) {
            System.out.println("Almacen vacio. No hay nada para eliminar.");
            System.out.println("--------------------------------------");
            return Almacen;
        }
        System.out.println("Ingrese el nombre del equipo que desea eliminar:");
        String nom = sc.next();
        Stack<PilaObjeto> aux = new Stack<>();
        boolean eliminado = false;

        while (!Almacen.isEmpty()) {
            PilaObjeto actual = Almacen.pop();
            if (actual.getNombre().equalsIgnoreCase(nom) && !eliminado) {
                System.out.println("¡El equipo [" + actual.getNombre() + "] ha sido eliminado del almacen!");
                System.out.println("--------------------------------------");
                eliminado = true;
            } else {
                aux.push(actual);
            }
        }
        while (!aux.isEmpty()) {
            Almacen.push(aux.pop());
        }
        if (!eliminado) {
            System.out.println("No se encontro ningun equipo con el nombre indicado.");
            System.out.println("--------------------------------------");
        }
        return Almacen;
    } // fin eliminar equipo



    public Stack<PilaObjeto> OrganizarOrden(Stack<PilaObjeto> Almacen) {
        if (Almacen.isEmpty()) {
            System.out.println("Almacen vacio. No hay nada que organizar.");
            System.out.println("--------------------------------------");
            return Almacen;
        }
        Stack<PilaObjeto> aux = new Stack<>();
        while (!Almacen.isEmpty()) {
            PilaObjeto actual = Almacen.pop();
            while (!aux.isEmpty() && aux.peek().getNombre().compareToIgnoreCase(actual.getNombre()) > 0) {
                Almacen.push(aux.pop());
            }
            aux.push(actual);
        }
        while (!aux.isEmpty()) {
            Almacen.push(aux.pop());
        }
        System.out.println("Almacen organizado alfabeticamente con exito.");
        System.out.println("--------------------------------------");
        return Almacen;
    } // fin organizar almacen




    public void ContarEquipos(Stack<PilaObjeto> Almacen) {
        if (Almacen.isEmpty()) {
            System.out.println("Cantidad de equipos activos: 0");
            return;
        }
        Stack<PilaObjeto> aux = new Stack<>();
        int contador = 0;
        while (!Almacen.isEmpty()) {
            PilaObjeto equipo = Almacen.pop();
            if (equipo.getEstado() == 1) {
                contador++;
            }
            aux.push(equipo);
        }
        while (!aux.isEmpty()) {
            Almacen.push(aux.pop());
        }
        System.out.println("Cantidad de equipos activos en la Pila: " + contador);
        System.out.println("--------------------------------------");
    } // fin contar equipos


    public void DuplicarPila(Stack<PilaObjeto> Almacen) {
        Stack<PilaObjeto> aux = new Stack<>();
        Stack<PilaObjeto> copia = new Stack<>();

        while (!Almacen.isEmpty()) {
            aux.push(Almacen.pop());
        }

        while (!aux.isEmpty()) {
            PilaObjeto equipo = aux.pop();
            Almacen.push(equipo);
            copia.push(equipo);
        }

        System.out.println("--- COPIA CREADA CON EXITO ---");
        System.out.println("Total elementos en la nueva pila clonada: " + copia.size());
        System.out.println("--------------------------------------");
    } // fin duplicar


    public Stack<PilaObjeto> InvertirPila(Stack<PilaObjeto> Almacen) {
        Stack<PilaObjeto> aux1 = new Stack<>();
        Stack<PilaObjeto> aux2 = new Stack<>();
        while (!Almacen.isEmpty()) {
            aux1.push(Almacen.pop());
        }
        while (!aux1.isEmpty()) {
            aux2.push(aux1.pop());
        }
        while (!aux2.isEmpty()) {
            Almacen.push(aux2.pop());
        }
        System.out.println("La pila ha sido completamente invertida.");
        System.out.println("--------------------------------------");
        return Almacen;
    } // fin ionvertir pila
}

