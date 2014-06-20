import java.awt.*; // importar el paquete java.awt
import java.applet.Applet;

public class Addition extends Applet{
	Label prompt; // solicitar entrada al usuario
	TextField Input; // introducir valores aqui
	int number;	// almacenar valor introducido
	int sum;	//almacenar suma de enteros
	
	//preparar componentes de interfaz gráficos de usuario e inicializar variables
	
	public void init()
	{
		prompt = new Label("Teclee un entero y pulse enter:" );
		input = new TextField( 10);
		add( prompt); //poner prompt (solicitud) en la applet
		add( input ); //poner input (entrada) en la applet
		sum = 0;	//hacer sum (suma) igual a cero
	}
	
	//procesar la acción del usuario en el campo de texto de entrada
	public boolean action( Event e, Object o ){
		number = Integer.parseInt( o.toString() );
		input.setText(""); //despejar campo de entrada de datos
		sum = sum + number; // suma number (número) a  sum (suma)
 		showStatus( Integer.toString( sum )); //mostrar resultado
		return true; // indica que la acción del usuario se proceso
	
	}

}
