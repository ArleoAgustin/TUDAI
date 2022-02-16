<?php
/* Smarty version 3.1.34-dev-7, created on 2020-12-03 21:55:58
  from 'C:\xampp\htdocs\TPE-WEB\templates\descripcionVianda.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_5fc950de116e81_77429303',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '2347a91d4dc0dbd5e94127595f2f82980a3932a9' => 
    array (
      0 => 'C:\\xampp\\htdocs\\TPE-WEB\\templates\\descripcionVianda.tpl',
      1 => 1607028956,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
    'file:encabezado.tpl' => 1,
    'file:nav.tpl' => 1,
    'file:navUser.tpl' => 1,
    'file:calificacionDeVianda.tpl' => 1,
    'file:botonLogin.tpl' => 1,
    'file:footer.tpl' => 1,
  ),
),false)) {
function content_5fc950de116e81_77429303 (Smarty_Internal_Template $_smarty_tpl) {
?><!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi Viandita! - <?php echo $_smarty_tpl->tpl_vars['vianda']->value->nombre;?>
</title>
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../css/responsive/responsive.css">
    <link rel="stylesheet" href="../css/descripcionVianda.css">
    <link href="https://fonts.googleapis.com/css2?family=Archivo+Narrow:ital,wght@1,500&display=swap" rel="stylesheet">
    <?php echo '<script'; ?>
 src="../js/comments.js"><?php echo '</script'; ?>
>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
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
    
    <div class="contenedorVianda">
        
        <h2 data-id="<?php echo $_smarty_tpl->tpl_vars['vianda']->value->id_vianda;?>
" class="plato"><?php echo $_smarty_tpl->tpl_vars['vianda']->value->nombre;?>
</h2>
        
        <div class="imagenViandaContenedor">
            
            <?php if (($_smarty_tpl->tpl_vars['imagen']->value != '')) {?>  <!-- SI LA IMAGEN EXISTE -->
                
                <img src="data:image/jpg; base64,<?php echo $_smarty_tpl->tpl_vars['imagen']->value;?>
" class="fotoComida">

                <?php if (((isset($_SESSION['user'])) && $_SESSION['ROL'] == "administrador")) {?> <!-- Si esta logueado y es administrador se ve el boton borran-->
                 
                 <!-- BOTON BORRAR IMAGEN -->
                    <a href= 'eliminarImagenVianda/<?php echo $_smarty_tpl->tpl_vars['vianda']->value->id_vianda;?>
'>
                    <i class='botonBorrar material-icons' id='borrarImagenVianda<?php echo $_smarty_tpl->tpl_vars['vianda']->value->id_vianda;?>
' style='font-size:36px'>delete</i></a>
                
                <?php }?>

            <?php }?>

        </div>
        
        <div class="descripcionViandas">

            <p class="descripcion"><?php echo $_smarty_tpl->tpl_vars['vianda']->value->descripcion;?>
</p>
            <p class="categoria">Categoria:&nbsp;<?php echo $_smarty_tpl->tpl_vars['vianda']->value->tipo_vianda;?>
</p>
            <h3 class="precio">$<?php echo $_smarty_tpl->tpl_vars['vianda']->value->precio;?>
</h3>

        </div>

        <div class="contenedorCalificacion">

            <?php if (((isset($_SESSION['user'])))) {?>

                    <?php $_smarty_tpl->_subTemplateRender("file:calificacionDeVianda.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>
            
            <?php }?>

            <div class= "error"></div> <!--SI NO HAY COMENTARIOS APARECE UN TEXTO ACA-->

            <div class="contenedorComentarios">
                
                <h3 class="tituloComentarios">Comentarios</h3>

                <div class="comentarios">

                <?php if (((isset($_SESSION['user'])) && $_SESSION['ROL'] == "administrador")) {?> <!-- Si esta logueado y es administrador se ve el boton borrar-->
                    
                    <ul class="listaComentariosVIP">    <!--PARA ADIMINISTRADORES-->
                    </ul>

                 <?php } else { ?>

                    <ul class="listaComentarios">   <!--PARA CLIENTES Y VISITANTES-->
                    </ul>

                <?php }?>
                
            </div>

        </div>

    </div>
    
    <div class="contenedorVolver">

            <a href="categoria/<?php echo $_smarty_tpl->tpl_vars['vianda']->value->tipo_vianda;?>
" class="volver">Volver</a>

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
