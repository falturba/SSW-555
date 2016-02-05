import java.io.*;
import java.util.Date;
import java.util.List;

class IndividualRecord {

	String SEX, Id, BirthDate, FamS, FamC, Marr, husb, wife, Fam, Name;
	Date DeathDate;


	public IndividualRecord(String id, String name, String sex, String birthdate, String Fams, String Famc  )
	{ this.Id=id;
	this.Name=name;
	this.SEX=sex;
	this.BirthDate=birthdate;
	//this.DeathDate=deathdate;
	this.FamS=Fams;
	this.FamC=Famc;

	}


}
class FamilyInfo{
	String FamilyId;
	String HusbandId;
	String WifeId;
	List <String> ChlidrenIds;
	
//	public FamilyInfo (String familyId, String husbandId, String wifeId)
//	{
//		this.FamilyId=familyId;
//		this.HusbandId=husbandId;
//		this.WifeId=wifeId;
//		
//	}
}
	
public class P03  {
	

  
    private  static IndividualRecord[] indRecords;
    private static FamilyInfo [] Family;
    private static int indiFlag = 0, item = 0, item1 = -1;
    private static String  line, FamilyId, IndiTag = null;
    private static String name = null, sex = null, famc = null, fams = null,
			id = null, birt = null;
    
    

	  @SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		    indRecords =new IndividualRecord[5000];
		    Family=new FamilyInfo[1000];
		    
		    
		    
	    	FileInputStream  fis = new FileInputStream("wejdanfamily");
    	    DataInputStream dis = new DataInputStream(new BufferedInputStream(fis));
    	    
            String Line;
            //String name=null,sex = null,famc=null,fams=null, id=null;
          //  String FamilyId=null, tag=null, IndiTag=null;
           // String birt=null, WifeId=null,HusbId=null;
	     //   int indiFlag=0, item=0, item1=0;
	        
	        
		while (dis.available() != 0) {
			Line = dis.readLine();

			String[] info = Line.split(" ");
			String Tag = null;
			for (int l = 0; l < info.length; l++) {
				if (!(Character.isDigit(info[l].charAt(0)))
						&& !(info[l].matches("^.*[^a-zA-Z0-9 ].*$"))) {
					Tag = info[l];
					break;
				}
			}
	      
