import java.nio.file.Path;
import java.nio.file.Paths;

public class MssgFichier implements IJournal {
	private final Path path;

 public MssgFichier(String pathString ) {
	 path=Paths.get(pathString).toAbsolutePath();
 }
	@Override
	public void Mssg(String mssg) {
		// TODO Auto-generated method stub
		
	}

}
