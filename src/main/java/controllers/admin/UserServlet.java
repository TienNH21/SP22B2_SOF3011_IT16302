package controllers.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.form_data.RegisterData;

@WebServlet({
	"/users/index",
	"/users/create",
	"/users/store",
	"/users/edit",
	"/users/update",
	"/users/delete",
	"/users/show",
})
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UserServlet() {
        super();
    }

	protected void doGet(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		String uri = request.getRequestURI();
		
		if (uri.contains("index")) {
			this.index(request, response);
		} else if (uri.contains("create")) {
			this.create(request, response);
		} else if (uri.contains("edit")) {
			this.edit(request, response);
		} else if (uri.contains("delete")) {
			this.delete(request, response);
		} else if (uri.contains("show")) {
			this.show(request, response);
		} else {
			// 404
		}
	}

	protected void doPost(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		String uri = request.getRequestURI();
		
		if (uri.contains("store")) {
			this.store(request, response);
		} else if (uri.contains("update")) {
			this.update(request, response);
		} else {
			// 404
		}
	}

	private void index(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		List<RegisterData> ds = new ArrayList<RegisterData>();
		RegisterData o1 = new RegisterData("Ng Van A", "HN",
			"anv@gmail.com", "123123", "0123", 1, 0),
			o2 = new RegisterData("Ng Van B", "HN",
				"anv@gmail.com", "123123", "0123", 1, 0),
			o3 = new RegisterData("Ng Thi C", "HN",
					"anv@gmail.com", "123123", "0123", 0, 0);
		
		ds.add(o1);
		ds.add(o2);
		ds.add(o3);
		request.setAttribute("ds", ds);
		request.setAttribute("view",
			"/views/admin/users/index.jsp");
		request.getRequestDispatcher("/views/layout.jsp")
			.forward(request, response);
	}
	
	private void create(
		HttpServletRequest request,
		HttpServletResponse response
	) {
		//
	}
	
	private void edit(
		HttpServletRequest request,
		HttpServletResponse response
	) {
		//
	}
	
	private void delete(
		HttpServletRequest request,
		HttpServletResponse response
	) {
		//
	}
	
	private void show(
		HttpServletRequest request,
		HttpServletResponse response
	) {
		//
	}
	
	private void store(
		HttpServletRequest request,
		HttpServletResponse response
	) {
		//
	}
	
	private void update(
		HttpServletRequest request,
		HttpServletResponse response
	) {
		//
	}
}
