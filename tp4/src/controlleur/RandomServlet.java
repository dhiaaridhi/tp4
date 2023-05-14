package controlleur;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.NumberBean;

import java.util.Random;

/**
 * Servlet implementation class RandomServlet
 */
@WebServlet("/RandomServlet")
public class RandomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RandomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	              String nombre = request.getParameter("nb");
	              
	              NumberBean nb = new NumberBean(nombre);
	               nb.setNombre(nombre);
	                
	               request.setAttribute("nb", nb );
	                
	               
	               this.getServletContext().getRequestDispatcher("/random.jsp").forward(request, response);		
	               
	                
	              
	          }
	      

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
