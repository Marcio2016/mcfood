package com.mc.mcfood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.mc.mcfood.domain.exception.EntidadeEmUsoException;
import com.mc.mcfood.domain.exception.EntidadeNaoEncontradaException;
import com.mc.mcfood.domain.model.Cozinha;
import com.mc.mcfood.domain.repository.CozinhaRepository;

@Service
public class CadastroCozinhaService {

	@Autowired
	CozinhaRepository repository;
	
	public Cozinha salvar (Cozinha cozinha) {
		return repository.save(cozinha);
	}
	
	public void deletar(Long id) {
		try {
			repository.deleteById(id);
			
		} catch (EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(
				String.format("Não existe um cadastro de cozinha com código %d", id));
		
		} catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
				String.format("Cozinha de código %d não pode ser removida, pois está em uso", id));
		}
	}
}
