/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alquilervehiculos;

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


    for (int i=0; i<this.totalClientes; i++)
    System.out.println(clientes[i].getNif());
    System.out.println(clientes[i].getNombre());
    System.out.println(clientes[i].getApellidos());
    }


}
