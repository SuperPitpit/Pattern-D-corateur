package modele.decoration;

import modele.Message;

public class RemplaceurLettresChoisisDeMessage extends Message{

	protected Message message;
	protected String messageAvecLettresRemplacees;
	
	public String getTexte() {
		//return this.message.getTexte();
		return this.messageAvecLettresRemplacees;
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
	
	public RemplaceurLettresChoisisDeMessage(Message message) {
		this.message = message;
		this.RemplacerDesLettres();
	}

	private void RemplacerDesLettres() {
		StringBuilder remplaceur = new StringBuilder(this.message.getTexte());
		
		for (int i = 0; i < message.getTexte().length(); i++) {
			remplaceur.replace(i, i+1, Integer.toString(i)).toString();
		}
		this.messageAvecLettresRemplacees = remplaceur.substring(0);
		
		
	}

}
