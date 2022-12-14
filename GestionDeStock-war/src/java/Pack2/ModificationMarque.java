/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack2;

import Pack1.Marque;
import Pack1.MarqueFacade;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author haitam
 */
public class ModificationMarque extends HttpServlet {

    @EJB
    private MarqueFacade marqueFacade;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ModificationMarque</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ModificationMarque at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        try (PrintWriter out = response.getWriter()) {
            String nomMarque = request.getParameter("nomMarque");
            Marque marque = marqueFacade.find(nomMarque);
            
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<title>Creation de marque</title>");
            out.println("<style>");
            out.println("@import url(https://fonts.googleapis.com/css?family=Montserrat);");
            out.println("");
            out.println("*{");
            out.println("padding: 0;");
            out.println("margin:0;");
            out.println("box-sizing: border-box;");
            out.println("}");
            out.println("");
            out.println("body{");
            out.println("width: 100%;");
            out.println("font-family: montserrat, arial, verdana;");
            out.println("background: rgb(223,187,157);");
            out.println("background: linear-gradient(90deg, rgba(223,187,157,1) 0%, rgba(160,132,207,1) 100%);");
            out.println("color:#fff;");
            out.println("}");
            out.println("");
            out.println("");
            out.println(".gradient-box {");
            out.println("display: flex;");
            out.println("align-items: center;");
            out.println("width: 100%;");
            out.println("margin: auto;");
            out.println("max-width: 22em;");
            out.println("position: relative;");
            out.println("padding: 3rem 2.5rem;");
            out.println("box-sizing: border-box;");
            out.println("color: #eee;");
            out.println("background : rgb(107, 75, 161,0.6);");
            out.println("box-shadow: 5px 6px 20px #06283D;");
            out.println("/* !important?? */");
            out.println("background-clip: padding-box;");
            out.println("/* !important?? */");
            out.println("border: solid 5px transparent;");
            out.println("border-radius: 1em;");
            out.println("margin-top:2rem;");
            out.println("}");
            out.println("");
            out.println("");
            out.println("h1{");
            out.println("height:10vh;");
            out.println("text-align: center;");
            out.println("}");
            out.println("");
            out.println(".form{");
            out.println("height:70vh;");
            out.println("width:60%;");
            out.println("margin:0 auto;");
            out.println("display:flex;");
            out.println("justify-content: center;");
            out.println("align-items:center;");
            out.println("}");
            out.println("");
            out.println("form{");
            out.println("height:40%;");
            out.println("width:70%;");
            out.println("text-align:center;");
            out.println("background-color : rgb(107, 75, 161,0.6);");
            out.println("padding-top:1.5rem;");
            out.println("border-radius: 20px;");
            out.println("z-index: 1;");
            out.println("position:relative;");
            out.println("transition: all 0.3s ease 0s;");
            out.println("box-shadow: 5px 6px 20px #06283D;");
            out.println("}");
            out.println("form:hover{");
            out.println("transform: translateY(-7px);");
            out.println("}");
            out.println("");
            out.println("input {");
            out.println("background-color: #DFBB9D;");
            out.println("border-radius: 12px;");
            out.println("border: 0;");
            out.println("color: #06283D;");
            out.println("font-size: 18px;");
            out.println("outline: 0;");
            out.println("padding : .3rem 1rem;");
            out.println("margin: 1rem 2rem;");
            out.println("");
            out.println("}");
            out.println("");
            out.println("input[type=\"submit\"]{");
            out.println("position: absolute;");
            out.println("bottom:-28px;");
            out.println("left:34%;");
            out.println("padding:.5rem 1rem;");
            out.println("background-color: 08d;");
            out.println("color:#F7E2D6;");
            out.println("background-color: #08d;");
            out.println("font-size: 1rem;");
            out.println("color: #06283D;");
            out.println("background-color: #fff;");
            out.println("border: none;");
            out.println("border-radius: 45px;");
            out.println("box-shadow: 0px 8px 15px rgba(0, 0, 0, 0.1);");
            out.println("transition: all 0.3s ease 0s;");
            out.println("cursor: pointer;");
            out.println("outline: none;");
            out.println("");
            out.println("}");
            out.println("input[type=\"submit\"]:hover {");
            out.println("background-color: #2EE59D;");
            out.println("box-shadow: 0px 15px 20px rgba(46, 229, 157, 0.4);");
            out.println("color: #06283D;");
            out.println("");
            out.println("}");
            out.println("");
            out.println("span{");
            out.println("font-weight: bold;");
            out.println("border-bottom: 1px solid red;");
            out.println("}");
            out.println("");
            out.println("</style>");
            out.println("<link");
            out.println("rel=\"stylesheet\"");
            out.println("href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css\"");
            out.println("/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 class=\"gradient-box\">Servlet Creation Marque</h1>");
            out.println("<div class=\"form animate__animated animate__backInUp\">");
            out.println("<form action=\"ModificationMarque\" class=\"forme\" method=\"POST\">");
            out.println("<input name=\"nomMarque\" value=\"" + marque.getNomMarque() + "\" hidden/>");
            out.println("<span class=\"label\">Nom de la marque :</span>");
            out.println("<span>" + marque.getNomMarque() + "</span>");
            out.println("</br>");
            out.println("<span class=\"label\">");
            out.println("Origine de fabrication :");
            out.println("</span>");
            out.println("<input type=\"text\" name=\"origineDeFabrication\" value=\"" + marque.getOrigineDeFabrication() + "\"/>");
            out.println("</br>");
            out.println("<input type=\"submit\" value=\"Ajouter marque\"/>");
            out.println("</form>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");

            /*
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ModificationMarque</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ModificationMarque at " + request.getContextPath() + "</h1>");
            out.println("<form action=\"ModificationMarque\" method=\"POST\">");
            out.println("<input name=\"nomMarque\" value=\"" + marque.getNomMarque() + "\" hidden/>");
            out.println("Nom de la marque :");
            out.println("<span>" + marque.getNomMarque() + "</span>");
            out.println("</br>");
            out.println("Origine de fabrication :");
            out.println("<input type=\"text\" name=\"origineDeFabrication\" value=\"" + marque.getOrigineDeFabrication() + "\"/>");
            out.println("</br>");
            out.println("<input type=\"submit\" value=\"modifier\"/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
            */
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String nomMarque = request.getParameter("nomMarque");
            String origineDeFabrication = request.getParameter("origineDeFabrication");
            Marque marque = new Marque(nomMarque,origineDeFabrication);

            boolean modified = marqueFacade.modifier(marque);
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ModificationMarque</title>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("    <style>\n" +
            "        @import url(https://fonts.googleapis.com/css?family=Montserrat);\n" +
            "\n" +
            "*{\n" +
            "    padding: 0;\n" +
            "    margin:0;\n" +
            "    box-sizing: border-box;\n" +
            "}\n" +
            "\n" +
            "body{\n" +
            "    width: 100%;\n" +
            "    font-family: montserrat, arial, verdana;\n" +
            "    background: rgb(223,187,157);\n" +
            "    background: linear-gradient(90deg, rgba(223,187,157,1) 0%, rgba(160,132,207,1) 100%);\n" +
            "    color:#fff;\n" +
            "}\n" +
            "\n" +
            "\n" +
            ".gradient-box {\n" +
            "    display: flex;\n" +
            "    align-items: center;\n" +
            "    width: 100%;\n" +
            "    margin: auto;\n" +
            "    max-width: 22em;\n" +
            "    position: relative;\n" +
            "    padding: 3rem 2.5rem;\n" +
            "    box-sizing: border-box;\n" +
            "    color: #eee;\n" +
            "    background : rgb(107, 75, 161,0.6);\n" +
            "    box-shadow: 5px 6px 20px #06283D;\n" +
            "    /* !important?? */\n" +
            "    background-clip: padding-box;\n" +
            "    /* !important?? */\n" +
            "    border: solid 5px transparent;\n" +
            "    border-radius: 1em;\n" +
            "    margin-top:2rem; \n" +
            "  }\n" +
            "\n" +
            "\n" +
            ".container{\n" +
            "    height:30vh;\n" +
            "    width:70%;\n" +
            "    margin: 4rem auto;\n" +
            "    display:flex;\n" +
            "    justify-content: center;\n" +
            "    align-items:center;\n" +
            "    background: rgba(107, 75, 161, 0.04);\n" +
            "    box-shadow: 0 4px 30px rgb(0 0 0 / 10%);\n" +
            "    backdrop-filter: blur(3.1px);\n" +
            "    border-radius: 15px;\n" +
            "}\n" +
            "\n" +
            "h2{\n" +
            "    font-size: 1.6rem;\n" +
            "    border-bottom:  3px solid #2EE59D;\n" +
            "}\n" +
            "\n" +
            "h2.not{\n" +
            "    border-bottom:  3px solid #e52eae;\n" +
            "}\n" +
            "    </style>");
            out.println("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css\"/>");
            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 class=\"gradient-box \">Servlet ModificationMarque at</h1>");
            out.println("<div class=\"container \">");
            if (modified) {
                out.println("<h2 class=\"animate__animated animate__backInDown\">La marque est modifi?? avec succes ???</h2>");
                
            } else {
                out.println("<h2 class=\"not animate__animated animate__backInDown\">Probleme de modification de marque ???</h2>");
            }
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
            
        }
    }
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
