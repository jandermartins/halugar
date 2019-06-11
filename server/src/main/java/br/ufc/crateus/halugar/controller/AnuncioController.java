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

import br.ufc.crateus.halugar.model.Anuncio;
import br.ufc.crateus.halugar.service.AnuncioService;

@RestController
@RequestMapping(value = "/halugar/anuncio")
@CrossOrigin
public class AnuncioController {
	
	@Autowired
	private AnuncioService anuncioService;
	
	@RequestMapping(value ="{id}", method = RequestMethod.GET)
	public Anuncio getAnuncioById(long id) {
		return anuncioService.getAnuncioById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Anuncio>> getAnuncios(){
		return new ResponseEntity<List<Anuncio>>((List<Anuncio>)
				anuncioService.getAnuncios(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Anuncio addAnuncio(Anuncio anuncio, MultipartFile image) {
		return anuncioService.addAnuncio(anuncio, image);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public Anuncio editAnuncio(Anuncio anuncio) {
		return anuncioService.editAnuncio(anuncio);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteAnuncio(Anuncio anuncio) {
		anuncioService.deleteAnuncio(anuncio);
	}
}
