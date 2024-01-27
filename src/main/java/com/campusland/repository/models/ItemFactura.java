package com.campusland.repository.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class ItemFactura {

    private int cantidad;
    //Obtenemos los productos
    private Producto producto;

    public double getImporte(){
        //Calcula el precio total de productos

        //Obtenemos el precio del producto
        return this.cantidad*this.producto.getPrecioVenta();
    }


    @Override
    public String toString() {
        return "ItemFactura [cantidad=" + cantidad + ", producto=" + producto.toString() + "]";
    }
    
}