package main.java.com.campusland.repository.impl;

import java.util.List;

import com.campusland.repository.models.Cliente;
import com.campusland.utils.ConexionBDList;

import main.java.com.campusland.repository.CrudRepositoryCliente;

public class CrudRepositoryClientelmp implements CrudRepositoryCliente {
//Logica interfaz

    ConexionBDList conexion=ConexionBDList.getConexion();

    @Override
    public List<Cliente> lista() {
        return conexion.getListaClientes();       
    }

    @Override
    public Cliente porDocumento(String documento) {
        Cliente resultado = null;
        for (Cliente cliente : conexion.getListaClientes()) {
            if (cliente.getDocumento().equals(documento)) {
                resultado = cliente;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
       conexion.getListaClientes().add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        for ( Cliente clienteCurrent : conexion.getListaClientes()) {
            if (clienteCurrent.getDocumento().equals(cliente.getDocumento())); {
                clienteCurrent.setNombre(cliente.getNombre());
                clienteCurrent.setApellido(cliente.getApellido());
                clienteCurrent.setDireccion(cliente.getDireccion());
                clienteCurrent.setCelular(cliente.getCelular());
                break;
            }
        }
    }

    @Override
    public void eliminar(String id) {
        for (Cliente cliente : conexion.getListaClientes()) {
            if (cliente.getDocumento().equals(id)) {
                conexion.getListaClientes().remove(cliente);
                break;
            }

        }    
}
}
