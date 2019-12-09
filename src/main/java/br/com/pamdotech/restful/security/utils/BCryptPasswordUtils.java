package br.com.pamdotech.restful.security.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordUtils {

	/**
	 * Gera um hash utilizando o BCrypt.
	 * 
	 * @param senha
	 * @return String
	 */
	public static String gerarBCrypt(String senha) {
		if (senha == null) {
			return senha;
		}
		return new BCryptPasswordEncoder().encode(senha);
	}
	
	/**
	 * Verifica se a senha é válida. 
	 * 
	 * @param senha
	 * @param senhaEncoded
	 * @return boolean
	 */
	public static boolean senhaValida(String senha, String senhaEncoded) {
		return new BCryptPasswordEncoder().matches(senha, senhaEncoded);
	}
	
}
