<?php
/* Smarty version 3.1.34-dev-7, created on 2020-12-03 03:05:01
  from 'C:\xampp\htdocs\TPE-WEB\templates\adminCategorias.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_5fc847cd466bd3_42510750',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    'dceafd271ee30a030480fed8e42a12b1cad984c3' => 
    array (
      0 => 'C:\\xampp\\htdocs\\TPE-WEB\\templates\\adminCategorias.tpl',
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
function content_5fc847cd466bd3_42510750 (Smarty_Internal_Template $_smarty_tpl) {
?><!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi Viandita! - Administracion</title>
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../css/viandas.css">
    <link rel="stylesheet" href="../css/adminCategorias.css">
    <link rel="stylesheet" href="../css/responsive/responsive.css">
    <link rel="stylesheet" href="../css/responsive/responsive-viandas.css">
    <base href="<?php echo $_smarty_tpl->tpl_vars['base_url']->value;?>
">
    <?php echo '<script'; ?>
 type="text/javascript" src="./js/nav.js"><?php echo '</script'; ?>
>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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


    <div class="categorias">
    <h4>ADMINISTRAR CATEGORIAS</h4>

        <form action="agregarCategoria" method="post">

                <div class="categoriaNueva">
                
                    <div class="agregarCategoria">
                        <input type="text" name="tipo_vianda" id="nuevaCategoria" placeholder="Nueva categoria">
                        <button type="submit" id="addCategoria_db">Agregar categoria</button>
                    </div>
                </div>
        </form>
    </div> 

    <table>
    <thead>
        <tr>
            <th>Tipo de categoria</th><th>Borrar/Editar</th>
        </tr>
    </thead>
    <tbody>
        <?php
$_from = $_smarty_tpl->smarty->ext->_foreach->init($_smarty_tpl, $_smarty_tpl->tpl_vars['tipo']->value, 'categoria');
$_smarty_tpl->tpl_vars['categoria']->do_else = true;
if ($_from !== null) foreach ($_from as $_smarty_tpl->tpl_vars['categoria']->value) {
$_smarty_tpl->tpl_vars['categoria']->do_else = false;
?>
            <tr><td><?php echo $_smarty_tpl->tpl_vars['categoria']->value->tipo_vianda;?>
</td>
            <td class="botonBorrar"> <a href='eliminarCategoria/<?php echo $_smarty_tpl->tpl_vars['categoria']->value->id_dirigidoA;?>
'><button class="botonBorrarTD" id="<?php echo $_smarty_tpl->tpl_vars['categoria']->value->id_dirigidoA;?>
"><i class="fa fa-trash-o"></i></button></a>
            <a href='editarCategoria/<?php echo $_smarty_tpl->tpl_vars['categoria']->value->id_dirigidoA;?>
'><button class="botonEditarTD" id="<?php echo $_smarty_tpl->tpl_vars['categoria']->value->id_dirigidoA;?>
"><i class="fa fa-edit"></i></button></a></td></tr>
        <?php
}
$_smarty_tpl->smarty->ext->_foreach->restore($_smarty_tpl, 1);?>
    </tbody>
    </table>



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
