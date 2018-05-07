package dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.Cliente;

public class ClienteDao {
	@Inject
	private EntityManager manager;
	
	public void adiciona(Cliente cliente) {
        manager.persist(cliente);
    }

}
