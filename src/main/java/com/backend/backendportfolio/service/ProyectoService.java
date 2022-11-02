package com.backend.backendportfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backendportfolio.entity.Proyecto;
import com.backend.backendportfolio.repository.ProyectoRepository;

@Service
public class ProyectoService {
	
	@Autowired
	private ProyectoRepository proyectoRepository;
	
	public List<Proyecto> traerProyectos(){
		return proyectoRepository.findAll();
		
	}
	
	public Proyecto editarProyecto(Proyecto proyecto) {
		return proyectoRepository.save(proyecto);
	}
	
	public Proyecto guardarProyecto(Proyecto proyecto) {
		return proyectoRepository.save(proyecto);
	}
	
	public Proyecto traerProyecto(Integer id) {
		return proyectoRepository.findById(id).orElse(null);
	}
	
	public void borrarProyecto (Integer id) {
		proyectoRepository.deleteById(id);
	}
	
}
