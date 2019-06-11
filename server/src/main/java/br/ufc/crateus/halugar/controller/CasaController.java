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

import br.ufc.crateus.halugar.model.Casa;
import br.ufc.crateus.halugar.service.CasaService;

@RestController
@RequestMapping(value = "/halugar/casa")
@CrossOrigin
public class CasaController {
	
	@Autowired
	private CasaService casaService;
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public Casa getCasaById(long id) {
		return casaService.getCasaById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Casa>> getCasas(){
		return new ResponseEntity<List<Casa>>((List<Casa>)
				casaService.getCasas(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Casa addCasa(Casa casa, MultipartFile image) {
		return casaService.addCasa(casa, image);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public Casa editCasa(Casa casa) {
		return casaService.editCasa(casa);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteCasa(Casa casa) {
		casaService.deleteCasa(casa);
	}
}
