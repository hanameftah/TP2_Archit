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
		   
	boolean inscription (int matricule, String nom, String prénom, String email,String pwd, int id_universite) throws SQLException	
	{
	  //  Etudiant stud = EtdFact.creer(matricule, nom, prénom, email,pwd,id_universite);
	    journal.Mssg("mssg: echec de l'ajout d'un etudiant avec le matricule"+matricule);
	    
	    System.out.println ("Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule);
	    
	    if(IStudRep.ExistsEmail(email)  || IStudRep.ExistsMat(matricule)) 
	    {journal.Mssg("mssg: echec de l'ajout de l'etidiant car le matricule ou bien le mail n'existe pas ");
	    	return false;
	    }
	   
		
		
		
		                         
	     
		
		IStudRep.add(stud);
		 journal.Mssg("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule);
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

