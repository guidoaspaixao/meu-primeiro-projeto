package br.com.pamdotech.restful.security.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pamdotech.restful.security.entities.Usuario;
import br.com.pamdotech.restful.security.repositories.UsuarioRepository;
import br.com.pamdotech.restful.security.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Optional<Usuario> findByEmail(String email) {
		return Optional.ofNullable(this.usuarioRepository.findByEmail(email));
	}
}
