package servlets;

//import Hiber.HibernateSessionFactory;
import Entity.PlayerEntity;
import crud.CarService;
import org.hibernate.Session;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name="MyServlet",urlPatterns = "/")
public class MyServlet extends HttpServlet {


    private static final long serialVersionUID = -8190096443328242959L;
    static CarService service = new CarService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        PlayerEntity playerEntity = new PlayerEntity();
        List<PlayerEntity> PlayerEntities = service.getAll();

        //Выводим полученый список авто
        req.setAttribute("players",PlayerEntities);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/list.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        PrintWriter out = resp.getWriter();

        out.println("Success add");

    }
}
