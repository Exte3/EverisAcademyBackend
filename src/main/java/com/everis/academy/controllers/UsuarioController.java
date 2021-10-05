package com.everis.academy.controllers;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.academy.models.Usuario;
import com.everis.academy.services.UsuarioService;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

//@Controller
@RestController
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	
	@PostMapping("login")
	public Usuario login(@RequestParam("email") String email, @RequestParam("password") String pwd) {
		System.out.println("pasa por aca");
		
		/** acá debe ir la búsqueda del user en la BD y ver si la contraseña es correcta**/
		String token = getJWTToken(email);
		Usuario usuario = new Usuario();
		usuario.setEmail(email);
		usuario.setToken(token);
		

		/**System.out.println(token);
		System.out.println(user);**/
		
		System.out.println(usuario.getEmail());
		System.out.println(usuario.getToken());
		return usuario;
		
	}

	private String getJWTToken(String email) {
		String secretKey = "mySecretKey";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				.setSubject(email)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();
	
		return "Bearer " + token;
	}
	
	
	
}
