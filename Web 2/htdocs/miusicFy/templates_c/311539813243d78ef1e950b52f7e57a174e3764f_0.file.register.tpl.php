<?php
/* Smarty version 3.1.34-dev-7, created on 2021-02-09 20:31:38
  from 'C:\xampp\htdocs\miusicFy\templates\register.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_6022e31abcc1f2_95569087',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '311539813243d78ef1e950b52f7e57a174e3764f' => 
    array (
      0 => 'C:\\xampp\\htdocs\\miusicFy\\templates\\register.tpl',
      1 => 1612898987,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_6022e31abcc1f2_95569087 (Smarty_Internal_Template $_smarty_tpl) {
?><!DOCTYPE html>
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
            <p id="mensaje"><?php echo $_smarty_tpl->tpl_vars['message']->value;?>
</p>
            <button class="btnRegister">Registrarte</button>
        </form>
    </div>
    
</body>
</html><?php }
}
