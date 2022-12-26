package com.sanket.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class Contacts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer contactId;
	
	private String contactName;
	private String contactNumber;
	private Boolean isContactBlocked = false;
	
	@ManyToOne
	private User user;

}
