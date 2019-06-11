package br.ufc.crateus.halugar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.ufc.crateus.halugar.model.Usuario;
import br.ufc.crateus.halugar.service.UsuarioService;

@RestController
@RequestMapping(value = "/halugar/usuario")
@CrossOrigin
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> getUsuarios(){
		return new ResponseEntity<List<Usuario>>((List<Usuario>)
				usuarioService.getUsuarios(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public Usuario getUsuarioById(long id) {
		return usuarioService.getUsuarioById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Usuario addUsuario(Usuario usuario, MultipartFile image) {
		return usuarioService.addUsuario(usuario, image);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public Usuario editUsuario(Usuario usuario) {
		return usuarioService.editUsuario(usuario);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteUsuario(Usuario usuario) {
		usuarioService.deleteUsuario(usuario);
	}
	
	

}
