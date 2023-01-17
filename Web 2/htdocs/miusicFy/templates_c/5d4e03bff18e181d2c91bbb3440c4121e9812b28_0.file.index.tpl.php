<?php
/* Smarty version 3.1.34-dev-7, created on 2021-02-03 21:09:27
  from 'C:\xampp\htdocs\miusicFy\templates\index.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_601b02f7c10da5_12013960',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '5d4e03bff18e181d2c91bbb3440c4121e9812b28' => 
    array (
      0 => 'C:\\xampp\\htdocs\\miusicFy\\templates\\index.tpl',
      1 => 1612382905,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_601b02f7c10da5_12013960 (Smarty_Internal_Template $_smarty_tpl) {
?><!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/index.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Francois+One&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    <?php echo '<script'; ?>
 src="./js/main.js"><?php echo '</script'; ?>
>
    <title>MiusicFy</title>
</head>
<body>

    <div class="container">
        
        <header>
            <div id="encabezado">

                <div class="title">
                    <a href="miusicfy"><img class="iconMiusicFy" src="./images/miusicfy.png" alt="miusicfy"></a>
                    <a id="title" href="miusicfy"><h1>MIUSICFY</h1></a>
                </div>
                
                <nav>

                    <a href="register">Regístrate</a>
                    <a href="login">Iniciar sesión</a>
                </nav>
                
            </div>
        </header>

        <article>

            <div class="contH2">
                <h2>Escuchar es todo</h2>
            

            
                <p>Millones de canciones y podcasts. No necesitas tarjeta de crédito.</p>
           
            </div>
            <div>
                <a href="register"><button>obtén miusicfy free</button></a>
            </div>
        </article>

        <footer>
                <div>
                    <img src="./images/instagram.png" class="iconInstagram">
                    <img src="./images/twitter.png" class="iconTwitter">
                    <img src="./images/facebook.png" class="iconFacebook">
                </div>
                <div id="copyright">Copyright&copy; 2021 - Todos los derechos reservados.</div>
                <div class="pais">
                    <p id="pPais">Argentina</p>
                    <img id="imgPais" src="./images/argentina.png" alt="">
                </div>
        </footer>

    </div>
</body>
</html><?php }
}
