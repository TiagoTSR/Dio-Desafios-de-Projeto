package br.com.xdecodex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.xdecodex.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}