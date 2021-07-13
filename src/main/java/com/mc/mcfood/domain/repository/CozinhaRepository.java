package com.mc.mcfood.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mc.mcfood.domain.model.Cozinha;

@Repository
public interface CozinhaRepository  extends JpaRepository<Cozinha, Long>{

	public List<Cozinha>findByNomeContaining(String nome);
}
