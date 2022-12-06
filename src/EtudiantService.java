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
	 EtudiantRepository StudRep=new EtudiantRepository(null);
	 UniversiteRepository UnivRep =new UniversiteRepository();
	 Etudiant stud =new Etudiant (matricule,nom,prénom,email,pwd,id_universite);
	 Universite univ=UnivRep.GetById(id_universite);
	    journal.Mssg("mssg: echec de l'ajout d'un etudiant avec le matricule"+matricule);
	    
	    System.out.println ("mssg : début de l'opération d'ajout de l'étudiant avec matricule "+matricule);
	    
	    if(IStudRep.ExistsEmail(email)  || IStudRep.ExistsMat(matricule)) 
	    {journal.Mssg("mssg: echec de l'ajout de l'etidiant car le matricule ou bien le mail n'existe pas ");
	    	return false;
	    }
	    //peut etre l'etudiant avec email et matricule est déja inscrit 
	   if(StudRep.Exists(matricule))
	   {
		   return false ;
	   }
	   
		if (StudRep.Exists(email))
		{
			return false;
		}
   if(univ.getPack() ==TypePackage.Standard) 
   {
	   stud.setNbLivreMensuel_Autorise(10);
	   
   }
   else if (univ.getPack() == TypePackage.Premium)
   {
	   stud.setNbLivreMensuel_Autorise(10*2);
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

