package com.mc.mcfood.domain.repository;

import org.springframework.stereotype.Repository;

import com.mc.mcfood.domain.model.Estado;

@Repository
public interface EstadoRepository extends CustomJpaRepository<Estado, Long>{

}
