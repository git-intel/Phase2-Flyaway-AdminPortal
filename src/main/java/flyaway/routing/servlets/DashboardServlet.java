
package flyaway.routing.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import flyaway.usermanagement.dao.UserDao;
import flyaway.airlines.dao.AirportDao;
import flyaway.usermanagement.model.User;
import flyaway.airlines.model.Airport;

/**
 * ControllerServlet.java This servlet acts as a page controller for the
 * application, handling all requests from the user.
 * 
 * @email Ajay Augustine
 */

@WebServlet("/")
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;
	private AirportDao airportDao;

	public void init() {
		userDao = new UserDao();
		airportDao = new AirportDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
//			User Config
			case "/new-user":
				showNewUserForm(request, response);
				break;
			case "/insert-user":
				insertUser(request, response);
				break;
			case "/delete-user":
				deleteUser(request, response);
				break;
			case "/edit-user":
				showUserEditForm(request, response);
				break;
			case "/update-user":
				updateUser(request, response);
				break;
			case "/list-user":
				listUser(request, response);
				break;
//				Airport Config
			case "/new-airport":
				showNewAirportForm(request, response);
				break;
			case "/edit-airport":
				showAirportEditForm(request, response);
				break;
			case "/insert-airport":
				insertAirport(request, response);
				break;
			case "/delete-airport":
				deleteAirport(request, response);
				break;
			case "/update-airport":
				updateAirport(request, response);
				break;
			case "/list-airport":
				listAirport(request, response);
				break;
//				Home
			case "/home":
				homePage(request, response);
				break;
			default:
				homePage(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

//	-----Home Page Start--------
	private void homePage(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);
	}
//	-----Home Page End----------

//	-----Users Page Start-------
	private void showNewUserForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		dispatcher.forward(request, response);
	}

	private void showUserEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		User existingUser = userDao.getUser(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		request.setAttribute("user", existingUser);
		dispatcher.forward(request, response);

	}

	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<User> listUser = userDao.getAllUser();
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
		dispatcher.forward(request, response);
	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User newUser = new User(first_name, last_name, email, username, password);
		userDao.saveUser(newUser);
		response.sendRedirect("list-user");
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User user = new User(id, first_name, last_name, email, username, password);
		userDao.updateUser(user);
		response.sendRedirect("list-user");
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		userDao.deleteUser(id);
		response.sendRedirect("list-user");
	}

//	-----Users Page End-----------
//	-----Airport Page Start-------
	private void listAirport(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Airport> listOfAirports = airportDao.getAllAirport();
		request.setAttribute("listAirports", listOfAirports);
		RequestDispatcher dispatcher = request.getRequestDispatcher("airport-list.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewAirportForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("airport-config-form.jsp");
		dispatcher.forward(request, response);
	}

	private void showAirportEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Airport existingAirport = airportDao.getAirport(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("airport-config-form.jsp");
		request.setAttribute("port", existingAirport);
		dispatcher.forward(request, response);

	}

	private void insertAirport(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		String airport_code = request.getParameter("airport_code");
		String airport_name = request.getParameter("airport_name");
		String country = request.getParameter("country");
		String state = request.getParameter("state");
		Airport port = new Airport(airport_code, airport_name, country, state);
		airportDao.saveAirport(port);
		response.sendRedirect("list-airport");
	}

	private void updateAirport(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String airport_code = request.getParameter("airport_code");
		String airport_name = request.getParameter("airport_name");
		String country = request.getParameter("country");
		String state = request.getParameter("state");

		Airport port = new Airport(id, airport_code, airport_name, country, state);
		airportDao.updateAirport(port);
		response.sendRedirect("list-airport");
	}

	private void deleteAirport(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		airportDao.deleteAirport(id);
		response.sendRedirect("list-airport");
	}

//	-----Airport Page End---------
}