package com.backend.backendportfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backendportfolio.entity.Usuario;
import com.backend.backendportfolio.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> traerUsuarios(){
		return usuarioRepository.findAll();
		
	}
	
	public Usuario guardarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public Usuario editarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	
	public Usuario traerUsuario(Long id) {
		return usuarioRepository.getReferenceById(id);
	}
	
	
	public void borrarUsuario(Long id) {
		usuarioRepository.deleteById(id);
	}
	
	
	
	

}

