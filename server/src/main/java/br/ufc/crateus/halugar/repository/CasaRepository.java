package br.ufc.crateus.halugar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.crateus.halugar.model.Casa;

public interface CasaRepository extends JpaRepository<Casa, Long>{
	Casa findById(long id);
}
