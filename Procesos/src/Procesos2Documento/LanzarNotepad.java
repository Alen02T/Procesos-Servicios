package Procesos2Documento;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LanzarNotepad {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		//
		
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Iniciando Notepad");
		//Lanzamos (ejecutamos) NOTEPAD
		
		Process process = runtime.exec("gedit");
		//Deja 5 segundos para que dure la aplicacion
		
		process.waitFor(5,TimeUnit.SECONDS);
		System.out.println("Se acabo el tiempo");
		
		process.destroy(); //Termina con la aplicacion
		
		
		
	}

}
