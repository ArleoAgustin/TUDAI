<?php
/* Smarty version 3.1.34-dev-7, created on 2020-12-03 02:12:43
  from 'C:\xampp\htdocs\TPE-WEB\templates\AllViandas.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_5fc83b8be28401_59174705',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    'a0f17d72216f2609a1e1a00941379df0a458cefc' => 
    array (
      0 => 'C:\\xampp\\htdocs\\TPE-WEB\\templates\\AllViandas.tpl',
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
function content_5fc83b8be28401_59174705 (Smarty_Internal_Template $_smarty_tpl) {
?><!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi Viandita! - Todas</title>
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/responsive/responsive.css">
    <link rel="stylesheet" href="./css/responsive/responsive-allViandas.css">
    <?php echo '<script'; ?>
 type="text/javascript" src="./js/detalleVianda.js"><?php echo '</script'; ?>
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

    <h2 class="tituloAllViandas">TODAS LAS VIANDAS</h2>

    
    <div class="allViandas">
        
        <?php
$_from = $_smarty_tpl->smarty->ext->_foreach->init($_smarty_tpl, $_smarty_tpl->tpl_vars['allViandas']->value, 'vianda');
$_smarty_tpl->tpl_vars['vianda']->do_else = true;
if ($_from !== null) foreach ($_from as $_smarty_tpl->tpl_vars['vianda']->value) {
$_smarty_tpl->tpl_vars['vianda']->do_else = false;
?>
            
            <div class="contenedorVianda">
                <a href="vianda/<?php echo $_smarty_tpl->tpl_vars['vianda']->value->id_vianda;?>
" class="plato"> <?php echo $_smarty_tpl->tpl_vars['vianda']->value->nombre;?>
 </a>
            </div>

        <?php
}
$_smarty_tpl->smarty->ext->_foreach->restore($_smarty_tpl, 1);?>

    </div>

    <div class="contenedorVolver">
            <a href="viandas" class="volver" hr>Volver</a>
    </div>
    
<!-- BOTON CONSULTAS & BOTON LOGIN-->

    <?php $_smarty_tpl->_subTemplateRender("file:botonLogin.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>

<!--FOOTER-->

    <?php $_smarty_tpl->_subTemplateRender("file:footer.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>

</body>
</html><?php }
}
