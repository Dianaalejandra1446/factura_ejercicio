package com.campusland.views;

import com.campusland.model.Factura;
import com.campusland.utils.ConexionBDList;

import java.util.List;

public class App {
    public static void main(String[] args) {
        
        List<Factura> facturas = ConexionBDList.getConexion().getListaFactura();
        for (Factura factura : facturas) {
            factura.display();
        }
    }
}
