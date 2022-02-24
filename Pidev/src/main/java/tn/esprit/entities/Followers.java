package tn.esprit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Followers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long numbrF;
    @ManyToOne
    private Publication publication ;
}
