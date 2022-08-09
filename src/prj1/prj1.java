package prj1;

public class prj1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("-----------------Start of programm----------------");
		int [] t1= {13,14,13,14,15,16,17,18,19,19};
		int [] t2= {3,4,1,14,5,9,17,8,19,10};
		int [] t3= {12,14,13,14,15,16,17,18,18,19};
		etudiant e1= new etudiant("MAHMOUD","Ayoub",t1);
		etudiant e2= new etudiant("FERNANDEZ","RUBEN",t2);
		etudiant e3= new etudiant("MAL","LEA",t3);
		
		
		e1.afficher();
		System.out.println("la moyenne obtenue par l'étudiant est : " + e1.moyenne());
		if(e1.admis()==1)
			System.out.println("l'éutdiant est admis bravo");
		else
			System.out.println("l'éutdiant n'est pas admis ");
		System.out.println("---------------------------------");
		e2.afficher();
		System.out.println("la moyenne obtenue par l'étudiant est : " + e2.moyenne());
		if(e2.admis()==1)
			System.out.println("l'éutdiant est admis bravo");
		else
			System.out.println("l'éutdiant n'est pas admis ");
		System.out.println("---------------------------------");
		e3.afficher();
		System.out.println("la moyenne obtenue par l'étudiant est : " + e3.moyenne());
		if(e3.admis()==1)
			System.out.println("l'éutdiant est admis bravo");
		else
			System.out.println("l'éutdiant n'est pas admis ");
		
		
		System.out.println("-----------------end----------------");
		
		//e= new etudiant();
		//e.saisie();
	}

}
