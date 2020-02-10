/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alquilervehiculos;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author david
 */
public class VehiculoAlquilado {
    //Atributos
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fecha;
    private int totalDiasAlquiler;
    //constructor por defecto
    public VehiculoAlquilado() {
        this.cliente = new Cliente();
        this.vehiculo = new Vehiculo();
        this.fecha = LocalDate.now();
        this.totalDiasAlquiler = 3;
    }
    //constructor parametrizado
    public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, LocalDate fecha, int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    //getters y setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getTotalDiasAlquiler() {
        return totalDiasAlquiler;
    }

    public void setTotalDiasAlquiler(int totalDiasAlquiler) {
        this.totalDiasAlquiler = totalDiasAlquiler;
    }


    
}
