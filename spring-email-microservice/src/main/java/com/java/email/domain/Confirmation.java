package com.java.email.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "confirmations")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Confirmation implements Serializable{
	private static final long serialVersionUID = 3700562886723129021L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String token;
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private LocalDateTime createdDate;
	
	@OneToOne(targetEntity=User.class, fetch=FetchType.EAGER)
	@JoinColumn(nullable = false, name="user_id")
	private User user;
	
	public Confirmation(User user) {
		this.user = user;
		this.createdDate = LocalDateTime.now();
		this.token = UUID.randomUUID().toString();
	}
}
