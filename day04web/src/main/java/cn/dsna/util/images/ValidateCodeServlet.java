package cn.dsna.util.images;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ValidateCodeServlet extends HttpServlet
{
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest reqeust, HttpServletResponse response)
    throws ServletException, IOException
  {
    response.setContentType("image/jpeg");

    response.setHeader("Pragma", "no-cache");
    response.setHeader("Cache-Control", "no-cache");
    response.setDateHeader("Expires", 0L);

    HttpSession session = reqeust.getSession();

    ValidateCode vCode = new ValidateCode(120, 40, 5, 100);
    session.setAttribute("code", vCode.getCode());
    vCode.write(response.getOutputStream());
  }
}