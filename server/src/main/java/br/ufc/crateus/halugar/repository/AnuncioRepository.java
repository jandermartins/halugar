package br.ufc.crateus.halugar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.crateus.halugar.model.Anuncio;

public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {
	
	Anuncio findById(long id);
	
}
