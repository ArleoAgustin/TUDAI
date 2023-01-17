<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/register.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Francois+One&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Sriracha&display=swap" rel="stylesheet">
    <title>Registrarte - MiusicFy</title>
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
            <p>Regístrate gratis para escuchar</p>
        </div>

        <form action="agregarUser" method="post">

            <div class="grupo">
                <label>¿Cuál es tu correo electrónico?</label>
                <input required type="email" required id="inputEmail">
            </div>

            <div class="grupo">
                <label>Confirma el correo electrónico</label>
                <input required type="email" name="email" required id="inputEmail">
            </div>

            <div class="grupo">
                <label>Crea una contraseña</label>
                <input required type="password" name="password" id="inputPassword">
            </div>

            <div class="grupo">
                <label>¿Cómo quieres que te llamemos?</label>
                <input required type="text" name="alias" id="inputNombre">
            </div>

            <div id="inputSexo" class="grupo">
                <label><input required type="radio" name="sexo" id="inputRadio" value="hombre">Hombre</label>
                <label><input required type="radio" name="sexo" id="inputRadio" value="mujer">Mujer</label>
                <label><input required type="radio" name="sexo" id="inputRadio" value="no binario">No binario</label>
            </div>
            <p id="mensaje">{$message}</p>
            <button class="btnRegister">Registrarte</button>
        </form>
    </div>
    
</body>
</html>