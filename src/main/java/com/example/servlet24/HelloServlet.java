package com.example.servlet24;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import com.google.gson.Gson;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        // Obter os parâmetros do formulário
        String nome = request.getParameter("nome");
        String idade = request.getParameter("idade");

        Pessoa pessoa = new Pessoa(nome, idade);
        Gson gson = new Gson();

        response.getWriter().write(gson.toJson(pessoa));

        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1> Servlet Pessoa </h1>");
//        out.println("<p>Nome: " +  nome +  "</p>");
//        out.println("<p>Idade: " + idade +  " anos</p>");
//        out.println("<p>JSON: " + json + "</p>");
//        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Obter os parâmetros do formulário
        String nome = request.getParameter("nome");
        String idade = request.getParameter("idade");

        Pessoa pessoa = new Pessoa(nome, idade);
        Gson gson = new Gson();

        response.getWriter().write(gson.toJson(pessoa));
    }
}