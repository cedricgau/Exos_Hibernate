package metier;

import java.util.*;

public class Adherent
{
	private int idA;
	private String nom;
	private String prenom;
	private Date dateNaiss;
	private String libelleSport;

	//CONSTRUCTEURS
	public Adherent(){	}
	
	//Constructeur sans le passage de la clef
	public Adherent(String nom, String prenom, Date dateNaiss)
	{
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setDateNaiss(dateNaiss);
		this.libelleSport = "inconnu";
	}

	public Adherent(String nom, String prenom, Date dateNaiss,
			String libelleSport) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.libelleSport = libelleSport;
	}

	//REDEFINITION DE toString()
	public String toString()
	{
		return idA + " nom :<" +nom+ "> prenom :<" +prenom+ "> dateNaiss :" +dateNaiss + " sport :<" + libelleSport +">";
	}
	
	//GETTEURs SETTEURs
	public String getLibelleSport() {
		return libelleSport;
	}
	public void setLibelleSport(String libelleSport) {
		this.libelleSport = libelleSport;
	}
	
	public int getIdA() {
		return idA;
	}
	private void setIdA(int idA) {
		this.idA = idA;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nomA) {
		this.nom = nomA;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenomA) {
		this.prenom = prenomA;
	}
	public Date getDateNaiss() {
		return dateNaiss;
	}
	public void setDateNaiss(Date dateNaissA) {
		this.dateNaiss = dateNaissA;
	}


}
