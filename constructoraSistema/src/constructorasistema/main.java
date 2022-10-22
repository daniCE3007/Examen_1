/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructorasistema;

import javax.swing.JOptionPane;
/**
 *
 * @author fanta
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Objetos predefinidos
        constructora constructora1 = new constructora("San Rafael de Heredia",
                "00A");

        //Objetos previamente creados para guardar los nuevos datos
        empleado empleadoNuevo = new empleado();
        cliente clienteNuevo = new cliente();
        maquinaria maquinariaNueva = new maquinaria();

        //Menu
        int opcionMenu = 0;

        while (opcionMenu != 3) {
            opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingrese una opcion: \n"
                    + "1. Agregar\n"
                    + "2. Mostrar\n"
                    + "3. Salir\n"));

            //Menu de Agregar
            if (opcionMenu == 1) {
                int opcionAgregar  = 0;

                while (opcionAgregar != 4) {
                    opcionAgregar = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ingrese una opcion: \n"
                            + "1. Agregar empleado\n"
                            + "2. Agregar cliente\n"
                            + "3. Agregar maquinaria\n"
                            + "4. Salir\n"));

                    //Agregar empleado
                    if (opcionAgregar == 1) {
                        String nombre = JOptionPane.showInputDialog(
                                "Ingrese el nombre del empleado nuevo");
                        String edad = JOptionPane.showInputDialog(
                                "Ingrese la edad del empleado nuevo");
                        String cargo = JOptionPane.showInputDialog(
                                "Ingrese el cargo del empleado nuevo");
                        String cedula = JOptionPane.showInputDialog(
                                "Ingrese la cedula del empleado nuevo");

                        empleadoNuevo = new empleado(nombre, edad, cargo,
                                cedula);
                    
                    //Agregar cliente
                    } else if (opcionAgregar == 2) {
                        String nombre = JOptionPane.showInputDialog(
                                "Ingrese el nombre del cliente");
                        String cedula = JOptionPane.showInputDialog(
                                "Ingrese la cedula del cliente");
                        String telefono = JOptionPane.showInputDialog(
                                "Ingrese el telefono del cliente");
                        String fechaPago = JOptionPane.showInputDialog(
                                "Ingrese la fecha de pago del cliente");

                       clienteNuevo = new cliente(nombre, cedula, telefono, 
                               fechaPago);

                    //Agregar maquinaria
                    } else if (opcionAgregar == 3) {
                        String modelo = JOptionPane.showInputDialog(
                                "Ingrese el modelo de la maquinaria");
                        String color = JOptionPane.showInputDialog(
                                "Ingrese el color de la maquinaria");
                        String añoCompra = JOptionPane.showInputDialog(
                                "Ingrese el año de compra de la maquinaria");

                        maquinariaNueva = new maquinaria(modelo, color, 
                                añoCompra);

                    //Salir del menu Agregar
                    } else if (opcionAgregar == 4) {
                        JOptionPane.showMessageDialog(null, "Saliendo...");

                    //Opcion invalida menu Agregar
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                    }
                }
            //Menu de Mostrar
            } else if (opcionMenu == 2) {
                int opcionMostrar = 0;

                while (opcionMostrar != 5) {
                    opcionMostrar = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ingrese una opcion: \n"
                            + "1. Mostrar empleados\n"
                            + "2. Mostrar clientes\n"
                            + "3. Mostrar maquinaria\n"
                            + "4. Mostrar datos de constructora\n"
                            + "5. Salir\n"));

                    //Mostrar empleados
                    if (opcionMostrar == 1) {
                        JOptionPane.showMessageDialog(null, "Empleado 1\n"
                                + "Nombre: " + constructora1.empleado1.
                                        getNombreEmpleado() 
                                + "\n" + "Edad: " + constructora1.empleado1.
                                        getEdadEmpleado() + "\n" + "Puesto: " 
                                + constructora1.empleado1.getPuestoEmpleado() 
                                + "\n" + "Cedula: " + constructora1.empleado1.
                                        getCedulaEmpleado());
                        JOptionPane.showMessageDialog(null, "Empleado 2\n" 
                                + "Nombre: " + constructora1.empleado2.
                                        getNombreEmpleado() + "\n" + "Edad: "
                                + constructora1.empleado2.getEdadEmpleado() 
                                + "\n" + "Puesto: " + constructora1.empleado2.
                                        getPuestoEmpleado() + "\n" + "Cedula: " 
                                + constructora1.empleado2.getCedulaEmpleado());
                        JOptionPane.showMessageDialog(null, "Empleado 3\n" 
                                + "Nombre: " + constructora1.empleado3.
                                        getNombreEmpleado() + "\n" + "Edad: " 
                                + constructora1.empleado3.getEdadEmpleado() 
                                + "\n" + "Puesto: " + constructora1.empleado3.
                                        getPuestoEmpleado() + "\n" + "Cedula: " 
                                + constructora1.empleado3.getCedulaEmpleado());

                        if (empleadoNuevo.getNombreEmpleado() == null) {
                            JOptionPane.showMessageDialog(null, "No hay "
                                    + "empleados adicionales. Para agregar uno "
                                    + "nuevo dirijase al menu de Agregar");
                        } else {
                            JOptionPane.showMessageDialog(null, "Empleado 4:\n" 
                                    + "Nombre: " + empleadoNuevo.
                                            getNombreEmpleado() 
                                    + "\n" + "Edad: " + empleadoNuevo.
                                            getEdadEmpleado() 
                                    + "\n" + "Puesto: " + empleadoNuevo.
                                            getPuestoEmpleado() 
                                    + "\n" + "Cedula: " + empleadoNuevo.
                                            getCedulaEmpleado());
                        }

                    //Mostrar clientes   
                    } else if (opcionMostrar == 2) {
                        JOptionPane.showMessageDialog(null, "Cliente 1\n" 
                                + "Nombre: " + constructora1.cliente1.
                                        getNombreCliente() 
                                + "\n" + "Cedula: " + constructora1.cliente1.
                                        getCedulaCliente() 
                                + "\n" + "Telefono: " + constructora1.cliente1.
                                        getTelefonoCliente() 
                                + "\n" + "Fecha de pago: " + constructora1.
                                        cliente1.getFechaPago());

                        if (clienteNuevo.getNombreCliente() == null) {
                            JOptionPane.showMessageDialog(null, "No hay clientes"
                                    + " adicionales. Para agregar uno nuevo "
                                    + "dirijase al menu de Agregar");
                        } else {
                            JOptionPane.showMessageDialog(null, "Cliente 2\n" 
                                    + "Nombre: " + clienteNuevo.getNombreCliente() 
                                    + "\n" + "Cedula: " + clienteNuevo.
                                            getCedulaCliente() 
                                    + "\n" + "Telefono: " + clienteNuevo.
                                            getTelefonoCliente() 
                                    + "\n" + "Fecha de pago: " + clienteNuevo.
                                            getFechaPago());
                        }
                    
                    //Mostrar maquinaria
                    } else if (opcionMostrar == 3) {
                        
                        if (maquinariaNueva.getModelo() == null) {
                            JOptionPane.showMessageDialog(null, "No hay "
                                    + "maquinaria adicional. Para agregar una "
                                    + "nueva dirijase al menu de Agregar");
                        } else {
                            JOptionPane.showMessageDialog(null, "Maquinaria 1\n"
                                    + "Modelo: " + maquinariaNueva.getModelo() 
                                    + "\n" + "Color: " + maquinariaNueva.
                                            getColor() 
                                    + "\n" + "Año de compra: " + maquinariaNueva.
                                            getAñoCompra());
                        }

                    //Mostrar datos de constructora
                    } else if (opcionMostrar == 4) {
                        JOptionPane.showMessageDialog(null, "Constructora 1\n" 
                                + "Direccion: " + constructora1.getDireccion() 
                                + "\n" + "ID de constructora: " + constructora1.
                                        getSucursalID());

                    //Salir del menu Mostrar
                    } else if (opcionMostrar == 5) {
                        JOptionPane.showMessageDialog(null, "Saliendo...");

                    //Opcion invalida menu Mostrar
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                    } 
                }
            //Salir del menu principal
            } else if (opcionMenu == 3) {
                JOptionPane.showMessageDialog(null, "Gracias por utilizar la "
                        + "aplicacion de la constructora.");

            //Opcion invalida menu principal
            } else {
                JOptionPane.showMessageDialog(null, "Opcion invalida");
            }
        } 
    }

}
