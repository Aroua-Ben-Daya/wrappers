<html>
    <head>
        <title>ServletRequest Wrapper Demo</title> <!-- Titre de la page HTML -->
    </head>

    <body>
        <b> Please enter your name : ? </b>  <!-- Balise HTML pour afficher un texte -->
        <br />
        <br />
        <br />

		<!-- Balise HTML pour définir le début d'un formulaire, l'action spécifie le servlet vers lequel les données du formulaire seront envoyées -->
        <form action="MyServ">
            Name : <input type="text" name="username" /> City : <input type="text" name="cityname" />
            <input type="submit" name="submit" />
        </form>
    </body>
</html>