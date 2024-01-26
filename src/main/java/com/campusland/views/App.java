package com.campusland.views;

import java.util.List;

import com.campusland.repository.models.Cliente;
import com.campusland.repository.models.Factura;
import com.campusland.utils.ConexionBDList;

public class App {
    public static void main(String[] args) {
        
        List<Factura> facturas = ConexionBDList.getConexion().getListaFactura();
        for (Factura factura : facturas) {
            factura.display();
        }

    }
}
