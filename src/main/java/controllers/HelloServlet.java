package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Integer> list;
       
    public HelloServlet() {
        super();
    }

	protected void doGet(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		Date now = new Date();
		String name = request.getParameter("ho_ten");
		request.setAttribute("name", name);
		request.setAttribute("now", now);
		request.setAttribute("view", "/views/welcome.jsp");
		request.getRequestDispatcher("/views/layout.jsp")
			.forward(request, response);		
	}

	protected void doPost(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public void init() {
		System.out.println("Init...");
		this.list = new ArrayList<Integer>();
	}
	
	public void service(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		this.list.add(1);
		this.list.add(2);
		this.list.add(3);
		System.out.println("Service: " + this.list.size());
		
		super.service(request, response);
	}
	
	public void destroy() {
		System.out.println("Destroy...");
	}
}
