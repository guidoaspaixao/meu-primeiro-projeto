package br.com.pamdotech.restful.controllers;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/infourl")
public class InfoUrlController {

	private static final Logger log = LoggerFactory.getLogger(InfoUrlController.class);
	
	@GetMapping(value = "/{nome}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public String exemplo(@PathVariable("nome") String nome) {
		 return "Olá " + nome;
	}
	
	
	@Cacheable("exemploCache")
	@GetMapping(value = "/cache")
	public String exemploCache() {
		 log.info("### Executando o oontroller...");
		 return "Obtendo informação em cache ";
	}
	
}
