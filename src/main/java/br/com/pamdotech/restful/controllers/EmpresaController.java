package br.com.pamdotech.restful.controllers;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pamdotech.restful.dtos.EmpresaDto;
import br.com.pamdotech.restful.responses.Response;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

	@PostMapping
	public ResponseEntity<Response<EmpresaDto>> cadastrar(@Valid @RequestBody EmpresaDto empresaDto, BindingResult result) {
		Response<EmpresaDto> response = new Response<EmpresaDto>();
		response.setData(empresaDto);
		
		if (result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}
		
		empresaDto.setId(1L);
		return ResponseEntity.ok(response);
	}

}
