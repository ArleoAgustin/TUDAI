<?php
/* Smarty version 3.1.34-dev-7, created on 2020-12-03 02:12:15
  from 'C:\xampp\htdocs\TPE-WEB\templates\register.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_5fc83b6f2d35b4_13882379',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '0d449fc256a4d57da00aacd0aec1e5892e31916a' => 
    array (
      0 => 'C:\\xampp\\htdocs\\TPE-WEB\\templates\\register.tpl',
      1 => 1606957373,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
    'file:encabezado.tpl' => 1,
    'file:nav.tpl' => 1,
    'file:navUser.tpl' => 1,
    'file:footer.tpl' => 1,
  ),
),false)) {
function content_5fc83b6f2d35b4_13882379 (Smarty_Internal_Template $_smarty_tpl) {
?><!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi Viandita! - Log in</title>
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/consultas.css">
    <link rel="stylesheet" href="./css/responsive/responsive.css">
    <link rel="stylesheet" href="./css/responsive/responsive-consultas.css">
    <link rel="stylesheet" href="./css/log.css">
    <?php echo '<script'; ?>
 type="text/javascript" src="./js/nav.js"><?php echo '</script'; ?>
>
    <base href="<?php echo $_smarty_tpl->tpl_vars['base_url']->value;?>
">
</head>

<body>

 <!-- ENCABEZADO -->
    
    <?php $_smarty_tpl->_subTemplateRender("file:encabezado.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>

 <!-- MENU DE NAVEGACION -->

            <?php if ((!(isset($_SESSION['user'])))) {?> <!--CON ESTO SE VERIFICA QUE NO HAYA UN USUARIO LOGUEADO-->

             <?php $_smarty_tpl->_subTemplateRender("file:nav.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>
        
            <?php } else { ?>
                <?php $_smarty_tpl->_subTemplateRender("file:navUser.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>
        <?php }?>
    
 <!-- FORMULARIO -->

    <article>

        <section class="contenedorform">

            <form class="formulario" action="agregarUser" method="post">

                <h1 class="subtitulo"> Registrate! <img src="./images/user.png" alt="user" id="userFormulario"></h1>
                
                <label class="itemformulario"> Usuario: </label> <input required type="text" id="correo" name="user">
                <label class="itemformulario"> Contrase??a: </label> <input required type="password" id="contra" name="pass">
                <a href="login" id="register">Ya tienes una cuenta? Logueate aca!</a>
                <p id="avisoCaptcha" class="mensajeIncorrecto"><?php echo $_smarty_tpl->tpl_vars['mensaje']->value;?>
</p>
                <button type="submit" id="botonEnviar" >REGISTRARSE</button>

            </form>

        </section>

    </article>

 <!-- FOOTER -->

    <?php $_smarty_tpl->_subTemplateRender("file:footer.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>

</body>
</html><?php }
}
