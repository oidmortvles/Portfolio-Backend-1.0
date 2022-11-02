package com.backend.backendportfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.backendportfolio.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	 Usuario findByUsername(String username);
	Usuario findByUsernameAndPassword(String username,String password);
	 Boolean existsByUsername(String username);
	 Boolean existsByMail(String mail);

}
