package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import blogFormation.models.Formation;
import blogFormation.models.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.PostsServices;

/**
 * Servlet implementation class Formation
 */
@WebServlet("/formation")
public class FormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Student> students = new ArrayList<Student>();
	private List<Formation> formations = new ArrayList<Formation>();
	private PostsServices postsServices = PostsServices.getInstance();
    /**
     * Default constructor. 
     */
    public FormationServlet() {
        this.formations = postsServices.getFormations();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setAttribute("formations", formations);
		request.getRequestDispatcher("/WEB-INF/formation.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
