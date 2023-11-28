package modele.decoration;

import modele.Message;

public class InverseurDeMessage extends Message{
	
	protected Message message;
	protected String inversion;
	
	public InverseurDeMessage(Message message) {
		
		this.message = message;
		inverser();
		
	}
	
	public void inverser() {
		StringBuilder inverseur = new StringBuilder(this.message.getTexte());
		this.inversion = inverseur.reverse().toString();
	}

	public String getTexte() {
		//return this.message.getTexte();
		return this.inversion;
	}

	public void setTexte(String texte) {
		
		this.message.setTexte(texte);
	}

	public String getAuteur() {
		return this.message.getAuteur();
	}

	public void setAuteur(String auteur) {
		this.message.setAuteur(auteur);
	}

}
