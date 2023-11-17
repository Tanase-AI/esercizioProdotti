package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // String[] prodotti = {"pane", "pasta", "biscotti", "formaggio", "mortadella" };
		 // double[] prezzi = {4f, 1.6f, 3.75f, 12.50f, 11f};
		 /*HashMap<Integer, String> listaProdotti = new HashMap<>();
		listaProdotti.put(001, "pane");
		listaProdotti.put(002, "pasta");
		listaProdotti.put(003, "biscotti");
		listaProdotti.put(004, "formaggio");
		listaProdotti.put(005, "mortadella"); */
		
		HashMap<Integer, String> listaProdotti = new HashMap<>() {

		{
		    put(1, "pane");
		    put(12, "pasta");
		    put(3, "biscotti");
		    put(4, "formaggio");
		    put(5, "mortadella");
		}};
		
		
		HashMap<Integer, Float> prezzoProdotti = new HashMap<>();
		prezzoProdotti.put(1, 4f);
		prezzoProdotti.put(12, 1.6f);
		prezzoProdotti.put(3, 3.75f);
		prezzoProdotti.put(4, 12.50f);
		prezzoProdotti.put(5, 11f);

		
		
		double prezzo, quantità;
		String altroProdotto;
		int codiceProdotto;
		
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			System.out.println("inserisci il codice del prodotto");
			codiceProdotto =Integer.parseInt(sc.nextLine()) ;

			if (listaProdotti.containsKey(codiceProdotto)) {
				System.out.println("Stai acquistando " + listaProdotti.get(codiceProdotto));
				System.out.println("Quanto ne vuoi comprare?");
				quantità =Float.parseFloat(sc.nextLine());
				prezzo = quantità * prezzoProdotti.get(codiceProdotto);
				System.out.println("il prezzo è: " + String.format("%.2f", prezzo)); // .format (due cifre dopo la virgola)
				}
				
			else
				System.out.println("prodotto non disponibile!!");
	
			System.out.println("vuoi altro?");
			altroProdotto = sc.nextLine();
			altroProdotto = altroProdotto.toLowerCase();
		}while(altroProdotto.equals("si"));
			
		sc.close();	
	}

}
