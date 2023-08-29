package com.ecommerce.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Order {
	
	private Long id;
	private String number;
	private LocalDate dateOrder;
	private LocalDate deliverDate;
	private String status;
	private BigDecimal total;
	public Order() {
		super();
	}
	public Order(Long id, String number, LocalDate dateOrder, LocalDate deliverDate, String status, BigDecimal total) {
		super();
		this.id = id;
		this.number = number;
		this.dateOrder = dateOrder;
		this.deliverDate = deliverDate;
		this.status = status;
		this.total = total;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public LocalDate getDateOrder() {
		return dateOrder;
	}
	public void setDateOrder(LocalDate dateOrder) {
		this.dateOrder = dateOrder;
	}
	public LocalDate getDeliverDate() {
		return deliverDate;
	}
	public void setDeliverDate(LocalDate deliverDate) {
		this.deliverDate = deliverDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	
}
