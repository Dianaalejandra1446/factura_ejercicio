package main.java.com.campusland.services.impl;

import java.util.List;

import com.campusland.repository.models.Cliente;

import main.java.com.campusland.exceptiones.clienteExcepciones.ClienteException;
import main.java.com.campusland.repository.CrudRepositoryCliente;
import main.java.com.campusland.services.ServiceCliente;

public class ServiceClienteImpl implements ServiceCliente{

    private final CrudRepositoryCliente crudRepositoryCliente;

    public ServiceClienteImpl(CrudRepositoryCliente crudRepositoryCliente){
        this.crudRepositoryCliente= crudRepositoryCliente;
    }

    @Override
    public List<Cliente> listar() {
       return this.crudRepositoryCliente.lista();
    }

    @Override
    public Cliente porDocumento(String documento) throws ClienteException {
       Cliente clienet=this.crudRepositoryCliente.porDocumento(documento);
       if(cliente !=null){
            return cliente;
       }else{
            throw new ClienteException("No se encontro cliente por id");
       }
    }

    @Override
    public void crear(Cliente ciente) {
       this.crudRepositoryCliente.crear(ciente);
    }

    @Override
    public void editar(Cliente cliente) {
        this.crudRepositoryCliente.editar(cliente);
    }

    @Override
    public void eliminar(String id) {
      this.crudRepositoryCliente.eliminar(id);
    }
    
}
