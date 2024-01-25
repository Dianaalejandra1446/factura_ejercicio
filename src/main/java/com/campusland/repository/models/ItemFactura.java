package com.campusland.repository.models;

import lombok.Data;
@Data
public class ItemFactura {
    
    private int cantidad;
    private Producto producto;

    public double getImporte(){
        return this.cantidad * this.producto.getPrecioVenta();
    }
    @Override
    public String toString(){
        return "ItemFactura [cantidad="+cantidad+", producto="+ producto.toString()+ "]";
    }
}
