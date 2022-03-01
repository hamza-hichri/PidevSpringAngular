package tn.esprit.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Employee {
@Id
@GeneratedValue(strategy =GenerationType.AUTO  )
	private long id_Employe;
	private String Name;
	private String email;
	private String password ;
	@Temporal(TemporalType.DATE)
	private Date CreatingDate;
	private long PhoneNumber;
	
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "employees")
	private Set<Feedback> feedbacks ;
	
	@ManyToOne
	private Profission Profission;
	@ManyToMany(cascade = CascadeType.ALL , mappedBy = "employees")
	private Set<Invitation>invitations ;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "employees")
	private Set<Reclamation> reclamations ;
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "employees")
	private Set<Publication> publications ;

}