/**
* @author Salem Mohri
* 
*/ 
package MoyenTransport;

public abstract class MoyenTransport {
	Categorie categorie;
	String marque;
	private String Model = "";
	
	public MoyenTransport() { }
	
	
	public MoyenTransport(Categorie categorie, String marque) {
		this.categorie.setCategorie(categorie.getCategorie());
		this.marque = marque;
	}



	void assurance(AssuranceParameter parameterObject){
		System.out.println("Debut d'assurance "+" fin d'assurance");
	}


	void vitesse() {
		System.out.println("200Kmh");
	}


	public void setModel(String Model) {
		this.Model = Model;
	}


	public String getModel() {
		return Model;
	}
	

}
