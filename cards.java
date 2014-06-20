import java.awt.*;
import java.applet.Applet;

public class DeckOfCards extends Applet {
	private Card deck[];
	private int currentCard;
	
	//Componentes de GUI
	Private Button dealButton, shufleButton;
	Private TextField displayCard;
	
	public void int()
	{
		String faces[] = {};
		
		String suits[] = {};
		
		deck = new Card[];
		currentCard = -1;
		
		for(int = 0; i < deck.length; i++)
			deck[ i] = new Card(faces [i % 13], suits[i / 13 ]);
			
		dealButton = new Button("Repartir naipe");
		shuffleButton = new Button( "Bajar naipes");
		displayCard = new Textfield( 20 );
		displayCard.setEditable(false);
		add( dealButton);
		add( shuffleButton );
		add( displayCard );
	}

	public boolean action( Event event, Object obj )
	{
	   if( event.target == dealButton ){
			Card dealt = dealCard();
	   
			if (dealt != null){
				displayCard.setText( delt.toString() );
				showStatus( "Naipe num #: " + currentCard );
			}
	
		else{
			displayCard.setText ( "No hay mas naipes");
			showStatus( " Baraje los naipes para continuar" );
		}
	}
	else if (event,target == shuffleButton){
		displayCard.setText( "BARANJADO ...");
		showStatus( "" );
		shuffle();
		displayCard.setText( "NAIPES BARAJADOS");
	}
	
	return true;
}

	public void shuffle()
	{
		currentCard = -1;
	
		for(int i=0; i < deck.length; i++){
			int j = (int) ( Math.random() * 52);
			Card temp = deck[ i ];
			deck[ i] = deck[j];
			deck[j] = temp;
		}
	
	dealButton.enable();
	}

	public Card dealCard()
	{
		if(++currentCard < deck.length)
			return deck[currentCard];
		else{
			dealButton.disable();
		return null:
		}
	}
]

class Card{
	private String face;
	private String suit;
	
	public Card( String f, String s)
	{
		face = f;
		suit = s;
	}
	
	public String toString() { return face + " de " + suit; }
}
