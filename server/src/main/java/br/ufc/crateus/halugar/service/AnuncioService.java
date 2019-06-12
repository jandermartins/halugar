package br.ufc.crateus.halugar.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.ufc.crateus.halugar.model.Anuncio;
import br.ufc.crateus.halugar.repository.AnuncioRepository;
import br.ufc.crateus.halugar.util.Upload;

@Service
public class AnuncioService {
	
	@Autowired
	private AnuncioRepository anuncioRepository;
	
	public Anuncio getAnuncioById(long id) {
		return anuncioRepository.findById(id);
	}
	
	public List<Anuncio> getAnuncios() {
		return anuncioRepository.findAll();
	}
	
	public Anuncio addAnuncio(Anuncio anuncio, MultipartFile image) {
		try {
			Upload.uploadFile(image.getInputStream(), anuncio.getId());
		} catch (IOException e) {
		}
		return anuncioRepository.saveAndFlush(anuncio);
	}
	
	public Anuncio editAnuncio(Anuncio anuncio) {
		return anuncioRepository.saveAndFlush(anuncio);
	}
	
	public void deleteAnuncio(Anuncio anuncio) {
		anuncioRepository.delete(anuncio);
	}
}
