package br.ufc.crateus.halugar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.crateus.halugar.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findById(long id);

}
