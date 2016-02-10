package servlets;

import Entity.PlayerEntity;
import crud.CarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddServlet", urlPatterns = "/add")
public class AddServlet extends HttpServlet {
    static CarService service = new CarService();
    static String message;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PlayerEntity player = new PlayerEntity();
        request.setCharacterEncoding("utf8");
        if(!request.getParameter("save").equals("")){
            player.setFio(request.getParameter("fio"));
            player.setPosition(request.getParameter("position"));
            player.setAge(Integer.valueOf(request.getParameter("age")));
            player.setCountry(request.getParameter("country"));
            service.add(player);
            message = "Игрок успешно добавлен";

        }
        request.setAttribute("message",message);
        request.getRequestDispatcher("/add.jsp").forward(request,response);
        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/add.jsp").forward(request,response);

    }
}
