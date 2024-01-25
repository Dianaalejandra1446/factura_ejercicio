package com.campusland.utils;

import java.util.ArrayList;
import java.util.List;

import com.campusland.repository.models.Cliente;
import com.campusland.repository.models.Producto;
import com.campusland.repository.models.Factura;

public class ConexionBDList {
    private static ConexionBDList conexion;
    private List<Cliente> listaClientes;
    private List<Producto> listaProductos;
    private List<Factura> listaFactura;

    //Patron singlenton
    private ConexionBDList() {
        this.listaClientes = new ArrayList<>();
        this.listaProductos = new ArrayList<>();
        this.listaFactura = new ArrayList<>();
    }

    public static ConexionBDList getConexion(){
        if(conexion!=null){
            return conexion;
        }else{
            conexion= new ConexionBDList();
            return conexion;
        }
    }

    private void getloadDataClientes(){
        //Rellenar lista de clientes en campus
    }
    
}
