package cl.java.web.LibrosApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.java.web.LibrosApi.Models.Libro;
import cl.java.web.LibrosApi.Services.LibroService;


@RestController
public class LibroApi{
    
	@Autowired
	private  LibroService libroService;
    
    @RequestMapping("/api/libro")
    public List<Libro> index() {
        return libroService.allLibro();
    }
	    
	    @RequestMapping(value="/api/books", method=RequestMethod.POST)
	    public Libro create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
	        Libro libro = new Libro(title, desc, lang, numOfPages);
	        return libroService.createLibro(libro);
	    }
	    
	    @RequestMapping("/api/libros/{id}")
	    public Libro show(@PathVariable("id") Long id) {
	        Libro libro = libroService.findLibro(id);
	        return libro;
	    }
	}

