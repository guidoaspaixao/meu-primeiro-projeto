package br.com.pamdotech.restful.security.services;

import java.util.Optional;

import br.com.pamdotech.restful.security.entities.Usuario;

public interface UsuarioService {

	/**
	 * Busca e retorna um usuário dado um email.
	 * 
	 * @param email
	 * @return Optional<Usuario>
	 */
	Optional<Usuario> findByEmail(String email);

}
