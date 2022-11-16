/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack2;

import Pack1.Marque;
import Pack1.MarqueFacade;
import Pack1.Produit;
import Pack1.ProduitFacade;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author haitam
 */
public class ListProduits extends HttpServlet {

    @EJB
    private ProduitFacade produitFacade;
    
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String nomMarque = request.getParameter("nomMarque");
            List<Produit> listeProduits;
            if(nomMarque==null || nomMarque.equals("all"))
                listeProduits = produitFacade.listeProduits();
            else
                listeProduits = marqueFacade.ListeProduitsMarque(nomMarque);
            List<Marque> listeMarques = marqueFacade.listeMarques();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<title>Liste de Produits</title>");
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
            out.println("/* !importanté */");
            out.println("background-clip: padding-box;");
            out.println("/* !importanté */");
            out.println("border: solid 5px transparent;");
            out.println("border-radius: 1em;");
            out.println("margin-top:2rem;");
            out.println("margin-bottom: 3rem;");
            out.println("}");
            out.println("");
            out.println("");
            out.println("h1{");
            out.println("height:10vh;");
            out.println("text-align: center;");
            out.println("}");
            out.println("");
            out.println(".form{");
            out.println("margin: 1rem auto;");
            out.println("font-size: 1rem;");
            out.println("height:fit-content;");
            out.println("width: fit-content;");
            out.println("border-radius: 10px;");
            out.println("padding : .5rem;");
            out.println("border : 2px solid #06283D;");
            out.println("}");
            out.println("");
            out.println("");
            out.println("table{");
            out.println("width:100%;");
            out.println("table-layout: fixed;");
            out.println("}");
            out.println(".tbl-header{");
            out.println("background-color: rgba(255,255,255,0.3);");
            out.println("}");
            out.println(".tbl-content{");
            out.println("height:300px;");
            out.println("overflow-x:auto;");
            out.println("margin-top: 0px;");
            out.println("border: 1px solid rgba(255,255,255,0.3);");
            out.println("}");
            out.println("th{");
            out.println("padding: 20px 15px;");
            out.println("text-align: left;");
            out.println("font-weight: bold;");
            out.println("font-size: 12px;");
            out.println("color: #fff;");
            out.println("text-transform: uppercase;");
            out.println("");
            out.println("}");
            out.println("td{");
            out.println("padding: 15px;");
            out.println("text-align: left;");
            out.println("vertical-align:middle;");
            out.println("font-weight: 300;");
            out.println("font-size: 12px;");
            out.println("color: #fff;");
            out.println("border-bottom: solid 1px rgba(255,255,255,0.1);");
            out.println("}");
            out.println("");
            out.println("td:last-child{");
            out.println("text-align: center;");
            out.println("}");
            out.println("");
            out.println("section{");
            out.println("margin: 2rem;");
            out.println("}");
            out.println("");
            out.println("");
            out.println(".action{");
            out.println("display:flex;");
            out.println("flex-direction:column;");
            out.println("}");
            out.println("");
            out.println("input[type=\"submit\"]{");
            out.println("padding: .3rem 1.2rem;");
            out.println("border-radius: 2.5rem;");
            out.println("}");
            out.println("");
            out.println("select{");
            out.println("background-color: #DFBB9D;");
            out.println("border-radius: 5px;");
            out.println("border: 0;");
            out.println("color: #06283D;");
            out.println("font-size: 14px;");
            out.println("font-weight: bold;");
            out.println("outline: 0;");
            out.println("");
            out.println("}");
            out.println("");
            out.println(".del{");
            out.println("background-color:#f71955;");
            out.println("border : none;");
            out.println("color:#eee;");
            out.println("margin-top : 5px;");
            out.println("}");
            out.println("");
            out.println(".modifier{");
            out.println("background-color:#0cb5e2;");
            out.println("margin-right: 5px;");
            out.println("color: #eee;");
            out.println("border : none;");
            out.println("margin-bottom: 5px;");
            out.println("}");
            out.println("");
            out.println("/* for custom scrollbar for webkit browser*/");
            out.println("");
            out.println("::-webkit-scrollbar {");
            out.println("width: 6px;");
            out.println("}");
            out.println("::-webkit-scrollbar-track {");
            out.println("-webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);");
            out.println("}");
            out.println("::-webkit-scrollbar-thumb {");
            out.println("-webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);");
            out.println("}");
            out.println("");
            out.println("@media (max-width: 768px) {");
            out.println(".SideBar {");
            out.println("display: none;");
            out.println("}");
            out.println("}");
            out.println("");
            out.println("</style>");
            out.println("<link");
            out.println("rel=\"stylesheet\"");
            out.println("href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css\"");
            out.println("/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 class=\"gradient-box\">Servlet ListeProduits</h1>");
            out.println("<form class=\"form animate__animated animate__backInDown \" action=\"ListProduits\" method=\"GET\">");
            out.println("<span class=\"label\">Marque :</span>");
            out.println("<select name=\"nomMarque\">");
            out.println("<option value=\"all\">tous les marques</option>");
            for(Marque marque: listeMarques) {
                out.println("<option value=\"" + marque.getNomMarque()+ "\">" + marque.getNomMarque() + "</option>");
            }
            out.println("</select>");
            out.println("<input type=\"submit\" value=\"Lister produits\">");
            out.println("</form>");
            out.println("");
            out.println("<section class=\"animate__animated animate__backInUp\">");
            out.println("<div class=\"tbl-header \">");
            out.println("<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">");
            out.println("<thead>");
            out.println("<tr>");
            out.println("<th>Reference du Produits</th>");
            out.println("<th>Marque</th>");
            out.println("<th>Denomination</th>");
            out.println("<th>Prix</th>");
            out.println("<th>Poids</th>");
            out.println("<th>Volume</th>");
            out.println("<th>Action</th>");
            out.println("</tr>");
            out.println("</thead>");
            out.println("</table>");
            out.println("</div>");
            out.println("<div class=\"tbl-content\">");
            out.println("<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">");
            out.println("<tbody>");
            for(Produit produit : listeProduits) {
                out.println("<tr>");
                out.println("<td>" + produit.getReferenceProduit() + "</td>");
                out.println("<td>" + produit.marqueProduit.getNomMarque() + "</td>");
                out.println("<td>" + produit.getDenomination() + "</td>");
                out.println("<td>" + produit.getPrix() + "</td>");
                out.println("<td>" + produit.getPoids() + "</td>");
                out.println("<td>" + produit.getVolume() + "</td>");
                out.println("<td>");
                    out.println("<form action=\"modificationProduit\" method=\"GET\">");
                    out.println("<input name=\"referenceProduit\" value=\"" + produit.getReferenceProduit() + "\" hidden/>");
                    out.println("<input class=\"modifier\" type=\"submit\" value=\"modifier\"/>");
                    out.println("</form>");
                    out.println("<form action=\"ListProduits\" method=\"POST\">");
                    out.println("<input name=\"referenceProduit\" value=\"" + produit.getReferenceProduit() + "\" hidden/>");
                    out.println("<input class=\"del\" type=\"submit\" value=\"supprimer\"/>");
                    out.println("</form>");
                out.println("</td>");
                out.println("</tr>");
            }
            out.println("</tbody>");
            out.println("</table>");
            out.println("</div>");
            out.println("</section>");
            out.println("");
            out.println("</body>");
            out.println("</html>");
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
            String referenceProduit = request.getParameter("referenceProduit");
            Produit produit = produitFacade.find(referenceProduit);
            marqueFacade.supprimerProduitMarque(produit);
            boolean deleted = produitFacade.supprimer(produit);
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SuppressionProduit</title>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<title>Document</title>");
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
            "    /* !importanté */\n" +
            "    background-clip: padding-box;\n" +
            "    /* !importanté */\n" +
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
            out.println("<h1 class=\"gradient-box \">Servlet SuppressionProduit at</h1>");
            out.println("<div class=\"container \">");
            if (deleted) {
                out.println("<h2 class=\"animate__animated animate__backInDown\">Le produit est supprimé avec succes ✔</h2>");
                
            } else {
                out.println("<h2 class=\"not animate__animated animate__backInDown\">Probleme de suppression de produit ❌</h2>");
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
