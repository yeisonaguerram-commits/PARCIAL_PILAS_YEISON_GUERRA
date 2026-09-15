public class PilaObjeto {

    private String Nombre;
    private int Codigo;
    private double Precio;
    private int Cantidad;
    private int Estado;


    public PilaObjeto(String nombre, int codigo, double precio, int cantidad, int estado) {
        this.Nombre = nombre;
        this.Codigo = codigo;
        this.Precio = precio;
        this.Cantidad = cantidad;
        this.Estado = estado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        this.Precio = precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        this.Cantidad = cantidad;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int estado) {
        this.Estado = estado;
    }
}
