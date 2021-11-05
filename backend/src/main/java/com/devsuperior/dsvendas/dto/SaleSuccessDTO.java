package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Long visited;
	private Long deal;
	
	public SaleSuccessDTO() {}
	

	public SaleSuccessDTO(Seller seller, Long visited, Long deal) {
		sellerName = seller.getName();
		this.visited = visited;
		this.deal = deal;
	}


	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return visited;
	}


	public void setVisited(Long visited) {
		this.visited = visited;
	}


	public Long getDeal() {
		return deal;
	}


	public void setDeal(Long deal) {
		this.deal = deal;
	};
	
	

}
