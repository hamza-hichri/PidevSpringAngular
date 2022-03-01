package tn.esprit.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Entity
public class Field {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO  )
	private long id_Field;
	private String fieldtype ;
	@ManyToOne
	private Company company;
}
