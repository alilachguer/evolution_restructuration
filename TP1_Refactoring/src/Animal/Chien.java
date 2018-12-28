package Animal;

/* Classe qui etend la classe abstraite Animal
 * Un chien peut crier, manger, et se deplacer
 */
public class Chien extends Animal{
	
	public Chien() { }
	
	public Chien(Espece espece, String nom, Type type){
		this.espece = espece;
		this.nom = nom;
		this.type = type;
	}
	
	void crie(){
		System.out.println("aboiement");
	}
	
	void nutrition(String alimentation){
		this.alimentation = alimentation;
	}
	
	void deplacement(){
		System.out.println("par pattes");
	}
	
	void reaction(){
		System.out.println(this.nom + " veut jouer avec vous");
	}
	
}