package com.backend.backendportfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.backendportfolio.entity.Usuario;
import com.backend.backendportfolio.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	UsuarioRepository userRepository;
	
	@Override
	  @Transactional
	  public UserDetails loadUserByUsername(String username){
	    Usuario user = userRepository.findByUsername(username);
	    
	    		if (user == null) throw new UsernameNotFoundException(username);;

	    return UserDetailsImpl.build(user);
	  }

}
