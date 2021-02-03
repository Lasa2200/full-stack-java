package com.talento.rutas.web.Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController

public class DojoController {	

	@RequestMapping("/{captura}")
	public String  showLesson(@PathVariable("captura") String captura){

		if ("dojo".equals(captura)){
			return "¡El Dojo es increíble!";
		}else {
			if ("burbank-dojo".equals(captura)) {
				return "El Dojo Burbank está localizado al sur de California";
			}else {
				if ("san-jose".equals(captura)){
					return "El Dojo SJ es el cuartel general";
				}
			}
		}
		return "Siga participando";

	} 			


}

