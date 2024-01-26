package com.campusland;
import java.util.List;
import java.util.Scanner;

import main.java.com.campusland.repository.impl.CrudRepositoryClientelmp;
import com.campusland.repository.models.Factura;
import com.campusland.repository.models.Cliente;
import main.java.com.campusland.services.impl.ServiceClienteImpl;
import com.campusland.utils.ConexionBDList;

import main.java.com.campusland.services.ServiceCliente;

public class ViewMain {
    public static final ServiceCliente serviceCliente = new ServiceClienteImpl(new CrudRepositoryClientelmp())
    public static final Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {

        List<Factura> facturas = ConexionBDList.getConexion().getListFacturas();
        for (Factura factura : facturas) {
            factura.display();
        }
    }

    
}
