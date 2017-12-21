package com.richard.sales.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Order implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	
	@Temporal(TemporalType.TIMESTAMP) 
	private Date instante;
	
//	@OneToOne(cascade = CascadeType.ALL, mappedBy="pedido") 
//	private Pagamento pagamento;
//	
//	@ManyToOne @JoinColumn(name="cliente_id") 
//	private Cliente cliente;
//	
//	@ManyToOne @JoinColumn(name="endereco_id") 
//	private Endereco enderecoDeEntrega;
	
	

}
