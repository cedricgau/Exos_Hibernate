package metier;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Competiteur {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idC;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private Date dateNaiss;
	@Column
	private String niveau;
	
	

	public Competiteur(int idC, String nom, String prenom, Date dateNaiss, String niveau) {
		super();
		this.idC = idC;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Competiteur [idC=" + idC + ", nom=" + nom + ", prenom=" + prenom + ", dateNaiss=" + dateNaiss
				+ ", niveau=" + niveau + "]";
	}



	public int getIdC() {
		return idC;
	}



	public void setIdC(int idC) {
		this.idC = idC;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public Date getDateNaiss() {
		return dateNaiss;
	}



	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}



	public String getNiveau() {
		return niveau;
	}



	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
