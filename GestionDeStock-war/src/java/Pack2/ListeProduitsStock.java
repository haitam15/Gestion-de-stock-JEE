/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack2;

import Pack1.ElementDeStock;
import Pack1.ListeDeStock;
import Pack1.Stock;
import Pack1.StockFacade;
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
public class ListeProduitsStock extends HttpServlet {

    @EJB
    private StockFacade stockFacade;
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
            out.println("<title>Servlet ListeProduitsStock</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ListeProduitsStock at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String nomStock = request.getParameter("nomStock");
            ListeDeStock listeDeStock = stockFacade.listeProduitsStock(nomStock);
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"en\">");
            out.println("");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<title>Liste Produits Stock</title>");
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
            out.println("section{");
            out.println("margin: 1rem auto;");
            out.println("width : 40%;");
            out.println("");
            out.println("display: flex;");
            out.println("justify-content: center;");
            out.println("align-items: center;");
            out.println("}");
            out.println("");
            out.println("");
            out.println("input[type=\"submit\"]{");
            out.println("padding: .3rem 1.2rem;");
            out.println("border-radius: 2.5rem;");
            out.println("cursor: pointer;");
            out.println("transition: all 0.3s ease 0s;");
            out.println("");
            out.println("font-weight: bold;");
            out.println("}");
            out.println("input[type=\"submit\"]:hover{");
            out.println("background : #dd5;");
            out.println("transform: translateY(-2px);");
            out.println("color:#46637f;");
            out.println("}");
            out.println("");
            out.println(".del{");
            out.println("background-color:#f71955;");
            out.println("border : none;");
            out.println("color:#eee;");
            out.println("margin-top : 5px;");
            out.println("margin-left: 5%;");
            out.println("}");
            out.println("");
            out.println(".modifier{");
            out.println("background-color:#0cb5e2;");
            out.println("color: #eee;");
            out.println("border : none;");
            out.println("margin-bottom: 5px;");
            out.println("}");
            out.println("table{");
            out.println("width : 100%;");
            out.println("height: 100%;");
            out.println("}");
            out.println("");
            out.println(".rwd-table {");
            out.println("margin: 1em 0;");
            out.println("min-width: 300px;");
            out.println("}");
            out.println(".rwd-table tr {");
            out.println("border-top: 1px solid #ddd;");
            out.println("border-bottom: 1px solid #ddd;");
            out.println("}");
            out.println(".rwd-table th {");
            out.println("display: none;");
            out.println("}");
            out.println(".rwd-table td {");
            out.println("display: block;");
            out.println("}");
            out.println(".rwd-table td:first-child {");
            out.println("padding-top: 0.5em;");
            out.println("}");
            out.println(".rwd-table td:last-child {");
            out.println("padding-bottom: 0.5em;");
            out.println("}");
            out.println(".rwd-table td:before {");
            out.println("content: attr(data-th) \": \";");
            out.println("font-weight: bold;");
            out.println("width: 6.5em;");
            out.println("display: inline-block;");
            out.println("}");
            out.println("@media (min-width: 480px) {");
            out.println(".rwd-table td:before {");
            out.println("display: none;");
            out.println("}");
            out.println("}");
            out.println(".rwd-table th,");
            out.println(".rwd-table td {");
            out.println("text-align: center;");
            out.println("}");
            out.println("@media (min-width: 480px) {");
            out.println(".rwd-table th,");
            out.println(".rwd-table td {");
            out.println("display: table-cell;");
            out.println("padding: 0.25em 0.5em;");
            out.println("}");
            out.println(".rwd-table th:first-child,");
            out.println(".rwd-table td:first-child {");
            out.println("padding-left: 0;");
            out.println("}");
            out.println(".rwd-table th:last-child,");
            out.println(".rwd-table td:last-child {");
            out.println("padding-right: 0;");
            out.println("}");
            out.println("}");
            out.println("");
            out.println(".rwd-table {");
            out.println("background: #6b4ba199;");
            out.println("box-shadow: 5px 6px 20px #06283D;");
            out.println("color: #fff;");
            out.println("border-radius: 0.4em;");
            out.println("overflow: hidden;");
            out.println("}");
            out.println(".rwd-table tr {");
            out.println("border-color: #46637f;");
            out.println("}");
            out.println(".rwd-table th,");
            out.println(".rwd-table td {");
            out.println("margin: 0.5em 1em;");
            out.println("}");
            out.println("@media (min-width: 480px) {");
            out.println(".rwd-table th,");
            out.println(".rwd-table td {");
            out.println("padding: 1em !important;");
            out.println("}");
            out.println("}");
            out.println(".rwd-table th,");
            out.println(".rwd-table td:before {");
            out.println("color: #eee;");
            out.println("}");
            out.println("");
            out.println("th.hed{");
            out.println("padding-right: 19%;");
            out.println("}");
            out.println("</style>");
            out.println("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css\" />");
            out.println("</head>");
            out.println("");
            out.println("<body>");
            out.println("<h1 class=\"gradient-box\">Servlet Liste Produits Stock</h1>");
            out.println("<section>");
            out.println("<table class=\"rwd-table animate__animated animate__backInUp \">");
            out.println("<tr>");
            out.println("<th> Reference du produit :</th>");
            out.println("<th>Quantite de produit :</th>");
            out.println("<th class=\"hed\">Action</th>");
            out.println("</tr>");
            if(listeDeStock!=null) {
                for(ElementDeStock e : listeDeStock.getListeDeStock()) {
                    out.println("<tr>");
                    out.println("<td>" + e.getRefProduit().getReferenceProduit() + "</td>");
                    out.println("<td>" + e.getQuantite() + "</td>");
                    out.println("<td class=\"action\">");
                    out.println("<form action=\"ModifierQuantite\" method=\"GET\">");
                    out.println("<input type=\"text\" name=\"nomStock\" value=\"" + nomStock + "\" hidden/>");
                    out.println("<input type=\"text\" name=\"referenceProduit\" value=\"" + e.getRefProduit().getReferenceProduit() + "\" hidden/>");
                    out.println("<input type=\"text\" name=\"quantite\" value=\"" + e.getQuantite() + "\" hidden/>");
                    out.println("<input class=\"modifier\" type=\"submit\" value=\"Modifier la quantité\" />");
                    out.println("</form>");
                    out.println("</td>");
                    out.println("</tr>");
                }
            }
            out.println("</table>");
            out.println("</section>");
            out.println("</body>");
            out.println("");
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
        processRequest(request, response);
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
