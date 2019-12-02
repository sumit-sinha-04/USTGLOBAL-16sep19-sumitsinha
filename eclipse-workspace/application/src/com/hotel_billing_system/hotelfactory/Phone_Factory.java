
import com.phone_app_system.dao.phoneDaoImplemenation;
import com.phone_app_system.dao.phone_Dao;

public class Phone_Factory {
	public Phone_Factory() {
		
	}
	
	public static phone_Dao getInstance() {
		
		phone_Dao dao =  new phoneDaoImplemenation();
		return dao;
		
	}

}
