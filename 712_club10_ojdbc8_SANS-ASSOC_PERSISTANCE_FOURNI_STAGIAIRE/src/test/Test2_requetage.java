package test;
//import org.hibernate.*;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.*;
import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import metier.*;

//import java.text.SimpleDateFormat;
import java.util.*;
public class Test2_requetage
{
	public static void main(String[] args)
	{
//		SessionFactory sf = new AnnotationConfiguration()
//				.configure().buildSessionFactory();
//		
//		//Creation d'une session = unité de travail
//		Session session = sf.getCurrentSession();
	       final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
	               .configure() // configures settings from hibernate.cfg.xml
	               .build();
	       
	       SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	       
	       Session session = factory.openSession();
		
		
		session.beginTransaction();
		
		////////////////////////////////////////////////////
		//         REQUETAGE  avec le langage HQL
		////////////////////////////////////////////////////

		System.out.println("\n\n");
		
		//Affichez les tous les Sports
		List<Sport> sports = (List<Sport>)(session
				.createQuery("from metier.Sport").list());//REQUETE HQL

		System.out.println("\nLISTE DES SPORTS :");
		System.out.println("------------------");
		for (Sport s : sports) {
			System.out.println(s);
		}
		
		System.out.println("\n\n");
		
		//Affichez tous les entraineurs
		List<Entraineur> entraineurs = (List<Entraineur>)session
				.createQuery("from metier.Entraineur").list();//REQUETE HQL
		
		System.out.println("\nLISTE DES ENTRAINEURS :");
		System.out.println("-----------------------");
		for (Entraineur e : entraineurs){
			System.out.println(e);
		}

		//TRAVAIL A REALISER//////////////////////////////////////////
		//TRAVAIL A REALISER : REALISEZ LE  mapping de l'entité ADHERENT
		//
		//TRAVAIL A REALISER//////////////////////////////////////////
		//puis Affichez ici tous les  Adherents
		
		List<Adherent> adherents = (List<Adherent>)session
				.createQuery("from metier.Adherent").list();//REQUETE HQL
		
		System.out.println("\n\nLISTE DES ADHERENTS : ");
		for (Adherent f : adherents){
			System.out.println(f+"\n");
		}
		// TODO
		// TODO
		// TODO
		// TODO
		// TODO
		// TODO
		// TODO
	
		//////////////////////////////////////////////////////////
		//         RECHERCHE d'objet particulier : matérialisation
		//////////////////////////////////////////////////////////

		//Affichez le premier Adherent entré précédemment
		//Entraineur e1 = (Entraineur )session.get(Entraineur.class, new Integer(1));
		Entraineur e1 = (Entraineur )session.get(Entraineur.class, 1);// auto-boxing !!
		System.out.println(" un entraineur   " + e1);

		//Affichez un sport présent dans la BD
		Sport s1 = (Sport )session.get(Sport.class, 6);// !!!!!!!
		System.out.println(" un Sport   " + s1);


		//??????
		Sport s2 = (Sport )session.get(Sport.class, 6);// !!!!!!!
		System.out.println(" un autre Sport  ? " + s2);
		///////////////////////////////////////////////////////////
		//TRAVAIL A REALISER : répondez à la question plus haut
		// Comparer les objets s1 et s2
		// A-t-on affaire à des clônes ? Si non alors expliquez ...
		///////////////////////////////////////////////////////////
		// TODO
		// TODO
		// TODO
		// TODO
		// TODO
		// TODO
		
		
		session.close();
		System.out.println("Terminé");
	}
}
