import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService implements IEtudiantService {
	
	 
		   
	   IEtudiantRepository IStudRep;
	    IUniversiteRepository IUnivRep;
	   IJournal journal ;
	   
		   
		   public EtudiantService(IEtudiantRepository iStudRep, IUniversiteRepository iUnivRep  ,  IJournal j) {
			    IStudRep = iStudRep;
			    IUnivRep = iUnivRep;
			   this.journal=j;
			   
		   }
		   
	
	
	
	
	
	// utiliser les inerfaces  
		   
	boolean inscription (int matricule, String nom, String pr�nom, String email,String pwd, int id_universite) throws SQLException	
	{
	  //  Etudiant stud = EtdFact.creer(matricule, nom, pr�nom, email,pwd,id_universite);
	    
	    
	    System.out.println ("Log: d�but de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
	    
	    if(IStudRep.ExistsEmail(email)  || IStudRep.Exists(matricule)) 
	    {
	    	return false;
	    }
	   
		
		
		
		                         
	     
		 IStudRep.add(stud);
		 System.out.println("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
		 return true;
	    
		
	}
	
	
	

public ArrayList<Etudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}

public ArrayList<Etudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}


	
}

