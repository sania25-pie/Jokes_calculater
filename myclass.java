package mypackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.apache.catalina.ha.backend.Sender;
@WebServlet("/myproject")

public class myclass extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] jokes = {
			"What hairstyle you give to your pony,A Ponytail",
	        "Why bicycle got tired,because its too tired",
	        "What if a weak people died,A Weekend ",
	        "What it called if a dog is standing in sun,A hotdog",
	        "What did the clock ask the watch,how houre you",
	        "What it called when a ghost play storts,A sports spirit",
	        "What kind of nail that cant't hamerd on wall, Nailpaint"
	        // Add more jokes here
	    };
  
    public myclass() {
        super(); 
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String x=request.getParameter("num1");
		String y=request.getParameter("num2");
		String str3=request.getParameter("bt1");
		
		int a =Integer.parseInt(x);
		int b =Integer.parseInt(y);
		int ans;
		//type casting
		if(str3.equals("1")) ans=a+b;
		else if(str3.equals("2"))ans=a-b;
		else if(str3.equals("3"))ans=a*b;
		else if(str3.equals("4"))ans=a/b;
		else ans=a%b;
	
		 int randomIndex = (int) (Math.random() * jokes.length);
	     String randomJoke = jokes[randomIndex];
	     
		response.sendRedirect("myjsp.jsp?ans="+ans+"&joke="+randomJoke);
		
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("myjsp.jsp");
		doGet(request, response);
	}

}
