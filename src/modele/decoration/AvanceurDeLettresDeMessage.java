package modele.decoration;

import modele.Message;

public class AvanceurDeLettresDeMessage extends Message{
	
	protected Message message;
	protected int avancement = 1;
	protected String messageModifie;
	
	public String getTexte() {
		return this.messageModifie;
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
	

	public AvanceurDeLettresDeMessage(Message message) {
		this.message = message;
		this.AvancerLesLettres();
	}
	
	public void AvancerLesLettres() {
		String messageAvancer = "";
		
		for (int i = 0; i<message.getTexte().length(); i++) {
			char lettre = (char)((int)message.getTexte().charAt(i)+this.avancement);
			messageAvancer += lettre;
		}
		this.messageModifie = messageAvancer;

	}
	
	
	
	

}
