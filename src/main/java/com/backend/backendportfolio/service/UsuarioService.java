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
	
	public List<Usuario> findAll(){
		return usuarioRepository.findAll();
		
	}
	
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	
	public Usuario get(Integer id) {
		return usuarioRepository.getReferenceById(id);
	}
	
	
	public void delete(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	
	

}

