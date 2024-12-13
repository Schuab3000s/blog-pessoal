package com.gen.blogPessoal.blogPessoal.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.gen.blogPessoal.blogPessoal.model.Usuario;
import com.gen.blogPessoal.blogPessoal.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		Optional<Usuario> usuraio = usuarioRepository.findByUsuario(userName);

		if (usuraio.isPresent())
			return new UserDetailsImpl(usuraio.get());
		else
			throw new ResponseStatusException(HttpStatus.FORBIDDEN);

	}
}
