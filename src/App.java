import modele.Message;
import modele.decoration.InverseurDeMessage;
import modele.decoration.AvanceurDeLettresDeMessage;
import modele.decoration.RemplaceurLettresChoisisDeMessage;

public class App {

	public static void main(String[] args) {
		
		
		Message message = new Message("abc");
		Message messageInverseTest1 = new InverseurDeMessage(message);
		System.out.println(messageInverseTest1.getTexte());
		Message messageLettresAvancees = new AvanceurDeLettresDeMessage(messageInverseTest1);
		System.out.println(messageLettresAvancees.getTexte());
		Message messageRemplacerLettres = new RemplaceurLettresChoisisDeMessage(messageLettresAvancees);
		System.out.println(messageRemplacerLettres.getTexte());
		
	}

}
