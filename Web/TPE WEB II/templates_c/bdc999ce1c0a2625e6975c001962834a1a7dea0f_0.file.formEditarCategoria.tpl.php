<?php
/* Smarty version 3.1.34-dev-7, created on 2020-12-03 03:05:06
  from 'C:\xampp\htdocs\TPE-WEB\templates\formEditarCategoria.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_5fc847d21a0f77_52838628',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    'bdc999ce1c0a2625e6975c001962834a1a7dea0f' => 
    array (
      0 => 'C:\\xampp\\htdocs\\TPE-WEB\\templates\\formEditarCategoria.tpl',
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
function content_5fc847d21a0f77_52838628 (Smarty_Internal_Template $_smarty_tpl) {
?><!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi Viandita! - Administracion - Editar Categoria</title>
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../css/consultas.css">
    <link rel="stylesheet" href="../css/responsive/responsive.css">
    <link rel="stylesheet" href="../css/responsive/responsive-consultas.css">
    <?php echo '<script'; ?>
 type="text/javascript" src="../js/nav.js"><?php echo '</script'; ?>
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

            <?php
$_from = $_smarty_tpl->smarty->ext->_foreach->init($_smarty_tpl, $_smarty_tpl->tpl_vars['tipo']->value, 'tipoAnterior');
$_smarty_tpl->tpl_vars['tipoAnterior']->do_else = true;
if ($_from !== null) foreach ($_from as $_smarty_tpl->tpl_vars['tipoAnterior']->value) {
$_smarty_tpl->tpl_vars['tipoAnterior']->do_else = false;
?>                
            <form class="formulario" method="post" action="actualizarCategoria/<?php echo $_smarty_tpl->tpl_vars['tipoAnterior']->value->id_dirigidoA;?>
">
                <h1 class="subtitulo"> EDITA LA CATEGORIA:  <?php echo $_smarty_tpl->tpl_vars['tipoAnterior']->value->tipo_vianda;?>
</h1>
                <label class="itemformulario"> Nombre: </label> <input type="text" name="nombre" placeholder="Anteriormente era: <?php echo $_smarty_tpl->tpl_vars['tipoAnterior']->value->tipo_vianda;?>
">
            <?php
}
$_smarty_tpl->smarty->ext->_foreach->restore($_smarty_tpl, 1);?>

                <button type="submit" id="botonEnviar">Actualizar!</button>

            </form>

        </section>

    </article>

        <section class="section-consultas">
            <a class="botonAdministrar" href="administracion/categorias"> Volver a administrar</a>
        </section>

 <!-- FOOTER -->

    <?php $_smarty_tpl->_subTemplateRender("file:footer.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>

</body>
</html><?php }
}
