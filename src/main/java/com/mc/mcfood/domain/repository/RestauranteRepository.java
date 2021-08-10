package com.mc.mcfood.domain.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mc.mcfood.domain.model.Restaurante;

@Repository
public interface RestauranteRepository extends CustomJpaRepository<Restaurante, Long>{

	//Usando query por xml
	List<Restaurante> consultaPorNome(String nome,@Param("id") Long cozinhaId);

	
}
