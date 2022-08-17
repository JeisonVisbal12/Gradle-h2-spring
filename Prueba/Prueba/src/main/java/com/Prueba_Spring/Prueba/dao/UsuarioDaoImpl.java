package com.Prueba_Spring.Prueba.dao;

import java.io.Console;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Prueba_Spring.Prueba.modelos.Usuario;

@Repository
@Transactional
public class UsuarioDaoImpl implements UsuarioDao {

	@PersistenceContext
	EntityManager entityManager;
		
	@Override
	@Transactional
	public List<Usuario> getUsuarios() {
		String query = "FROM Usuario";
		System.out.println(query);
		return entityManager.createQuery(query).getResultList();
		
		}

}
