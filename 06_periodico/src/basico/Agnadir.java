package basico;

import java.io.IOException;
import java.security.KeyStore.ProtectionParameter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Añadir
 */
@WebServlet("/Agnadir")
public class Agnadir extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Agnadir() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	
	}
		
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String mail= request.getParameter("mail");
		System.out.println(mail);
		int categoria= Integer.parseInt(request.getParameter("categoria"));
				System.out.println(categoria);
		String titulo= request.getParameter("titulo");
				System.out.println(titulo);
		String contenido= request.getParameter("contenido");
				System.out.println(contenido);
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/periodico","root","");
					
					PreparedStatement ps= conn.prepareStatement("INSERT INTO noticias (mail,id_categoria,titulo_noticia, contenido) VALUES (?,?,?,?)");
							
ps.setString(1,mail);
ps.setInt(2, categoria);
ps.setString(3,titulo);
ps.setString(4, contenido);

ps.executeUpdate();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
	}

}