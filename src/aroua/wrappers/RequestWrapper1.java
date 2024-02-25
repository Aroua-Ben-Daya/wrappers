package aroua.wrappers;

import javax.servlet.*;
public class RequestWrapper1 extends ServletRequestWrapper
{
    public RequestWrapper1 (ServletRequest req)
    {
    	// Appel du constructeur de la classe mère ServletRequestWrapper avec la ServletRequest
        super (req);
    }

    public String getParameter (String str) // Définition de la méthode getParameter() qui remplace la méthode du même nom de la classe mère ServletRequestWrapper
    {
        //Calling the superclass method i.e. ServletRequest's getParameter(String) method.
        String name = super.getParameter (str);
     // Vérification si le paramètre est vide
        if (name.equals (""))
        {  // Si le paramètre est vide, affecte un message d'erreur
         name = "Please, enter your name in the form";
        }
        // Renvoie le paramètre (modifié ou non)
        return name;
    }
}