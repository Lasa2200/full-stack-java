package cl.java.JuegoNinjaGold.web.controller;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaController {

	
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		int gold;
		ArrayList<String> activities;
		if (session.getAttribute("gold")== null) {
			gold=0;
			activities= new ArrayList<String>();
		}else {
			gold=(int) session.getAttribute("gold");
			activities= (ArrayList<String>) session.getAttribute("activities");
		}
		session.setAttribute("gold", gold);
		session.setAttribute("activities", activities);
		return "Gold.jsp";
	}

	@RequestMapping(value="/gold", method=RequestMethod.POST)
	public String juego(HttpSession session,@RequestParam(value="opcion",required = false)String opcion) {
		int gold=(int) session.getAttribute("gold");
		ArrayList<String> activities= (ArrayList<String>) session.getAttribute("activities");
		Date fecha=new Date();
		String mensaje="";
		if (opcion.equals("farm")) {			
			gold=(int) (Math.floor(Math.random()*(20-10)+10)+gold);
			mensaje="You entered a farm and earned: "+gold+" gold "+formato(fecha, "(MMMM d'rd' yyyy hh:mm aa)");
			activities.add(mensaje);
		System.out.println(mensaje);
		}else if (opcion.equals("cave")) {			
			gold=(int) (Math.floor(Math.random()*(10-5)+5)+gold);
			
		}else if (opcion.equals("house")) {			
			gold=(int) (Math.floor(Math.random()*(5-2)+2)+gold);
			
		}else if (opcion.equals("casino")) {			
			gold=(int) (Math.floor(Math.random()*(50+50)-50)+gold);
			
		}
		session.setAttribute("gold", gold);
		session.setAttribute("activities", activities);
		return "redirect:/";
		
	}
	public String formato(Date var,String forma) {
		String fecha;
		String strDateFormat = forma;
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		fecha = sdf.format(var);
		return fecha;
}

}