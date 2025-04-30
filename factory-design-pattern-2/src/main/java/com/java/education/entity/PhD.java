package com.java.education.entity;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "phd")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PhD implements Serializable {
	private static final long serialVersionUID = -7435763169692861074L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String field;
	private int duration;
	private double fees;
}
