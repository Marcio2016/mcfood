package com.mc.mcfood.domain.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mc.mcfood.domain.model.Cozinha;

@Repository
public interface CozinhaRepository  extends CustomJpaRepository<Cozinha, Long>{

	//usando prefixos do spring data JPA
	public List<Cozinha>findByNomeContaining(String nome);
}
