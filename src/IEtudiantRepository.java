import java.util.ArrayList;

public interface IEtudiantRepository {
 void add(Etudiant E);
 boolean ExistsEmail(String email);
 boolean ExistsMat(int mat) ;
 
 
}
