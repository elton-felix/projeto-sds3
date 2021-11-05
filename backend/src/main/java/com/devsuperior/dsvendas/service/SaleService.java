package com.devsuperior.dsvendas.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service // duzendo que essa classe é um componente do sistema
public class SaleService {
	
	@Autowired //intalando dependencia
	private SaleRepository repository;
	
	@Autowired //para q ele seja injetado de forma transparente
	private SellerRepository sellerRepository;
	
	//a anotacion garante que toda operação com o banco seja resolvida nesse service  
	@Transactional(readOnly = true) //o readOnly garante que não faça lockin no banco
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
}