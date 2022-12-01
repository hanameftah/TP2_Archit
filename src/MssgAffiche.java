
public class MssgAffiche implements IJournal {
  IJournal j1;
  IJournal j2;
  
   public MssgAffiche(IJournal j1,IJournal j2) {
	   super();
	   this.j1 = j1;
	   this.j2=j2;
   }
   
   public void Mssg(String mssg) {
	   j1.Mssg(mssg);
	   j2.Mssg(mssg);
   }
}
