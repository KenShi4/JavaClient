package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
public class Methods
{


	//  http://localhost:8080/api/tutorial/1.0/employees

            public static void Create() {
            try {

		URL url = new URL(" http://localhost:8080/api/tutorial/1.0/employees");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");
		String input = "{\"employeeId\":" + 100+ "," + "\"firstName\":" + "\"" + "Lebron" + "\"" + "," + "\"lastName\":" + "\"" + "James" + "\"" + "," + "\"email\":" + "\"" + "James@gm.com" + "\"" + "," + "\"phone\":" + "\"" + "9090" + "\"" + "}";


		OutputStream os = conn.getOutputStream();
		os.write(input.getBytes());
		os.flush();
		if (conn.getResponseCode() != 200 && conn.getResponseCode() != 201) {
			throw new RuntimeException("Failed : HTTP error code : "
				+ conn.getResponseCode());
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();

	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();

	 }

	}
           
            
        
        public static void Get() {

	  try {

		URL url = new URL("http://localhost:8080/api/tutorial/1.0/employees");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();
	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();
	  }
	}    
        
        
        
        public static void GetId() {

	  try {

		URL url = new URL("http://localhost:8080/api/tutorial/1.0/employees/8");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();
	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();
	  }
	}    
        
        public static void Delete() {

	  try {

		URL url = new URL("http://localhost:8080/api/tutorial/1.0/employees/8");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("DELETE");
		conn.setRequestProperty("Accept", "application/json");

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();
	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();
	  }
	}    
        
        
                 public static void Update() {
            try {

		URL url = new URL(" http://localhost:8080/api/tutorial/1.0/employees/100");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");
		String input = "{\"employeeId\":" + 100+ "," + "\"firstName\":" + "\"" + "BronLe" + "\"" + "," + "\"lastName\":" + "\"" + "James" + "\"" + "," + "\"email\":" + "\"" + "James@gm.com" + "\"" + "," + "\"phone\":" + "\"" + "9090" + "\"" + "}";
		OutputStream os = conn.getOutputStream();
		os.write(input.getBytes());
		os.flush();
		if (conn.getResponseCode() != 200 && conn.getResponseCode() != 201) {
			throw new RuntimeException("Failed : HTTP error code : "
				+ conn.getResponseCode());
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();

	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();

	 }

	}
           
            
            
}
