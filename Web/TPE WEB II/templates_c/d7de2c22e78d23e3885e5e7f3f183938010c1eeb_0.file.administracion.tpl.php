<?php
/* Smarty version 3.1.34-dev-7, created on 2020-12-03 02:10:44
  from 'C:\xampp\htdocs\TPE-WEB\templates\administracion.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_5fc83b140cc1e2_18766847',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    'd7de2c22e78d23e3885e5e7f3f183938010c1eeb' => 
    array (
      0 => 'C:\\xampp\\htdocs\\TPE-WEB\\templates\\administracion.tpl',
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
function content_5fc83b140cc1e2_18766847 (Smarty_Internal_Template $_smarty_tpl) {
?><!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi Viandita! - Administracion</title>
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/viandas.css">
    <link rel="stylesheet" href="./css/administracion.css">
    <link rel="stylesheet" href="./css/responsive/responsive.css">
    <link rel="stylesheet" href="./css/responsive/responsive-viandas.css">
    <?php echo '<script'; ?>
 type="text/javascript" src="./js/nav.js"><?php echo '</script'; ?>
>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <base href="<?php echo $_smarty_tpl->tpl_vars['base_url']->value;?>
">
</head>
<body>

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


    <div class="administrar">
        
        <h2 class="tituloAdministracion">ADMINISTRACIÓN</h2>
        
        <a href="administracion/usuarios" class="usuarios">USUARIOS</a>

        <a href="administracion/viandas" class="viandas">VIANDAS</a>

        <a href='administracion/categorias' class="categorias"> CATEGORIAS </a>

    </div>

    <section class="section-consultas">
        <h3 class="user"><?php echo $_SESSION['user'];?>
</h3>
        <a class="botonLogueo" href="logout"> Desloguearse <img src="./images/user.png" alt="user.img" class="imagenConsultas"></a>
        <a class="botonAdministrar" href="viandas"> Volver a viandas</a>
    </section>

 <!-- FOOTER -->

    <?php $_smarty_tpl->_subTemplateRender("file:footer.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>

</body>
</html><?php }
}
