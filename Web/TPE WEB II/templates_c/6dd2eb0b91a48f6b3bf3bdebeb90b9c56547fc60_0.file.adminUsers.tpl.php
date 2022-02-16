<?php
/* Smarty version 3.1.34-dev-7, created on 2020-12-03 02:10:45
  from 'C:\xampp\htdocs\TPE-WEB\templates\adminUsers.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_5fc83b1539bf53_49569575',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '6dd2eb0b91a48f6b3bf3bdebeb90b9c56547fc60' => 
    array (
      0 => 'C:\\xampp\\htdocs\\TPE-WEB\\templates\\adminUsers.tpl',
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
function content_5fc83b1539bf53_49569575 (Smarty_Internal_Template $_smarty_tpl) {
?><!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi Viandita! - Administracion</title>
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../css/viandas.css">
    <link rel="stylesheet" href="../css/adminViandas.css">
    <link rel="stylesheet" href="../css/responsive/responsive.css">
    <link rel="stylesheet" href="../css/responsive/responsive-viandas.css">
    <?php echo '<script'; ?>
 type="text/javascript" src="../js/nav.js"><?php echo '</script'; ?>
>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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



    <h2 class="tituloAdministracion">ADMINISTRAR USUARIOS</h2>
        <div class="formulario">
         <h1 class="addUserTitle">Agregar ADMIN</h1>
            <form action="agregarAdmin" method="post">
                <div class="inputsPrincipales">
                    <label class="itemformulario"> Usuario: </label> <input required type="text" id="correo" name="user">
                    <label class="itemformulario"> Contraseña: </label> <input required type="password" id="contra" name="pass">
                    
                </div>
                <button type="submit" id="botonEnviar" >REGISTRAR</button>

            </form>
        </div>
        <table>
            <thead>
                <tr>
                    <th>Usuario</th><th>Tipo de usuario</th><th>Eliminar / Editar rol</th>
                </tr>
            </thead>
            <tbody id="viandasTable">
                <?php
$_from = $_smarty_tpl->smarty->ext->_foreach->init($_smarty_tpl, $_smarty_tpl->tpl_vars['usuarios']->value, 'user');
$_smarty_tpl->tpl_vars['user']->do_else = true;
if ($_from !== null) foreach ($_from as $_smarty_tpl->tpl_vars['user']->value) {
$_smarty_tpl->tpl_vars['user']->do_else = false;
?>
                    <tr><td><?php echo $_smarty_tpl->tpl_vars['user']->value->user;?>
</td><td><?php echo $_smarty_tpl->tpl_vars['user']->value->rol;?>
</td>
                    <td class="botonBorrar"> <a href='eliminarUsuario/<?php echo $_smarty_tpl->tpl_vars['user']->value->id_user;?>
'><button class="botonBorrarTD" id="<?php echo $_smarty_tpl->tpl_vars['user']->value->id_user;?>
"><i class="fa fa-trash-o"></i></button></a>
                    <a href='editarPermisos/<?php echo $_smarty_tpl->tpl_vars['user']->value->id_user;?>
' ><button class="botonEditarTD" id="<?php echo $_smarty_tpl->tpl_vars['user']->value->id_user;?>
"><i class="fa fa-edit"></i></button></a></td></tr>
                <?php
}
$_smarty_tpl->smarty->ext->_foreach->restore($_smarty_tpl, 1);?>
            </tbody>
        </table>



<!-- BOTON CONSULTAS Y LOGIN -->

    <section class="section-consultas">
        <h3 class="user"><?php echo $_SESSION['user'];?>
</h3>
        <a class="botonLogueo" href="logout"> Desloguearse <img src="./images/user.png" alt="user.img" class="imagenConsultas"></a>
        <a class="botonAdministrar" href="administracion"> Volver a administración</a>
    </section>

 <!-- FOOTER -->

    <?php $_smarty_tpl->_subTemplateRender("file:footer.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>

</body>
</html><?php }
}
