package Animal;

public class Chat extends Animal{

	/* Classe qui etend la classe abstraite Animal
	 * Un chat peut crier, manger, et se deplacer
	 */
	public Chat(){ }
	
	public Chat(Espece espece, String nom, Type type){
		this.espece = espece;
		this.nom = nom;
		this.type = type;
	}
	
	/* la classe Chat et Chien ont des fonctions avec la meme signature.
	 * 
	 * */
	void crie(){
		System.out.println("miolement");
	}
	
	void nutrition(String alimentation){
		this.alimentation = alimentation;
	}
	
	void deplacement(){
		System.out.println("par pattes");
	}
	
	void reaction(){
		System.out.println(this.nom + " s'eloigne de vous");
	}

}
