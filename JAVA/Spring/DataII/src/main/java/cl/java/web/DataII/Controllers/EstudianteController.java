package cl.java.web.DataII.Controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.java.web.DataII.Models.CursoEstudiante;
import cl.java.web.DataII.Models.Estudiante;
import cl.java.web.DataII.Services.CursoEstudianteService;
import cl.java.web.DataII.Services.CursoService;
import cl.java.web.DataII.Services.EstudianteService;


@Controller
public class EstudianteController {
	@Autowired
	public CursoEstudianteService ceService;
	@Autowired
	public EstudianteService estuService;
	@Autowired
	CursoService cursoService;
	
	
	
	@GetMapping("/estudiantes/crear")
	public String crearEstudiante(@ModelAttribute("estudiante") Estudiante estudiante ) {
		return "/crear.jsp";
	}
	
	@PostMapping("/estudiantes/crear")
	public String insertarEstudiante(
			@ModelAttribute("estudiante") Estudiante estudiante
			) {
		
		estuService.agregarEstudiante(estudiante);
		
		return "redirect:/home";
	}	
	
	@GetMapping("/estudiantes/listar")
	public String listarEstudiantes(Model model) {
		//consultando desde estudiantes
		System.out.println("muestra la lista");
		List<Estudiante> listaEstudiantes = estuService.obtenerTodosEstudiantes();
		model.addAttribute("listaEstudiantes", listaEstudiantes);
				
		return "/listarEstudiante.jsp";
	}
	@RequestMapping("/estudiante/{id}")
	public String asociarEstudianteCurso(
			@PathVariable("id") Long id, Model model
			) {
		model.addAttribute("estudiante",estuService.findById(id));
		
		model.addAttribute("listaCursos", cursoService.listarCursos());
		model.addAttribute("cursoestudiante",new CursoEstudiante());
		
		model.addAttribute("ListaCursoEstudiantes", ceService.findAllByEstudianteId(id));
		
		return "/cursoEstudiante.jsp";
		
	}
}
