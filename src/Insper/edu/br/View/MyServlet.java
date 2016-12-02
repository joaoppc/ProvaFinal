package Insper.edu.br.View;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MyClass myClass = new MyClass();

        if (request.getParameter("button1") != null) {
            myClass.method1();
        
        }

        request.getRequestDispatcher("/WEB-INF/some-result.jsp").forward(request, response);
    }

}