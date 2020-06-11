package com.willianconk.avweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.willianconk.avweb.domain.Cardapio;

@Repository
public interface CardapioRepository extends JpaRepository<Cardapio, Integer> {

	
}
