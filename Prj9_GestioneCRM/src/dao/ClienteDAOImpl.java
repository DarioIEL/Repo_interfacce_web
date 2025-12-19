package dao;

import java.util.List;

import model.Cliente;

public class ClienteDAOImpl implements ClienteDAO{

	@Override
	public boolean inserisciCliente(Cliente cliente) {
		String sql = "INSERT INTO clienti (nome, cognome, dataRegistrazione) VALUES (?,?,?)";
		
		//Qui avviene la connessione ecc ecc
		return false;
	}

	@Override
	public List<Cliente> getAllClienti() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente getClienteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
