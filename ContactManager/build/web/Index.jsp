<%-- 
    Document   : Index
    Created on : 27 mars 2020, 14:44:44
    Author     : c
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enregistrer un contact</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous"/>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </head>
    <body>

        <div class="container">
            <h2 class="text-center">Enregistrer un contact</h2>
            <div>
                <form action="ContactServlet" method="post">
                    <div class="form-group">
                        <label for="firstname">Prénom *</label>
                        <input type="text" class="form-control" placeholder="Veuillez entrer votre prénom" id="fistname" name="fistname">
                    </div>
                    <div class="form-group">
                        <label for="lastname">Nom *</label>
                        <input type="text" class="form-control" placeholder="Veuillez entrer votre nom" id="lastname" name="lastname">
                    </div>
                     <div class="form-group">
                        <label for="firstname">Numéro *</label>
                        <input type="text" class="form-control" placeholder="Veuillez entrer votre prénom" id="phone" name="phone">
                    </div>
                    <div class="form-group">
                        <label for="lastname">Email</label>
                        <input type="text" class="form-control" placeholder="Veuillez entrer votre nom" id="email" name="email">
                    </div>
                     <div class="form-group">
                        <label for="firstname">Adresse</label>
                        <input type="text" class="form-control" placeholder="Veuillez entrer votre prénom" id="address" name="address">
                    </div>
            
                    <button type="submit" class="btn btn-primary">Enregistrer</button>
                </form>
            </div>
        </div>

    </body>
</html>
