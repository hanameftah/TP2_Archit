import java.sql.Date;
import java.text.SimpleDateFormat;

public class MssgGenere implements IJournal {

	IJournal J ;
	
	public MssgGenere(IJournal j) {
		
	}

	@Override
	public void Mssg(String mssg) {
		// TODO Auto-generated method stub
		SimpleDateFormat DATE_FORMAT =new SimpleDateFormat();
		J.Mssg(DATE_FORMAT.format(new Date(0, 0, 0))+ "" +""+mssg);
	}

}
