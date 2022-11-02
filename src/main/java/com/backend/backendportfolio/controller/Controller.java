package com.backend.backendportfolio.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backendportfolio.entity.Educacion;
import com.backend.backendportfolio.entity.Experiencia;
import com.backend.backendportfolio.entity.Proyecto;
import com.backend.backendportfolio.entity.Skill;
import com.backend.backendportfolio.entity.Usuario;
import com.backend.backendportfolio.service.EducacionService;
import com.backend.backendportfolio.service.ExperienciaService;
import com.backend.backendportfolio.service.ProyectoService;
import com.backend.backendportfolio.service.SkillService;
import com.backend.backendportfolio.service.UsuarioService;



@RestController
@CrossOrigin("*")
@RequestMapping
public class Controller {

	
	//USUARIO
	@Autowired
	private UsuarioService usuarioService;
	
	
	@PostMapping("/usuario/new")
	public void guardarUsuario (@RequestBody Usuario usuario) {
		usuarioService.guardarUsuario(usuario);
	}
	
	@GetMapping("/usuario")
	@ResponseBody
	public Usuario traerUsuario(Principal principal){
		return (Usuario) usuarioService.findByUsername(principal.getName());
	}
	
	
	@GetMapping("/usuarios")
	@ResponseBody
	public List<Usuario> TraerUsuarios(){
		return usuarioService.traerUsuarios();
	}
	
	@DeleteMapping ("/usuario/delete/{id}")
	public void borrarUsuario (@PathVariable long id) {
		usuarioService.borrarUsuario(id);
	}
	
	@PutMapping ("/usuario/edit")
	public void editarUsuario(@RequestBody Usuario usuario) {
		usuarioService.editarUsuario(usuario);
		
	}
	
	//SKILL
	@Autowired
	private SkillService skillService;
	
	@PostMapping("/skill/new")
	public void guardarSkill (@RequestBody Skill skill) {
		skillService.guardarSkill(skill);
	}
	
	@GetMapping("/skills")
	@ResponseBody
	public List<Skill> traerSkills(){
		return skillService.traerSkills();
	}
	
	@GetMapping("/skill/{id}")
	@ResponseBody
	public Skill traerSkill(@PathVariable Integer id){
		return skillService.traerSkill(id);
	}
	
	@DeleteMapping ("/skill/delete/{id}")
	public void borrarSkill (@PathVariable Integer id) {
		skillService.borrarSkill(id);
	}
	
	@PutMapping ("/skill/edit")
	public void editarSkill(@RequestBody Skill skill) {
		skillService.editarSkill(skill);
		
	}
	
	
	//PROYECTO
	@Autowired
	private ProyectoService proyectoService;
	
	@PostMapping("/proyecto/new")
	public void guardarProyecto (@RequestBody Proyecto proyecto) {
		proyectoService.guardarProyecto(proyecto);
	}
	
	@GetMapping("/proyectos")
	@ResponseBody
	public List<Proyecto> traerProyectos(){
		return proyectoService.traerProyectos();
	}
	
	@GetMapping("/proyecto/{id}")
	@ResponseBody
	public Proyecto traerProyecto(@PathVariable Integer id){
		return proyectoService.traerProyecto(id);
	}
	
	@DeleteMapping ("/proyecto/delete/{id}")
	public void borrarProyecto (@PathVariable Integer id) {
		proyectoService.borrarProyecto(id);
	}
	
	@PutMapping ("/proyecto/edit")
	public void editarProyecto(@RequestBody Proyecto proyecto) {
		proyectoService.editarProyecto(proyecto);
		
	}
	
	
	//EXPERIENCIA
	
	@Autowired
	private ExperienciaService experienciaService;
	
	@PostMapping("/experiencia/new")
	public void guardarExperiencia (@RequestBody Experiencia experiencia) {
		experienciaService.guardarExperiencia(experiencia);
	}
	
	@GetMapping("/experiencias")
	@ResponseBody
	public List<Experiencia> traerExperiencias(){
		return experienciaService.traerExperiencias();
	}
	
	@GetMapping("/experiencia/{id}")
	@ResponseBody
	public Experiencia traerExperiencia(@PathVariable Integer id){
		return experienciaService.traerExperiencia(id);
	}
	
	@DeleteMapping ("/experiencia/delete/{id}")
	public void borrarExperiencia(@PathVariable Integer id) {
		experienciaService.borrarExperiencia(id);
	}
	
	@PutMapping ("/experiencia/edit")
	public void editarExperiencia(@RequestBody Experiencia experiencia) {
		experienciaService.editarExperiencia(experiencia);
		
	}
	
	
	//EDUCACION
	
	@Autowired
	private EducacionService educacionService;
	
	@PostMapping("/educacion/new")
	public void guardarInstituto (@RequestBody Educacion educacion) {
		educacionService.guardarInstituto(educacion);
	}
	
	@GetMapping("/instituciones")
	@ResponseBody
	public List<Educacion> traerInstituciones(){
		return educacionService.traerInstituciones();
	}
	
	@GetMapping("/instituto/{id}")
	@ResponseBody
	public Educacion traerInstituto(@PathVariable Integer id){
		return educacionService.traerInstituto(id);
	}
	
	@DeleteMapping ("/educacion/delete/{id}")
	public void borrarInstituto(@PathVariable Integer id) {
		educacionService.borrarInstituto(id);
	}
	
	@PutMapping ("/instituto/edit")
	public void editarInsituto(@RequestBody Educacion educacion) {
		educacionService.editarInsituto(educacion);
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}