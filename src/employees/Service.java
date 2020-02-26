package employees;

import static com.sun.xml.internal.ws.api.message.Packet.Status.Response;
import javax.xml.ws.Response;



public class Service {

	
	public Employee getEmployeeInJSON() {

		Employee e1 = new Employee(1,"Kenta","Shikata","shikata@gmail.com","0551");
		return e1;
	}


	public Response createEmployeeInJSON(Employee e) {

		String result = "Employee created : " + e;
            return null;
	
		
	}
	
}