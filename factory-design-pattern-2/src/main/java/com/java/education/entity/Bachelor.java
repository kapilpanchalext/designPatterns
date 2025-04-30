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
@Table(name = "bachelor")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bachelor implements Serializable{
	private static final long serialVersionUID = -6184698645234798437L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String field;
	private int duration;
	private double fees;
}
