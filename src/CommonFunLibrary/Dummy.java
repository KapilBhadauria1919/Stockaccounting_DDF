package CommonFunLibrary;

public class Dummy {

	public static void main(String[] args) throws Throwable {
		
		ERP_Functions erp = new ERP_Functions();
		erp.launchAPP("http://webapp.qedge.com/login.php");
		erp.login("admin", "master");
		System.out.println();
		

	}

}
