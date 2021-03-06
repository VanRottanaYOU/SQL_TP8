package fr.codevallee.formation.tp.modele;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "maire")

public class Maire {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(length=40)
	private String nom;

	@OneToOne(mappedBy="maire")
	private Commune commune ;
	
	@OneToMany(fetch=FetchType.EAGER)
	private Set<Elu> Elu ;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Commune getCommune() {
		return commune;
	}

	public void setCommune(Commune commune) {
		this.commune = commune;
	}

	public Set<Elu> getElu() {
		return Elu;
	}

	public void setElu(Set<Elu> elu) {
		Elu = elu;
	}

	

}
