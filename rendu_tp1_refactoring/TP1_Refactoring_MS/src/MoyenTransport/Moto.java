/**
* @author Salem Mohri
* 
*/ 
package MoyenTransport;

public class Moto extends MoyenTransport{
	
	
public Moto(){
	}
	
	public Moto (Categorie categorie, String marque){
		this.categorie = categorie;
		this.marque = marque;
		

	}
	void assurance(AssuranceParameter parameterObject){
		System.out.println("Debut"+parameterObject.debut+"fin"+parameterObject.fin);
	}
	

}
