package com.campusland.utils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.campusland.repository.models.Cliente;
import com.campusland.repository.models.Factura;
import com.campusland.repository.models.ItemFactura;
import com.campusland.repository.models.Producto;

import lombok.Data;

@Data
public class ConexionBDList {

    private static ConexionBDList conexion;
    private List<Cliente> listaClientes;
    private List<Producto> listaProductos;
<<<<<<< HEAD
    private List<Factura> listaFacturas;
=======
    private List<Factura> listaFactura;
    
>>>>>>> 106e0fbf88d6b4b40ff5d24205161a1db32d29c4

    //Patron singlenton
    private ConexionBDList() {
        this.listaClientes = new ArrayList<>();
        this.listaProductos = new ArrayList<>();
<<<<<<< HEAD
        this.listaFacturas = new ArrayList<>();
=======
        this.listaFactura = new ArrayList<>();
>>>>>>> 106e0fbf88d6b4b40ff5d24205161a1db32d29c4
        this.loadData();
    }

    private void loadData() {
        getLoadDataClientes();
        getLoadDataFactura();
        getLoadDataProductos();
    }

<<<<<<< HEAD
    private void getLoadDataClientes() {
=======
    private void getloadDataClientes(){
        //Rellenar lista de clientes 
>>>>>>> 106e0fbf88d6b4b40ff5d24205161a1db32d29c4
        listaClientes.add(new Cliente("Juan", "Perez", "jperez@gmail.com", "dirección", "celular", "13822001"));
        listaClientes.add(new Cliente("Maria", "Gomez", "mariag@gmail.com", "dirección", "celular", "13822002"));
        listaClientes.add(new Cliente("Andres", "Sarmiento", "andress@gmail.com", "dirección", "celular", "13822003"));
        listaClientes.add(new Cliente("Lizeth", "Villamizar", "lizethv@gmail.com", "dirección", "celular", "13822004"));
        listaClientes.add(new Cliente("Gladys", "Moreno", "gladysm@gmail.com", "dirección", "celular", "13822005"));
        listaClientes.add(new Cliente("Sebastian", "Dominguez", "sebastian@gmail.com", "dirección", "celular", "13822006"));
        listaClientes.add(new Cliente("Maura", "Sabolla", "mauras@gmail.com", "dirección", "celular", "13822007"));
        listaClientes.add(new Cliente("Catalina", "Moreno", "catalinam@gmail.com", "dirección", "celular", "13822008"));
        listaClientes.add(new Cliente("Celina", "Torres", "celinat@gmail.com", "dirección", "celular", "13822009"));
        listaClientes.add(new Cliente("Diego", "Rangel", "diegor@gmail.com", "dirección", "celular", "13822010"));
        listaClientes.add(new Cliente("Camilo", "Rodriguez", "camilor@gmail.com", "dirección", "celular", "13822011"));
        listaClientes.add(new Cliente("Diana", "Tarazona", "dianat@gmail.com", "dirección", "celular", "13822012"));

    }
<<<<<<< HEAD

=======
>>>>>>> 106e0fbf88d6b4b40ff5d24205161a1db32d29c4
    private void getLoadDataProductos() {
        listaProductos.add(new Producto("Tv 64 Samsung", 340000, 300000,""));
        listaProductos.add(new Producto("Tv 45 Lg", 240000, 200000,""));
        listaProductos.add(new Producto("Tv 32 Lg", 140000, 900000,""));
        listaProductos.add(new Producto("Tv 22 Lg", 80000, 50000,""));
        listaProductos.add(new Producto("Tv 80 Samsung", 940000, 500000,""));
        listaProductos.add(new Producto("Tv 45 Samsung", 240000, 120000,""));
        listaProductos.add(new Producto("Xiomi Note 15", 140000, 90000,""));
        listaProductos.add(new Producto("Xiomi Note 14", 900000, 50000,""));
        listaProductos.add(new Producto("Xiomi Note 13", 700000, 30000,""));
        listaProductos.add(new Producto("Xiomi Note 11", 600000, 20000,""));
    }
<<<<<<< HEAD
=======
    private void loadData(){
        getloadDataClientes();
        getLoadDataFactura();
        getLoadDataProductos();
    }
>>>>>>> 106e0fbf88d6b4b40ff5d24205161a1db32d29c4

     private void getLoadDataFactura() {

        Producto tv = new Producto("Tv 64 Samsung", 3400000, 3000000,"");
        Producto phone = new Producto("Xiomi Note 15", 1400000, 900000,"");
        Cliente cliente = new Cliente("Juana", "Perez", "juanap@gmail.com", "dirección", "celular", "13822002");
        Factura factura = new Factura(LocalDateTime.now(), cliente);
<<<<<<< HEAD
=======

>>>>>>> 106e0fbf88d6b4b40ff5d24205161a1db32d29c4
        factura.agregarItem(new ItemFactura(1, phone));
        factura.agregarItem(new ItemFactura(2, tv));

        Factura factura1 = new Factura(LocalDateTime.now(),
<<<<<<< HEAD
                new Cliente("Maria", "Gomez", "mariag@gmail.com", "dirección", "celular", "13822002"));
                factura1.agregarItem(new ItemFactura(1, new Producto("Tv 22 Lg", 80000, 50000,"")));
                factura1.agregarItem(new ItemFactura(2, new Producto("Tv 45 Samsung", 240000, 120000,"")));
=======
        new Cliente("Maria", "Gomez", "mariag@gmail.com", "dirección", "celular", "13822002"));
        factura1.agregarItem(new ItemFactura(1, new Producto("Tv 22 Lg", 80000, 50000,"")));
        factura1.agregarItem(new ItemFactura(2, new Producto("Tv 45 Samsung", 240000, 120000,"")));
>>>>>>> 106e0fbf88d6b4b40ff5d24205161a1db32d29c4

        Factura factura2 = new Factura(LocalDateTime.now(), new Cliente("Celina", "Torres", "celinat@gmail.com", "dirección", "celular", "13822009"));
        factura2.agregarItem(new ItemFactura(1, new Producto("Tv 22 Lg", 80000, 50000,"")));
        factura2.agregarItem(new ItemFactura(2, new Producto("Tv 45 Samsung", 240000, 120000,"")));

        Factura factura3 = new Factura(LocalDateTime.now(),
<<<<<<< HEAD
                new Cliente("Dora", "Paps", "dorap@gmail.com", "dirección", "celular", "13822009"));
                factura3.agregarItem(new ItemFactura(1, new Producto("Tv 22 Lg", 80000, 50000,"")));
                factura3.agregarItem(new ItemFactura(2, new Producto("Tv 45 Samsung", 240000, 120000,"")));

        listaFacturas.add(factura);
        listaFacturas.add(factura1);
        listaFacturas.add(factura2);
        listaFacturas.add(factura3);
=======
        new Cliente("Dora", "Paps", "dorap@gmail.com", "dirección", "celular", "13822009"));
        factura3.agregarItem(new ItemFactura(1, new Producto("Tv 22 Lg", 80000, 50000,"")));
        factura3.agregarItem(new ItemFactura(2, new Producto("Tv 45 Samsung", 240000, 120000,"")));

        listFacturas.add(factura);
        listFacturas.add(factura1);
        listFacturas.add(factura2);
        listFacturas.add(factura3);
>>>>>>> 106e0fbf88d6b4b40ff5d24205161a1db32d29c4

    }
    
}
