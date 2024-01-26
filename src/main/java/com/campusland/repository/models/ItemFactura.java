package com.campusland.repository.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
<<<<<<< HEAD
@NoArgsConstructor

=======
@NoAllArgsConstructor
>>>>>>> 106e0fbf88d6b4b40ff5d24205161a1db32d29c4
public class ItemFactura {

    private int cantidad;
    private Producto producto;

    public double getImporte(){
        return this.cantidad*this.producto.getPrecioVenta();
    }


    @Override
    public String toString() {
        return "ItemFactura [cantidad=" + cantidad + ", producto=" + producto.toString() + "]";
    }
    
}