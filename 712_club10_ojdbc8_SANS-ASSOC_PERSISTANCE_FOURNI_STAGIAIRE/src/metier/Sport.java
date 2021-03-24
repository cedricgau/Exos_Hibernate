package metier;


public class Sport
{
	private int idS;
	private String libelle;
	private String nomEntraineur;
	
	//CONSTRUCTEURS
	public Sport(){
		//super();
	}
	public Sport(String libelle){
		this.setLibelle(libelle);
		this.nomEntraineur = "inconnu";
	}
	//Constructeur sans le passage de la clef
	public Sport(String libelle, String nomEntraineur) {
		this.libelle = libelle;
		this.nomEntraineur = nomEntraineur;
	}
	//REDEFINITION DE toString()
	public String toString()
	{
		return "id :" + idS + " libelle :<" + libelle + ">" + " entraineur :<" + nomEntraineur +">";
	}
	
	
	// GETTEURs ET SETTEURs
	public String getNomEntraineur() {
		return nomEntraineur;
	}
	public void setNomEntraineur(String nomEntraineur) {
		this.nomEntraineur = nomEntraineur;
	}

	public int getIdS() {
		return idS;
	}
	private void setIdS(int idS) {
		this.idS = idS;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelleS) {
		this.libelle = libelleS;
	}

	
}
