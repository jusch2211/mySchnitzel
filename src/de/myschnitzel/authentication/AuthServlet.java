package de.myschnitzel.authentication;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jusch on 07.05.2016.
 */
//@javax.servlet.annotation.WebServlet(name = "authServlet")
public class AuthServlet extends HttpServlet implements Serializable{
    private static final Map<String, User> users = getUsers();

    /**
     * Creates valid users
     *
     * This User Map could be users returned from a database
     * or a simple select with the user.name
     *
     * @return a Map of valid users
     */
    private static Map<String, User> getUsers() {
        Map<String, User> users = new HashMap<String, User>();

        User userOne = new User("one","1");
        User userTwo = new User("two","2");

        users.put(userOne.getName(), userOne);
        users.put(userTwo.getName(), userTwo);

        return users;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd;
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        User currentUser = validateLogin(name, password);

        User workaroundUser = new User("three","3");//TODO: Replace map with users. GAE does not like maps in sessions
        //Not Serializable Exception with java.util.map!

        System.out.println("USER: "+currentUser);
        if (currentUser == null){
            rd = request.getRequestDispatcher("/loginError.jsp");
        }
        else{
            HttpSession session = request.getSession();
            //session.setAttribute("user", currentUser);
            session.setAttribute("user", workaroundUser);
            rd = request.getRequestDispatcher("/loginSuccess.jsp");
        }

        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private User validateLogin(String name, String password){
        // All parameters must be valid
        //TODO: Authentication call here
        if (name == null || password == null){
            return null;
        }

        // Get a user by key
        User user = users.get(name);

        if (user == null){
            return null;
        }

        if (!user.getPassword().equals(password.trim())){
            return null;
        }

        return user;
    }
}
