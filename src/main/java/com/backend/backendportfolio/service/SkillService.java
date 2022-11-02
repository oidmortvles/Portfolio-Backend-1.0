package com.backend.backendportfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backendportfolio.entity.Skill;
import com.backend.backendportfolio.repository.SkillRepository;

@Service
public class SkillService {
	
	@Autowired
	private SkillRepository skillRepository;
	
	public List<Skill> traerSkills(){
		return skillRepository.findAll();
		
	} 
	
	public Skill editarSkill(Skill skill) {
		return skillRepository.save(skill);
	}
	
	public Skill guardarSkill(Skill skill) {
		return skillRepository.save(skill);
	}
	
	public Skill traerSkill(Integer id) {
		return skillRepository.findById(id).orElse(null);
	}
	
	public void borrarSkill(Integer id) {
		skillRepository.deleteById(id);
	}

}
