package début;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hey");
		//fruit(54);
		//museum();
		//treasur(9);
		//marathon();
		mdp("cheval");
	}
	public static void fruit(int pommes) {
		int safe = 100; 
		if (pommes > 100) {
			System.out.println("Ok");
		}else {
			int rachat = ( safe - pommes);
			String msg = "Il faut passer commande d'au moins "+rachat+" pomme(s).";
			System.out.format(msg);
		}
	}
	
	public static void museum() {
		int age; 
		try (Scanner console = new Scanner(System.in)) {
			System.out.println("Votre age s'il vous plait :");
			age = console.nextInt(); //nextInt: saisie d'un entier au clavier
		}
		if (age >= 18 ) {
			System.out.println("Entrez");
		}else {
			System.out.println("Get out");
		}
	}
	
	public static void treasur(int treasur) {
		//System.out.println("stop");
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date(); 
		System.out.println(format.format(date));
		int i = 1;
		while (i <= treasur) {
			System.out.print(i);
			if (i % 3 == 0) {
				System.out.println("its a special gift");
			}
			i++;
		}
	}
	
	
	public static void marathon() {
		int nombre;
		try (Scanner console = new Scanner(System.in)) {
			System.out.println("Saisir un nombre marathonien : ");
			nombre = console.nextInt();
		}
		int i = 1;
		int inter = 0;
		int[] mara = new int [nombre + 1];
		
		while(i <= nombre ) {
			
			inter = inter + i;
			mara[i] = inter;
			i++;
			
		}
		System.out.println(inter);
	}
	
	
	public static void affichageTab(String[] tab) {
		for(String str : tab) {
			System.out.print(str + " ");
		}
	}
	
	
	public static void mdp(String leMDP) {
		
		try (Scanner console = new Scanner(System.in)) {
			int essai = 3;
			String[] tab = new String [essai + 1];
			for (int i = 0; i<= essai;i++ ){
				
				System.out.println("Entre votre ;) mdp :");
				String tentative = console.nextLine();
				int res = leMDP.compareTo(tentative);
				
				if ( res != 0 ) {
					tab[i] = tentative;
				}else {
					System.out.println("connecté ");
					break;
				}
				affichageTab(tab);
				System.out.println("");
			}
		}
		
		
	}
}
