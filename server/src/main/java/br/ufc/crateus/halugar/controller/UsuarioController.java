package br.ufc.crateus.halugar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.ufc.crateus.halugar.model.Usuario;
import br.ufc.crateus.halugar.service.UsuarioService;

@RestController
@RequestMapping(value = "/halugar/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	@RequestMapping(value = "/halugar/usuario", method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> getUsuarios(){
		return new ResponseEntity<List<Usuario>>((List<Usuario>)
				usuarioService.getUsuarios(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/halugar/usuario/{id}", method = RequestMethod.GET)
	public Usuario getUsuarioById(long id) {
		return usuarioService.getUsuarioById(id);
	}
	
	@RequestMapping(value = "/halugar/usuario", method = RequestMethod.POST)
	@ResponseBody
	public Usuario addUsuario(Usuario usuario) {
		return usuarioService.addUsuario(usuario);
	}
	
	@RequestMapping(value = "/halugar/usuario", method = RequestMethod.PUT)
	@ResponseBody
	public Usuario editUsuario(Usuario usuario) {
		return usuarioService.editUsuario(usuario);
	}
	
	@RequestMapping(value = "/halugar/usuario", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteUsuario(Usuario usuario) {
		usuarioService.deleteUsuario(usuario);
	}
	
	

}
