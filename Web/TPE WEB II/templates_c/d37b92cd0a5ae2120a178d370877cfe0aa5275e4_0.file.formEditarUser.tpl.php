<?php
/* Smarty version 3.1.34-dev-7, created on 2020-12-03 02:10:47
  from 'C:\xampp\htdocs\TPE-WEB\templates\formEditarUser.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_5fc83b175ebc31_69925896',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    'd37b92cd0a5ae2120a178d370877cfe0aa5275e4' => 
    array (
      0 => 'C:\\xampp\\htdocs\\TPE-WEB\\templates\\formEditarUser.tpl',
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
function content_5fc83b175ebc31_69925896 (Smarty_Internal_Template $_smarty_tpl) {
?><!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi Viandita! - Administracion - Editar Categoria</title>
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../css/formEditarUsuario.css">
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
            
            <h2 class="tituloFormEditar"> EDITAR PERMISOS DE ADMINISTRACIÓN</h2>

            <form class="formulario" method="post" action="actualizarPermisos/<?php echo $_smarty_tpl->tpl_vars['usuario']->value->id_user;?>
">
                
                <h4 class="usuario"> Usuario: &nbsp; <label class="email"><?php echo $_smarty_tpl->tpl_vars['usuario']->value->user;?>
</label> </h4> 
                <p>Actualmente es:&nbsp; <?php echo $_smarty_tpl->tpl_vars['usuario']->value->rol;?>
</p>           
                <h4 class="seleccionarRol"> Seleccione el nuevo rol del usuario</h4>
                
                <div class="inputs">
                    <label><input type="radio" name="rol" value="administrador" required > Administrador</label>
                    <label><input type="radio" name="rol" value="cliente" required> Cliente</label>
                </div>
                <button type="submit" id="botonEnviar">Actualizar permisos</button>

            </form>

        </section>

    </article>

        <section class="section-consultas">
            <a class="botonAdministrar" href="administracion/usuarios"> Volver a administrar</a>
        </section>

 <!-- FOOTER -->

    <?php $_smarty_tpl->_subTemplateRender("file:footer.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>

</body>
</html><?php }
}
