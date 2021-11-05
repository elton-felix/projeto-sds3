package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity //anotação da JPA(Biblioteca de implementação de mapeamento do java)
@Table(name = "tb_sales") //falando o nome da tabela no banco
public class Sale {
	
	@Id // falando pro banco qual é a chave primaria 
	@GeneratedValue(strategy = GenerationType.IDENTITY)//informando pro banco q esse id é auto incrementado, o banco automaticamente vai criando chaves , no decorrer de novas insersoes 
	private long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	@ManyToOne // definindo muitos para 1 , entre as entidades
	@JoinColumn(name = "seller_id") // definindo o nome da chave estrangeira
	private Seller seller;
	
	public Sale() {
	}

	public Sale(long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}	
}
