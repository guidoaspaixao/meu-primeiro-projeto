package br.com.pamdotech.restful.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pamdotech.restful.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	Empresa findByCnpj(String cnpj);

}
