package com.campusland.repository.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.campusland.utils.Formato;

import lombok.Data;

@Data
public class Factura {
    //la factura obtendra tanto la lista de items,nombre del cliente de las otras clases

    private int numeroFactura;
    private LocalDateTime fecha;
    //Agregacion la factura tiene un cliente(Los clientes puedeen existir sin la factura)
    private Cliente cliente;
    // la factura tiene muchos items(Agregacion) los items pueden existir sin la factura
    private List<ItemFactura> items;
    private static int nextNumeroFactura;


    public Factura(LocalDateTime fecha, Cliente cliente) {
        //El numero de la factura se autoincrementa
        this.numeroFactura = ++nextNumeroFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.items = new ArrayList<>();
    }

    public void agregarItem(ItemFactura item){
        //Añadir a la lista
        this.items.add(item);
    }

    public double getTotalFactura() {
        double totalFactura = 0;
        for (ItemFactura item : items) {
            //Incrementa el total de la factura
            totalFactura += item.getImporte();
        }
        return totalFactura;
    }
    

    public void display() {
        System.out.println();
        System.out.println("Factura: "+ this.numeroFactura);
        System.out.println("Cliente: "+this.cliente.getFullName());
        System.out.println("Fecha: "+ Formato.formatoFechaHora(this.getFecha()));
        System.out.println("------------------Detalle Factura------------------");
        for (ItemFactura item : this.items) {
            System.out.println(item.getProducto().getCodigoNombre() + " "+item.getCantidad() + " "+ Formato.formatoMonedaPesos(item.getImporte()));

        }
        System.out.println();
        System.out.println("Total    "+Formato.formatoMonedaPesos(this.getTotalFactura()));
        System.out.println();
    }
}
