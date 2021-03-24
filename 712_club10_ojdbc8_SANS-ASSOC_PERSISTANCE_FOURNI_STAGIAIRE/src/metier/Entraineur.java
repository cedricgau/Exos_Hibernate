package metier;

import java.util.*;

public class Entraineur
{
	private int idE;
	private String nom;
	private String prenom;
	private Date dateEmb;
	
	//CONSTRUCTEURS
	public Entraineur(){ }
	
	//Constructeur sans le passage de la clef
	public Entraineur(String nom, String prenom, Date dateEmb)
	{
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setDateEmb(dateEmb);
	}
	
	//REDEFINITION DE toString()
	public String toString()
	{
		return "id :"+idE + " nom :<" + nom + "> prenom :<" + prenom + "> dateEmb :" + dateEmb;
	}
	
	//GETTEURs SETTEURs
	public int getIdE() {
		return idE;
	}
	@SuppressWarnings("unused")
	private void setIdE(int idE) {
		this.idE = idE;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nomE) {
		this.nom = nomE;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenomE) {
		this.prenom = prenomE;
	}
	public Date getDateEmb() {
		return dateEmb;
	}
	public void setDateEmb(Date dateEmbE) {
		this.dateEmb = dateEmbE;
	}
	
	
}
