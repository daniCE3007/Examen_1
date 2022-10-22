package constructorasistema;

public class cliente {
    //Atributos
    private String nombreCliente;
    private String cedulaCliente;
    private String telefonoCliente;
    private String fechaPago;
    
    //Constructor vacio
    public cliente() {
    }

    //Constructor con atributos
    public cliente(String nombreCliente, String cedulaCliente, 
            String telefonoCliente, String fechaPago) {
        //Inicializar atributos
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.telefonoCliente = telefonoCliente;
        this.fechaPago = fechaPago;
    }

    //Metodos GET
    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    //Metodos SET
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }
    
}
