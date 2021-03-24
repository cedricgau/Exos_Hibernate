package test;
import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test0_create
{
	public static void main(String[] args) {
		
	       final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
	               .configure() // configures settings from hibernate.cfg.xml
	               .build();
	       
	       SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	       
	       Session session = factory.openSession();
		
		
		
		
		

		session.close();
		//La structure des tables est cr�e conform�ment au mapping 
		// pas besoin d'ouvrir la transaction	    
		factory.close();

		//System.err.println("La cr�ation de la SessionFactory a �chou�" + ex);
		
//	finally{
//		session.close();
//	
//	}
	}

}
