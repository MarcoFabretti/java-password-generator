/**
 * 
 */
package org.generation.italy.security;

import java.util.Scanner;

/**
 * @author mfabr
 *
 */
public class PasswordGenerator {
	
	
	
	
	public static void main(String[] args) {
		String nome;
		String cognome;
		String colore;
		int giorno;
		int mese;
		int anno;
		int x;
		boolean v;
		
		Scanner cIn = new Scanner(System.in);							//creiamo l'oggetto cIn di tipo Saccaner
		
		System.out.print("inserisci il nome: ");						//chiediamo in input il nome e verifichiamo la lunghezza
		do {
			nome = cIn.nextLine();
			v=verificaLunghezza(nome);
			}while(v==false);											//ripetiamo finchè non è corretto			
		
		
		System.out.print("inserisci il cognome: ");						//uguale		
		do {
			cognome = cIn.nextLine();
			v=verificaLunghezza(cognome);
			}while(v==false);
		
		System.out.print("inserisci il tuo colore preferito: ");		//uguale						
		do {
			colore = cIn.nextLine();
			v=verificaLunghezza(colore);
			}while(v==false);
		
		System.out.print("inserisci il tuo anno di nascita: ");			
		boolean z;														//variabile d'appoggio per la verifica
		do {		
			anno = cIn.nextInt();										//input
			if(2021>=anno && anno>=1900)	{								//se compreso tra il 1900 e 2021
				System.out.println("corretto");	
				z=true;																				//è corretto
			}
				
			else	z=false;																		//se non è compreso 
			if(z==false)																			//se è sbaglaito
				System.out.println("L'anno deve essere compreso tra il 1900 e il 2021");
			}while(z==false);																		//altrimenti ok
		
		System.out.print("inserisci il tuo mese di nascita: ");	
		do {		
			mese = cIn.nextInt();																	//input
			if(12>=mese && mese>=1)	{																//se compreso tra il 1 e 12
				System.out.println("corretto");	
				z=true;																				//è corretto
			}
			else	z=false;																		//se non è compreso 
			if(z==false)																			//se è sbaglaito
				System.out.println("Il mese deve essere compreso tra 1 e il 12: gennaio-dicembre");
			}while(z==false);
		
		x=31;																						//assegnamo di defoult 31 giorni, il più comodo
		
		switch(mese) {				
			case 2: x=28; 																			//se febbraio massimo 28 giorni
			break;
			case 4:																					//se aprile, giugno settembre, novembre 30 giorni altrimenti rimane 31
				x=30;
			break;
			case 6: 
				x=30;
			break;
			case 9:
				x=30;
			break;
			case 11:
				x=30;
		}
		
		System.out.println("Inserire il giorno di nascita,");
		do {		
			giorno = cIn.nextInt();																	//input
			if(x>=giorno && giorno>=1)	{																//se compreso tra il 1 e x (numero massimo di giorni in un determinato mese)
				System.out.println("corretto");	
				z=true;																				//è corretto
			}
			else	z=false;																		//se non è compreso 
			if(z==false)																			//se è sbagliato
				System.out.println("Il giorno deve essere compreso tra 1 e l'ultimo giorno di quel mese");
			}while(z==false);
		
		
		System.out.println("la tua password per questo evento è:");
		System.out.println(nome+"-"+cognome+"-"+colore+"-"+anno);
		System.out.println("Grazie di averci scielto (:");
		
	}
			
	public static boolean verificaLunghezza(String y) {							
		boolean v;												//risultato della verifica
		int x=y.length();										//assegnamo ad x la lunghezza dell'input
		if((x<=30)&&(x>=3)) {
			v=true;												//verifichaimo che sia tutto corretto
			System.out.println("corretto");						//diamo i feedback
		}
		
		else {
			v=false;
			System.out.println("riprova, lunghezza errata");	
		}
		return v;												//facciamo ritornare il risultato della verifica
	}
}
