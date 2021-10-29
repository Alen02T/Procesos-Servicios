package Procesos2Documento;

import java.io.IOException;
import java.io.InputStream;

public class leerTuberia {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//Process proceso = new ProcessBuilder ("CMD", "/C", "DIR").start();  definimos p como iniciador del subproceso dir. 
		
		
		
		Process proceso = new ProcessBuilder("bash", "-c", "ls , pwd").start();
		
		try {
			
			//InputStream is = proceso.getInputStream();  definimos is como la variable donde vamos a leer la respuesta del subproceso. 
			InputStream is = proceso.getInputStream();
			int c;
			while((c=is.read()) !=-1) {
				System.out.println((char)c);
				is.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		};
		
		//Comprobacion del error
		
		int exitval;
		
		try {
			exitval = proceso.waitFor();
			System.out.println("Valor de system.exit()" + exitval);
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		
		
		
		
		
		
	}

}
