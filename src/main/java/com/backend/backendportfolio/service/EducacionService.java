package com.backend.backendportfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backendportfolio.entity.Educacion;
import com.backend.backendportfolio.repository.EducacionRepository;

@Service
public class EducacionService {

	@Autowired
	private EducacionRepository educacionRepository;
	

	public List<Educacion> traerInstituciones(){
		return educacionRepository.findAll();
		
	}
	
	public Educacion editarInsituto(Educacion educacion) {
		return educacionRepository.save(educacion);
	}
	
	public Educacion guardarInstituto(Educacion educacion) {
		return educacionRepository.save(educacion);
	}
	
	
	public Educacion traerInstituto(Integer id) {
		return educacionRepository.findById(id).orElse(null);
	}
	
	
	public void borrarInstituto(Integer id) {
		educacionRepository.deleteById(id);
	}

}
