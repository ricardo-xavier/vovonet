package xavier.ricardo.vovonet.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xavier.ricardo.vovonet.model.Grupo;
import xavier.ricardo.vovonet.repositories.GrupoRepository;

@RestController
@RequestMapping(path = "/grupo")
public class GrupoResource {
	
	private GrupoRepository repositorio;
	
	public GrupoResource(GrupoRepository repositorio) {
		System.out.println("GrupoResource");
		this.repositorio = repositorio;
	}
	
	@GetMapping
	public String getAll() {
		System.out.println("getAll");
		List<Grupo> grupos = repositorio.findAll();
		System.out.println(grupos.size());
		return "ok";
	}

}
