package edu.eci.cvds.servlet;

import java.io.IOException;
import java.io.Writer;
import java.net.MalformedURLException;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.Optional;

import javax.faces.context.ResponseWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.eci.cvds.servlet.model.Todo;
import edu.eci.cvds.servlet.Service;
@WebServlet(
    urlPatterns = "/helloTodoServlet"
)
public class TodoServlet extends HttpServlet{
    static final long serialVersionUID = 35L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	Writer responseWriter = resp.getWriter();
    	try {   
    		Optional<String> optName = Optional.ofNullable(req.getParameter("id"));
		    String id = optName.isPresent() && !optName.get().isEmpty() ? optName.get() : "";
		    int intId = Integer.parseInt(id); 
		    Todo todo= Service.getTodo(intId);
		    ArrayList<Todo> listaTodos = new ArrayList<Todo>();
		    listaTodos.add(todo);
		    //resp.setStatus(HttpServletResponse.SC_OK);
		    responseWriter.write(Service.todosToHTMLTable(listaTodos));
	    }catch (java.lang.NumberFormatException e) {
			responseWriter.write("requerimiento inválido");
		}catch (MalformedURLException e) {
			responseWriter.write("error interno en el servidor");
		}catch(Exception e) {
			responseWriter.write("requerimiento inválido");
		}
   }
    
}