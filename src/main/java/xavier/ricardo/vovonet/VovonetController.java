package xavier.ricardo.vovonet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class VovonetController {
	
	@GetMapping
	public String hello() {
		return "vovonet v1.0.0";
	}
	
	@GetMapping(value = "/grupos")
	public String getGrupos() {
		return "getGrupos";
	}

}
