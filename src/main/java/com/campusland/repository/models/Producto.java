package com.campusland.repository.models;

import com.campusland.utils.Formato;

import lombok.Data;

@Data
public class Producto {
    
    private int codigo;
    private String nombre;
    private String descripcion;
    private double precioVenta;
    private double precioCompra;
    private static int nextCodigo;

    public Producto(){
        //Es como simular el autoincrement
        this.codigo=++nextCodigo;
    }

    //Constructor
    public Producto(String nombre,double precioVenta,double precioCompra,String descripcion){
        this.codigo=++nextCodigo;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.descripcion = descripcion;
    }

    //Ganancia del producto
    public double getUtilidad(){
        return precioVenta-precioCompra;
    }

    //To string para traer la info del producto
    @Override
    public String toString(){
        return "Producto [codigo"+ codigo +", nombre= "+ nombre + ", precioVenta= "+precioVenta+ ",precioCompra= "+ precioCompra + ",descripcion= "+ descripcion+"]";
    }
    public String getCodigoNombre(){
        return this.codigo+ " " + this.nombre + " "+ Formato.formatoMonedaPesos(this.precioVenta);
    }
}
