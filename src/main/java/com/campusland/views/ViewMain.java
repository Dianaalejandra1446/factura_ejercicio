package com.campusland;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.View;

import main.java.com.campusland.repository.impl.CrudRepositoryClientelmp;
import com.campusland.repository.models.Factura;
import com.campusland.repository.models.Cliente;
import main.java.com.campusland.service;
import main.java.com.campusland.views.ViewCliente;

import com.campusland.utils.ConexionBDList;

import main.java.com.campusland.services.ServiceCliente;

public class ViewMain {
    //Variables que no van a cambiar el valor
    public static final ServiceCliente serviceCliente = new ServiceClienteImpl(new CrudRepositoryClientelmp());
    public static final Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 0;

        do {
            op = menuMain();
            switch (op) {
                case 1:
                    ViewCliente.startMenu();
                    break;
            
                case 2:
                System.out.println("Menu Producto");
                    break;

                case 3:
                System.out.println("Menu Factura");
                    break;
                default:
                    System.out.println("Fin");
                    break;
            }
        } while (op >=1 && op < 4);
    }

    public static int menuMain(){
        System.out.println("------Aplicacion de Facturacion------");
        System.out.println("1. Modulo de Cliente");
        System.out.println("2. Modulo del Producto");
        System.out.println("4. Modulo del Factura");
        System.out.println("3.Salir");
        return leer.nextInt();
    }

    
}
