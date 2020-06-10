package com.willianconk.avweb.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.willianconk.avweb.Usuario;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioResources {

	@RequestMapping(method=RequestMethod.GET)
	public List<Usuario> listar() {
		
		Usuario user = new Usuario(1, true, "noe", "1234");
		
		List<Usuario> lista = new ArrayList<>();
		lista.add(user);
		return lista;
		
	}
}
