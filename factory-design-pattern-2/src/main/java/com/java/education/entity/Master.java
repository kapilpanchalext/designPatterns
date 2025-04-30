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
@Table(name = "master")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Master implements Serializable{
	private static final long serialVersionUID = -5850960067841885499L;

	@Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String field;
  private int duration;
  private double fees;
}
