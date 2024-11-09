package br.com.xdecodex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.xdecodex.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
