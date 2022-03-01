package tn.esprit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id_Comment;
    private String Content;
    private String date ;
    @ManyToOne
    private Publication publication ;
}
