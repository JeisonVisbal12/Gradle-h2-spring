package com.Prueba_Spring.Prueba.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Prueba_Spring.Prueba.modelos.Usuario;

public interface UsuarioDao{

	List<Usuario> getUsuarios();
	
}
