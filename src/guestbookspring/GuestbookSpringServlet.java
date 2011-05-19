package guestbookspring;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GuestbookSpringServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, 1");
	}
}
