package tn.esprit.entities;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Invitation {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO  )
	private long id_Invitation;
	private String content;
	private String email;
	private String invitaiondestination ;
	@Enumerated(EnumType.STRING)
	private state state;
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Employee>  employees ;
	@ManyToOne
	private Company company ;
}
