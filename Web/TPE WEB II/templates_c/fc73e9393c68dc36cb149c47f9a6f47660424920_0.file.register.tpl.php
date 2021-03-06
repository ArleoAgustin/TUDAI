<?php
/* Smarty version 3.1.34-dev-7, created on 2020-10-08 03:18:53
  from 'C:\xampp\htdocs\TPE-WEB-II\templates\register.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_5f7e68fd8e6e09_98885221',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    'fc73e9393c68dc36cb149c47f9a6f47660424920' => 
    array (
      0 => 'C:\\xampp\\htdocs\\TPE-WEB-II\\templates\\register.tpl',
      1 => 1602119931,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
    'file:encabezado.tpl' => 1,
    'file:nav.tpl' => 1,
    'file:footer.tpl' => 1,
  ),
),false)) {
function content_5f7e68fd8e6e09_98885221 (Smarty_Internal_Template $_smarty_tpl) {
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

    <?php $_smarty_tpl->_subTemplateRender("file:nav.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>
    
 <!-- FORMULARIO -->

    <article>

        <section class="contenedorform">

            <form class="formulario" action="agregarUser" method="post">

                <h1 class="subtitulo"> Registrate! <img src="./images/user.png" alt="user" id="userFormulario"></h1>
                
                <label class="itemformulario"> Correo: </label> <input type="email" id="correo" name="email">
                <label class="itemformulario"> Contrase??a: </label> <input type="password" id="contra" name="pass">
                <label class="itemformulario"> Seleccione el rol </label>
                <select name="rol" id="select">
                    <option value="administrador">Administrador</option>
                    <option value="cliente">Cliente</option>
                </select>
            <!--    <label class="itemformulario"> Repite la contrase??a: </label> <input type="password" id="contra" name="email">-->
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
