<?php
/* Smarty version 3.1.34-dev-7, created on 2020-12-03 02:44:58
  from 'C:\xampp\htdocs\TPE-WEB\templates\sobre.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_5fc8431ab7fcb8_96404852',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '67d4630a1ed79ef33d7a0a5f25836523e3dcd951' => 
    array (
      0 => 'C:\\xampp\\htdocs\\TPE-WEB\\templates\\sobre.tpl',
      1 => 1606957373,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
    'file:encabezado.tpl' => 1,
    'file:nav.tpl' => 1,
    'file:navUser.tpl' => 1,
    'file:botonLogin.tpl' => 1,
    'file:footer.tpl' => 1,
  ),
),false)) {
function content_5fc8431ab7fcb8_96404852 (Smarty_Internal_Template $_smarty_tpl) {
?><!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi Viandita! - Sobre nosotros</title>
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/sobre.css">
    <link rel="stylesheet" href="./css/responsive/responsive.css">
    <link rel="stylesheet" href="./css/responsive/responsive-sobre.css">
    <?php echo '<script'; ?>
 type="text/javascript" src="./js/nav.js"><?php echo '</script'; ?>
>
    <base href="<?php echo $_smarty_tpl->tpl_vars['base_url']->value;?>
">
</head>

<body class="contacto">

 <!-- ENCABEZADO -->

    <?php $_smarty_tpl->_subTemplateRender("file:encabezado.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>

 <!-- MENU -->

            <?php if ((!(isset($_SESSION['user'])))) {?> <!--CON ESTO SE VERIFICA QUE NO HAYA UN USUARIO LOGUEADO-->

             <?php $_smarty_tpl->_subTemplateRender("file:nav.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>
        
            <?php } else { ?>
                <?php $_smarty_tpl->_subTemplateRender("file:navUser.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>
        <?php }?>

 <!-- CUERPO DE PAGINA -->

    <article>
        <section class="descripcion">

            <div class="contenedor-imagen">
                <img src="./images/LOGO.png" alt="Mi viandita" class="logo">
            </div>

            <p class="informacion">Mi viandita es un emprendimiento realizado por la chef profesional  Virginia Ghersetti, comenzado en 2013 y con toda una trayectoria enfocada
                a las viandas light. Contamos con una sala de elaboracion hablitada y con un plan de descenso de peso. Dentro de la pagina se tiene toda la
                informaci??n requerida para contactar a Mi Viandita por cualquiera de sus redes. Contamos con envios a toda la ciudad de Tandil. Y Este 2020
                estamos mas renovados que nunca con esta pagina web realizada por Agustin Arleo y Fermin Medina. Cualquier consulta que tengan pueden realizarla
                presionando el boton de "consultas".
            </p>

        </section>
    
    </article>

 <!-- BOTON CONSULTAS Y LOGIN -->

    <?php $_smarty_tpl->_subTemplateRender("file:botonLogin.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>
    
 <!-- FOOTER -->

    <?php $_smarty_tpl->_subTemplateRender("file:footer.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>
    
</body>
</html><?php }
}
