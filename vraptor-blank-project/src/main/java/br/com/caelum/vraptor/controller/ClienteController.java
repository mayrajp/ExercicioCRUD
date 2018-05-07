package br.com.caelum.vraptor.controller;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import dao.ClienteDao;
import model.Cliente;


@Controller
public class ClienteController {

	@Inject
	private ClienteDao clienteDao;
	
	@Path("/teste")
	public void teste() {
	   Cliente c = new Cliente();
		  c.setNome("Mayra");
		  c.setCpf("40115689978");
		  c.setDataNascimento("13/09/1990");
		  
		  
		  // EntityManagerFactory factory = Persistence.createEntityManagerFactory("controlefinancas");
		   
		  // EntityManager manager = factory.createEntityManager();
		    
		   clienteDao.adiciona(c);
		  /* manager.getTransaction().begin();
		   manager.persist(c);
		   manager.getTransaction().commit();
		   manager.close();
		   factory.close();
		   */
		   System.out.println("Dados gravados com sucesso");
 }
}
