package prj1;

import java.util.Arrays;
import java.util.Scanner;

public class etudiant {

	private String nom;
	private String prenom;
	private int [] tabnote = new int[10] ;
	

	public etudiant(String nom, String prenom, int[] tabnote) {
		this.nom = nom;
		this.prenom = prenom;
		this.tabnote = tabnote;
	}


	public etudiant() {
		// TODO Auto-generated constructor stub
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int[] getTabnote() {
		return tabnote;
	}


	public void setTabnote(int[] tabnote) {
		this.tabnote = tabnote;
	}


	@Override
	public String toString() {
		return "etudiant [nom=" + nom + ", prenom=" + prenom + ", tabnote=" + Arrays.toString(tabnote) + "]";
	}
	
	public void saisie()
	{
		Scanner clavier = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
		System.out.println("donner le nom de l'étudiant : " + i + nom);
		String n = clavier.nextLine();
		System.out.println("donner le prenom de l'étudiant : " + i + prenom);
		String p = clavier.nextLine();
		
		System.out.println("donner la note n°  : " + i + " " + tabnote);
		int note = clavier.nextInt();
		tabnote[i] = note;
		}
	}
	
	public void afficher()
	{
		System.out.println("le nom le prénom de l'étudiant sont : " + prenom + " " + nom);
		for(int i=0;i<10;i++)
		{
			System.out.println("la note n°  : " + i + " tabnote["+i+"]"+"=" + tabnote[i]);
		}
	}
	
	public float moyenne()
	{
		int i;
		float s=0;
		for(i=0;i<10;i++)
		{
			s=s+tabnote[i];
		}
		return (s/10);
	}
	
	public int admis()
	{
		if(moyenne()>=10) 
			return 1;
		else return 0;
	}
	public int Exae_quo(etudiant e)
	{
		if(moyenne()==e.moyenne())
			return 1;
		else return 0;
	}
}
