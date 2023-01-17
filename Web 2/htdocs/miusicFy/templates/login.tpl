<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/login.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Francois+One&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Sriracha&display=swap" rel="stylesheet">
    <title>Iniciar sesión - MiusicFy</title>
</head>
<body>
    <div class="container">
        
        <div class="miusicFy">
            <div class="iconTitulo">
                <a href="miusicfy"><img class="iconMiusicFy" src="./images/miusicfy.png" alt="miusicfy"></a>
                <a href="miusicfy"><h2>MiusicFy</h2></a>
            </div>
            
        </div>

        <div class="textoDescriptivo">
            <p>Para continuar, inicia sesión en MiusicFy.</p>
        </div>

        <form action="login" method="post">

            <div class="grupo">
                <label>Dirección de correo o nombre de usuario</label>
                <input type="email" name="email" required id="inputEmail">
            </div>

            <div class="grupo">
                <label>Contraseña</label>
                <input type="password" name="password" id="inputPassword">
            </div>


            <a class="btnLogin" href="login"><button">INICIAR SESION</button></a>
        </form>
    </div>
    
</body>
</html>