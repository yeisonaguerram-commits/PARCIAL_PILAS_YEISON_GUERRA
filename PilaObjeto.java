public class PilaObjeto {

    private String textoAnterior;
    private String textoNuevo;
    private String Fecha;
    private String NombreUsuario;
    private int estado;

    public PilaObjeto(String textoAnterior, String textoNuevo, String fecha, String nombreUsuario, int estado) {
        this.textoAnterior = textoAnterior;
        this.textoNuevo = textoNuevo;
        Fecha = fecha;
        NombreUsuario = nombreUsuario;
        this.estado = estado;
    }

    public String getTextoAnterior() {
        return textoAnterior;
    }

    public void setTextoAnterior(String textoAnterior) {
        this.textoAnterior = textoAnterior;
    }

    public String getTextoNuevo() {
        return textoNuevo;
    }

    public void setTextoNuevo(String textoNuevo) {
        this.textoNuevo = textoNuevo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        NombreUsuario = nombreUsuario;
    }

        public int estado() {
        return estado;
    }

    public void estado(String estado) {
        NombreUsuario = estado;
    }

    

}
