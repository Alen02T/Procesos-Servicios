package Procesos2Documento;

import java.io.IOException;

public class LanzarStart {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Define el programa que se quiere ejecutar indicando sus argumentos
		// como una lista de cadenas separadas por comas.
		
		ProcessBuilder p = new ProcessBuilder();
		
		//Esto es para insertar el comando que mas tarde vamos a lanzar
		
		p.command("gnome-calculator");
		
		//Este para Windows 
		//p.command("calc.exe");
		
		//Esto lo inicia
		p.start();
		
		
		
	}

}
