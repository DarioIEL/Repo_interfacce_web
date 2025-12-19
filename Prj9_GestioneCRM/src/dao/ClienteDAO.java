package dao;

import java.util.List;

import model.Cliente;

public interface ClienteDAO {

	boolean inserisciCliente(Cliente cliente);
	List<Cliente> getAllClienti();	
	Cliente getClienteById(int id);
}
