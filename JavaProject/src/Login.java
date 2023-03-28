
public class Login {
	
	public boolean checkID(String[] arrID,String ID) {
		boolean flag_OK = false;
		
		for(String id: arrID) {
			if(id.equals(ID)) flag_OK = true;
		}
		
		return flag_OK;
	}
	
}
