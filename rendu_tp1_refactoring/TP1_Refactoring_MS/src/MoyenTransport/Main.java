/**
* @author Salem Mohri
* 
*/ 
package MoyenTransport;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		MoyenTransport moyenTransport = new Moto(new Categorie("Deux roue"), "BMW");
		
		moyenTransport.assurance(new AssuranceParameter(new Date(12), new Date(12)));		
		
	}
}
