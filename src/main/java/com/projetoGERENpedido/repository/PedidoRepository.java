package com.projetoGERENpedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoGERENpedido.entities.Pedido;


public interface PedidoRepository extends JpaRepository <Pedido, Long>{
	
}
