package service;

import dao.ClienteDAO;
import dao.ClienteDAOImpl;
import model.Cliente;

public class ClienteService {
	
	private final ClienteDAO clienteDAO;
	
	public ClienteService() {
		this.clienteDAO = new ClienteDAOImpl();
	}

	//In futuro servirà per la DI (Dependency Injection)
	public ClienteService(ClienteDAO clienteDao) {
		this.clienteDAO = clienteDao;
	}
	
	public boolean aggiungiCliente(Cliente cliente) {
		
		if(cliente != null) {
			return clienteDAO.inserisciCliente(cliente);
		}
		
		return false;
		
	}
	
	public Cliente getSingoloCliente(int id) {
		if(id >= 0) {
			return clienteDAO.getClienteById(id);
		}
		return null;
	}
}
