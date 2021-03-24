package test;
import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.sql.Date;
import java.text.*;
import metier.*;
public class Test1_popul
{
	public static void main(String[] args) {
		Session session = null;
		//Session session2 = null;

	try {
//		//Creation d'une fabrique de session
//		SessionFactory sf = new AnnotationConfiguration()
//						.configure().buildSessionFactory();
//		
//		//Creation d'une session = unit� de travail
//		session = sf.getCurrentSession();

	       final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
	               .configure() // configures settings from hibernate.cfg.xml
	               .build();
	       
	       SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	       
	       session = factory.openSession();
		
		session.beginTransaction();
		
		
		//DIFFERENTS OBJETS SONT A ENREGISTRE DANS LA BD
		//AJOUTER LES OBJECT CREES AU CONTEXTE DE PERSISTANCE
		
		Entraineur e1 = new Entraineur("Dupont","Jean",
					new SimpleDateFormat("dd/MM/yyyy").parse("15/10/2005"));
		Entraineur e2 = new Entraineur("Dubois","Marie",
					new SimpleDateFormat("dd/mm/yyyy").parse("16/12/1995"));
		Entraineur e3 = new Entraineur("Durant","Patrick",
					new SimpleDateFormat("dd/mm/yyyy").parse("04/05/2000"));
		
		//On a aussi : session.persist(arg0, arg1)
		
		System.out.println("\nOn rend persistant les entraineurs");
		System.out.println("On affiche leur identifiant");
		System.out.println("----------------------------------");
		

		session.persist(e1);  System.out.println("Valeur d'identifiant :"+ e1.getIdE());
		session.persist(e2);  System.out.println("Valeur d'identifiant :"+ e2.getIdE());
		session.persist(e3);  System.out.println("Valeur d'identifiant :"+ e3.getIdE());
		
		//L'objet persistant est suivi par la session  Hibernate
		//Son chgt d'�tat est r�percut� en BD
		//e1.setPrenom("toto");
		//e1.setPrenom("titi");

		Sport s1 = new Sport("Equitation" , "Dupont");
		Sport s2= new Sport("Natation" , "Dubois");
		Sport s3= new Sport("Boxe" , "Durant" );
		
		
		System.out.println("\nOn rend persistant des sports");
		System.out.println("-----------------------------");
		session.persist(s1);  System.out.println("Valeur d'identifiant :"+ s1.getIdS());
		session.persist(s2);  System.out.println("Valeur d'identifiant :"+ s2.getIdS());
		session.persist(s3);  System.out.println("Valeur d'identifiant :"+ s3.getIdS());


		System.out.println("\n\n");
		
		//////////////////////
		//TODO	
		//////////////////////
		//Sauvegardez l'adh�rent "Bichon" "Simone", n�e le 04/03/1981 ... FAISANT de l'�quitation !
		//Sauvegardez l'adh�rent "Abicol" "Nicole", n�e le 15/12/1951 ... FAISANT de l'�quitation (bis) !
		//Sauvegardez l'adh�rent "Dupuis" "Gary", n�e le 17/10/2000 ... FAISANT de la natation !
		
		Adherent a1 = new Adherent("Bichon", "Simone", new SimpleDateFormat("dd/mm/yyyy").parse("04/03/1981"), "Equitation");
		Adherent a2 = new Adherent("Abicol", "Nicole", new SimpleDateFormat("dd/mm/yyyy").parse("15/12/1951"), "Equitation");
		Adherent a3 = new Adherent("Dupuis", "Gary", new SimpleDateFormat("dd/mm/yyyy").parse("17/10/2000"), "Natation");
		
		session.persist(a1);
		session.persist(a2);
		session.persist(a3);
		

		//ferme la transaction -->
		//les requ�tes SQL partent vers le moteur !!!
		session.getTransaction().commit();
		
		session.close();// session hibernate
		System.out.println("session close");

/*		SessionFactory sf2 = new AnnotationConfiguration()
						.configure().buildSessionFactory();
		session2 = sf2.getCurrentSession();
		session2.beginTransaction();		
		e1.setPrenom("toto");
		e1.setPrenom("titi");
		session2.getTransaction().commit();

		session2.close();// session hibernate
		System.out.println("session2 close");*/
		
		Session session2 = factory.openSession();
		session2.beginTransaction();
		session2.saveOrUpdate(a1);
		a1.setPrenom("titi");
		session2.getTransaction().commit();
		session2.close();
		

	}
	catch(ParseException ex)
	{
		System.err.println("Pb sur le parsing des dates" + ex);
	}
	catch(HibernateException ex){
		System.err.println("La cr�ation de la SessionFactory a �chou�" + ex);
	}
//	finally{
//		session.close();
//	
//	}
	}

}
