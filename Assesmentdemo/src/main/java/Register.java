

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Register() {
    	super();
        // TODO Auto-generated constructor stub
    }
    
    protected void success(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    	
    	String fname=null;;
    	String lname=null;
    	String pass=null;
    	String age=null;
    	String number=null;
    	Cookie[] cookies = request.getCookies();

    		
    		if (cookies != null) {
    		    for (Cookie cookie : cookies) {
    		        
    		    	if (cookie.getName().equals("regData")) {
    		            String combinedData = cookie.getValue();
    		            String[] userDataArray = combinedData.split(":");
    		            
    		             fname = userDataArray[0];
    		             lname = userDataArray[1];
    		             pass = userDataArray[2];
    		             age = userDataArray[3];
    		             number = userDataArray[4];

    		        }
    		    }
    		}
    		
    	
    		File file = new File("test.txt");
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
                bw.newLine();
                bw.write("First Name : "+fname);
                bw.newLine();
                bw.write("Last Name : "+lname);
                bw.newLine();
                bw.write("Password : "+pass);
                bw.newLine();
                bw.write("Age : "+age);
                bw.newLine();
                bw.write("Phone Number : "+number);
                bw.newLine();
             
            } catch (IOException e) {
                e.printStackTrace();
            }	
            
            
    		
//            String filePath = "C://file.txt"; // Specify your desired file path
//
//            // Create a File object representing the file
//            File file = new File(filePath);
//
//            try {
//                // Create the file
//                if (file.createNewFile()) {
//                    System.out.println("File created: " + file.getName());
//                } else {
//                    System.out.println("File already exists.");
//                }
//
//                // Write "hello" into the file using FileWriter
//                FileWriter bw = new FileWriter(file);
//               
//                bw.write("First Name : "+fname);
//                
//                bw.write("Last Name : "+lname);
//                bw.write("Password : "+pass);
//                
//                bw.write("Age : "+age);
//                
//                bw.write("Phone Number : "+number);
//                
//                bw.close();
//              
//            } catch (IOException e) {
//                
//                e.printStackTrace();
//            }
    		
    	
    	
		for(Cookie cookie: cookies) {
			cookie.setValue(null);
			cookie.setMaxAge(0);
			response.addCookie(cookie);	
		}
		
		
		response.sendRedirect("sucess.jsp");
		
    }
    
    
    protected void reset(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    		response.sendRedirect("SignUp.jsp");
    	
		}
    

    protected void register(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String pass = request.getParameter("password");
		String age = request.getParameter("age");
		String number = request.getParameter("number");
		
		String combinedData = fname + ":" + lname + ":" + pass + ":" + age + ":" + number;

			request.getSession().invalidate();
			Cookie cookie = new Cookie("regData",combinedData);
			response.addCookie(cookie);
			response.sendRedirect("Conformation.jsp");
//			response.sendRedirect(request.getContextPath()+"/Conformation?action=conform");			
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action) {
		case "register" : {
			register(request,response);
			break;
		}
		case "submit" : {
			success(request,response);
			break;
		}case "reset" : {
			reset(request,response);
			break;
		}
		
		default:
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;
		
		}
	}

}
