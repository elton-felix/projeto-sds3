package com.devsuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.service.SellerService;

@RestController //indicando que essa classe é um controlador rest
@RequestMapping(value = "/sellers")//indicar qual é o camminho desse recurso web
public class SellerController {
	@Autowired
	private SellerService service;
	
	//criando metodo para representar um end Point
	@GetMapping 
	public ResponseEntity<List<SellerDTO>> findAll(){
		List<SellerDTO> list = service.findAll();
		return ResponseEntity.ok(list);//.ok significa q a resposta no metodo http deu sucesso
	}
	
	
}
