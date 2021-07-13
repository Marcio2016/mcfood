package com.mc.mcfood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.mcfood.domain.exception.EntidadeNaoEncontradaException;
import com.mc.mcfood.domain.model.Cozinha;
import com.mc.mcfood.domain.model.Restaurante;
import com.mc.mcfood.domain.repository.CozinhaRepository;
import com.mc.mcfood.domain.repository.RestauranteRepository;

@Service
public class RestauranteService {

	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Restaurante salvar(Restaurante restaurante) {
		Long cozinhaId = restaurante.getCozinha().getId();
		
		Cozinha cozinha = cozinhaRepository.findById(cozinhaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException(
						String.format("Não existe cadastro de cozinha com código %d", cozinhaId)));
			
			restaurante.setCozinha(cozinha);
			
			return restauranteRepository.save(restaurante);
		
		
	}
}
