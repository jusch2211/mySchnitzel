package de.myschnitzel.authentication;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Jusch on 07.05.2016.
 */
public class AuthFilter implements Filter {
    private String LOGIN_ACTION_URI;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        System.out.println("Filter: User "+user +"::"+request.getRequestURI());

        if (user == null && !LOGIN_ACTION_URI.equals(request.getRequestURI())){
            System.out.println("Filter: User not logged in! ");
            RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
            rd.forward(request, resp);
            return;
        }


        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        LOGIN_ACTION_URI = config.getInitParameter("loginActionURI");
    }

}
