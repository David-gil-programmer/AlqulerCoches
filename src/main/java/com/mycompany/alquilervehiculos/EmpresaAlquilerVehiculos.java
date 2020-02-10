/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alquilervehiculos;

import java.time.LocalDate;

/**
 *
 * @author david
 */
public class EmpresaAlquilerVehiculos {

    //atributos
    private String cif;
    private String nombre;
    private String paginaWeb;

    //Atributos para controlar el total de clientes que tiene la empresa 
    //y array de almacenamiento para los objetos Cliente
    private int totalClientes;
    private Cliente[] clientes;

    //Atributos para controlar el total de vehiculos disponibles en
    //alquiler que tiene la empresa y array de almacenamiento para los objetos Vehiculo
    private int totalVehiculos;
    private Vehiculo[] vehiculos;

    //Atributos para controlar el histórico de alquileres: total de alquileres realizados 
    //y array de almacenamiento para los objetos VehiculoAlquilado
    private int totalAlquileres;
    private VehiculoAlquilado[] alquileres;

    // se omiten los métodos ‘get’ y ‘set’ de la clase
    //La clase EmpresaAlquilerVehiculos declara tres arrays para registrar a sus clientes, vehículos y el histórico de vehículos alquilados. 
    //El array clientes puede almacenar hasta 50 objetos de tipo Cliente, 
    //el array vehiculos puede almacenar hasta 50 objetos de tipo Vehiculo 
    //y el array alquileres tiene  capacidad  para  almacenar  100  objetos  de  tipo VehiculoAlquilado.
    public EmpresaAlquilerVehiculos(String cif, String nombre, String paginaWeb) {
        this.cif = cif;

        this.nombre = nombre;

        this.paginaWeb = paginaWeb;

        this.totalClientes = 0;

        this.clientes = new Cliente[50];

        this.totalVehiculos = 0;

        this.vehiculos = new Vehiculo[50];

        this.totalAlquileres = 0;

        this.alquileres = new VehiculoAlquilado[100];
    }

    //Getters y setters
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    //El método     
    //getCliente(String nif) busca la referencia del cliente con el NIF dado en el array clientes.
    public Cliente getClientes(String nif) {
        for (int i = 0; i < this.getTotalClientes(); i++) {

            if (this.clientes[i].getnif().equals(nif)) {
                return this.clientes[i];
            }
        }
        return null;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    // mismo que get clinetes pero con matricula
    public Vehiculo getVehiculos(String matricula) {
        for (int i = 0; i < this.getTotalVehiculos(); i++) {

            if (this.vehiculos[i].getMatricula().equals(matricula)) {
                return this.vehiculos[i];
            }
        }

        return null;

    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getTotalAlquileres() {
        return totalAlquileres;
    }

    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }

    public VehiculoAlquilado[] getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(VehiculoAlquilado[] alquileres) {
        this.alquileres = alquileres;
    }

    //  registrarCliente(Cliente nuevo). Añade un nuevo cliente a la lista de clientes de la empresa.
    public void registrarCliente(Cliente nuevo) {
        this.clientes[this.totalClientes] = nuevo;
        this.totalClientes++;

    }

    //   registrarVehiculo(Vehiculo nuevo).  Añade  un  vehículo  al catálogo de vehículos de la empresa.
    public void registrarVehiculo(Vehiculo nuevo) {
        this.vehiculos[this.totalVehiculos] = nuevo;
        this.totalVehiculos++;
    }

    // imprimirClientes(). Muestra la relación de clientes de la empresa. 
    //Este método recorre el array clientes y va mostrando los datos de cada cliente.
    public void imprimirClientes() {
        System.out.println("NIF cliente\tNombre\n");

        for (int i = 0; i < this.totalClientes; i++) {
            System.out.println(clientes[i].getNif());
            System.out.println(clientes[i].getNombre());
            System.out.println(clientes[i].getApellidos());
        }
    }

    // imprimirVehiculos(). Muestra  el  catálogo  de  vehículos  de  la empresa, recorriendo el array vehiculos 
    //y llamando al método toString() de cada uno .
    public void imprimirVehiculos() {
        System.out.println("Matricula\tModelo\tColor\tImporte\tDisponible\n");

        for (int i = 0; i < this.totalVehiculos; i++) {
            System.out.println(vehiculos[i].getMatricula()+" ");
            System.out.println(vehiculos[i].getModelo()+" ");
            System.out.println(vehiculos[i].getColor()+" ");
            System.out.println(vehiculos[i].getTarifa()+" ");
            System.out.println(vehiculos[i].isDisponible());
        }
    }

    //alquilarVehiculo(String matricula,String nif,int dias). 
    //Modifica la disponibilidad del vehículo para indicar que está alquilado y añade un objeto de
    //tipo VehiculoAlquilado al array de vehículos alquilados.
    //El método alquilarVehiculo(String matricula, String nif, int dias).
    public void alquilarVehiculo(String matricula, String nif, int dias) {// si no existe(null) dara un error
        Cliente cliente = getClientes(nif);
        Vehiculo vehiculo = getVehiculos(matricula);

// busca el cliente con el NIF dado en el array
// clientes y el vehículo con la matrícula dada en el
// array vehiculos, si el vehículo está disponible se
// alquila con la fecha actual, que se obtiene
// ejecutando los métodos diaHoy(), mesHoy() y
// añoHoy(), cuya declaración no se incluye
        if (vehiculo.isDisponible()) {
            vehiculo.setDisponible(false);
            this.alquileres[this.totalAlquileres] = new VehiculoAlquilado(cliente, vehiculo, LocalDate.now(), dias);

            this.totalAlquileres++;

        }

    }
    //ecibirVehiculo(String matricula). 
    //Modifica la disponibilidad del vehículo para que se pueda alquilar de nuevo.

    public void recibirVehiculo(String matricula) {

// busca el vehículo con la matrícula dada en el
// array vehiculos y modifica su disponibilidad
// para que se pueda alquilar de nuevo
        Vehiculo vehiculo = getVehiculos(matricula);

        if (vehiculo != null) {
            vehiculo.setDisponible(true);
        }

    }

}
