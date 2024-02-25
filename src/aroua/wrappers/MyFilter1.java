package aroua.wrappers;

import java.io.*;
import javax.servlet.*;
public class MyFilter1 implements Filter
{
    public void init (FilterConfig filterConfig) // Définition de la méthode init() qui initialise le filtre
    {
    }

    public void destroy () // Définition de la méthode destroy() qui détruit le filtre
    {
    }

   
    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException
    {
        response.setContentType ("text/html"); // Définition du type de contenu de la réponse comme étant du HTML
        PrintWriter out = response.getWriter ();  // Récupération du flux de sortie de la ServletResponse et création d'un objet PrintWriter pour écrire la réponse
        out.println("<b> <i>Filtering request and passing it to Wrapper class</i> </b> <br/>"); // Écriture d'un message dans la réponse

     // Appel du constructeur de la classe RequestWrapper1 pour envelopper la ServletRequest 
        RequestWrapper1 requestWrapper = new RequestWrapper1 (request);

        // Cette méthode appelle le prochain filtre dans la chaîne, ou la ressource finale (comme une servlet) si aucun filtre suivant n'est disponible.
        chain.doFilter (requestWrapper, response);
    }
}