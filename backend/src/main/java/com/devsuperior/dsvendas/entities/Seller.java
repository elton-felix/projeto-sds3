package com.devsuperior.dsvendas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity //anotação da JPA(Biblioteca de implementação de mapeamento do java)
@Table(name = "tb_sellers") //falando o nome da tabela no banco
public class Seller {
	
	@Id // falando pro banco qual é a chave primaria 
	@GeneratedValue(strategy = GenerationType.IDENTITY)//informando pro banco q esse id é auto incrementado, o banco automaticamente vai criando chaves , no decorrer de novas insersoes 
	private long id;
	private String name;
	
	@OneToMany(mappedBy = "seller") // definindo 1 para muitos// colocando tambem o nome do atributo que ta mapeado na outra classe com muitos para 1 
	private List<Sale> sales = new ArrayList<>();
	
	public Seller() {
	}

	public Seller(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}
	
	
	
	
	
	
}
