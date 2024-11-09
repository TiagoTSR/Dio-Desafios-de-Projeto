package br.com.xdecodex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.xdecodex.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

}
