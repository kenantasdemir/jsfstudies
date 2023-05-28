package com.kenant42.jsfstudies;

import java.io.*;
import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.util.Locale;

import jakarta.faces.model.DataModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {




    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.append("<b>Merhaba Dünya</b>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("firstcookie","cookievalue");
        cookie.setMaxAge(4000);
        cookie.setVersion(4);
        cookie.setHttpOnly(true);
        cookie.setComment("yorum");
        cookie.setSecure(true);
        response.addCookie(cookie);

        response.addHeader("Content-Type","text/html");
        response.getHeaderNames();
        response.getStatus();
        response.sendError(404);
        response.setContentType("application/json");
        response.getContentType();
        response.reset();
        response.setCharacterEncoding("utf-8");
        response.getCharacterEncoding();
        response.getBufferSize();
        response.flushBuffer();





        request.getHeaderNames();
        request.getCookies();
        request.getAuthType();
        request.getMethod();

        request.getSession().getAttributeNames();
        request.getSession().getCreationTime();
        request.getSession().getId();
        request.getSession().getLastAccessedTime();
        request.getSession().isNew();

        request.getRequestedSessionId();
        request.isRequestedSessionIdValid();
        request.isRequestedSessionIdFromCookie();
        request.isRequestedSessionIdFromURL();



        request.getContentType();
      Cookie[] cerezler =  request.getCookies();
        for (Cookie cerez:cerezler){
            System.out.println(cerez.getValue());
            System.out.println(cerez.getDomain());
            System.out.println(cerez.getVersion());
            System.out.println(cerez.getPath());
            System.out.println(cerez.getSecure());
            System.out.println(cerez.getComment());
            System.out.println(cerez.getName());
            System.out.println("****************************************");

        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
        req.isUserInRole("admin");
    }

    public void sessionOperations(HttpSession httpSession,HttpServletRequest request){
        httpSession.isNew();
        //sessionın yeni mi eski mi olduğu kontrol edilir.

        httpSession.getId();
        //session id bilgisini döner

        httpSession.invalidate();
        //sessionu geçersizleştirir.

        httpSession.getMaxInactiveInterval();
        //sessionun yaşam süresini verir.

        httpSession.getCreationTime();

        httpSession.getLastAccessedTime();

        Locale locale = request.getLocale( );
        NumberFormat nft = NumberFormat.getPercentInstance(locale);
        nft.getMaximumIntegerDigits();




    }

}