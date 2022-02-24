package tn.esprit.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Company
   {@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id_company;
    private String adress ;
	private long phone ;
	private String password ;
	private String name ;
	private String email ;



@OneToMany(cascade = CascadeType.ALL , mappedBy = "company")
private Set<Field>  field;
@OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
private Set<Invitation> invitations;
}
