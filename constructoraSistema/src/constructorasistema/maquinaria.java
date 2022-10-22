package constructorasistema;

public class maquinaria {
    //Atributos
    private String modelo;
    private String color;
    private String añoCompra;

    //Constructor vacio
    public maquinaria() {
    }

    //Constructor con atributos
    public maquinaria(String modelo, String color, String añoCompra) {
        //Inicializar atributos
        this.modelo = modelo;
        this.color = color;
        this.añoCompra = añoCompra;
    }

    //Metodos GET
    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getAñoCompra() {
        return añoCompra;
    }

    //Metodos SET
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAñoCompra(String añoCompra) {
        this.añoCompra = añoCompra;
    }

}
