package com.mc.mcfood.domain.repository;

import org.springframework.stereotype.Repository;

import com.mc.mcfood.domain.model.Cidade;

@Repository
public interface CidadeRepository extends CustomJpaRepository<Cidade, Long> {

}
