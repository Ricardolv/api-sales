package com.richard.sales.domain;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;

}
