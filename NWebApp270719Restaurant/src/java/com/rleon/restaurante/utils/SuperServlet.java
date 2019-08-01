package com.rleon.restaurante.utils;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Leon Matias R.
 * @date 31-jul-2019
 * @time 21:48:11
 */
public abstract class SuperServlet extends HttpServlet{

    public void callPage(String s, HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
        throws IOException, ServletException
    {
        httpservletresponse.setHeader("Pragma", "No-cache");
        httpservletresponse.setDateHeader("Expires", 0L);
        httpservletresponse.setHeader("Cache-Control", "no-cache");
        getServletConfig().getServletContext().getRequestDispatcher(s).forward(httpservletrequest, httpservletresponse);
    }
}
