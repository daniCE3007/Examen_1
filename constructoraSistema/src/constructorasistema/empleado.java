package constructorasistema;

public class empleado {
    //Atributos
    private String nombreEmpleado;
    private String edadEmpleado;
    private String puestoEmpleado;
    private String cedulaEmpleado;

    //Constructor vacio
    public empleado() {
    }

    //Constructor con atributos
    public empleado(String nombreEmpleado, String edadEmpleado, 
            String puestoEmpleado, String cedulaEmpleado) {
        //Inicializar atributos
        this.nombreEmpleado = nombreEmpleado;
        this.edadEmpleado = edadEmpleado;
        this.puestoEmpleado = puestoEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
    }

    //Metodos GET
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getEdadEmpleado() {
        return edadEmpleado;
    }

    public String getPuestoEmpleado() {
        return puestoEmpleado;
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    //Metodos SET
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setEdadEmpleado(String edadEmpleado) {
        this.edadEmpleado = edadEmpleado;
    }

    public void setPuestoEmpleado(String puestoEmpleado) {
        this.puestoEmpleado = puestoEmpleado;
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }
}
