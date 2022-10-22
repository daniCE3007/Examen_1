package constructorasistema;

public class constructora {
    //Atributos
    private String direccion;
    private String sucursalID;

    //Constructor vacio
    public constructora() {
    }

    //Constructor con atributos
    public constructora(String direccion, String sucursalID) {
        //Inicializar atributos
        this.direccion = direccion;
        this.sucursalID = sucursalID;
    }

    //Objetos predefinidos
    //Empleados
    empleado empleado1 = new empleado("Pablo Cervantes", "35", 
            "Gerente", "402000876");
    empleado empleado2 = new empleado("Felipe Perez", "20", 
            "Vendedor", "308760490");
    empleado empleado3 = new empleado("Carlos Henderson", "27", 
            "Vendedor", "704370263");

    //Cliente
    cliente cliente1 = new cliente("Gerson Villalobos", "601270184", 
            "89907665", "28/12/2022");

    //Metodos GET
    public String getDireccion() {
        return direccion;
    }

    public String getSucursalID() {
        return sucursalID;
    }

    public empleado getEmpleado1() {
        return empleado1;
    }

    public empleado getEmpleado2() {
        return empleado2;
    }

    public empleado getEmpleado3() {
        return empleado3;
    }

    public cliente getCliente1() {
        return cliente1;
    }

    //Metodos SET
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSucursalID(String sucursalID) {
        this.sucursalID = sucursalID;
    }


}
