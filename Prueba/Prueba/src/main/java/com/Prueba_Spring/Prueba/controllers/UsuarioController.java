package com.Prueba_Spring.Prueba.controllers;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Prueba_Spring.Prueba.dao.UsuarioDao;
import com.Prueba_Spring.Prueba.modelos.Usuario;
 



@RestController
public class UsuarioController {
	@Autowired
	private UsuarioDao usuarioDao;
	
@RequestMapping(value = "usuario/{id}")
public Usuario getUsuario(@PathVariable Long id) {
	Usuario usuario = new Usuario();
	usuario.setId(id);
	usuario.setNombre("Jeison");
	usuario.setApellido("Visbal");
	usuario.setEmail("visbalgomez@gmail.com");
	usuario.setTelefono("3158929677");
	return usuario;
}
@RequestMapping(value = "usuarios")
public List<Usuario> getUsuarios() {
	
	return usuarioDao.getUsuarios();
}
@RequestMapping(value = "usuario1")
public Usuario editar() {
	Usuario usuario = new Usuario();
	usuario.setNombre("Jeison");
	usuario.setApellido("Visbal");
	usuario.setEmail("visbalgomez@gmail.com");
	usuario.setTelefono("3158929677");
	return usuario;
}
@RequestMapping(value = "usuario12")
public Usuario eliminar() {
	Usuario usuario = new Usuario();
	usuario.setNombre("Jeison");
	usuario.setApellido("Visbal");
	usuario.setEmail("visbalgomez@gmail.com");
	usuario.setTelefono("3158929677");
	return usuario;
}
@RequestMapping(value = "usuario123")
public Usuario buscar() {
	Usuario usuario = new Usuario();
	usuario.setNombre("Jeison");
	usuario.setApellido("Visbal");
	usuario.setEmail("visbalgomez@gmail.com");
	usuario.setTelefono("3158929677");
	return usuario;
}
}
