<?php
/* Smarty version 3.1.34-dev-7, created on 2020-12-03 02:13:39
  from 'C:\xampp\htdocs\TPE-WEB\templates\formEditar.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_5fc83bc33367d8_49064065',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    'eefd297b0d6061a6d40682786649cb41bd3dc6d2' => 
    array (
      0 => 'C:\\xampp\\htdocs\\TPE-WEB\\templates\\formEditar.tpl',
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
function content_5fc83bc33367d8_49064065 (Smarty_Internal_Template $_smarty_tpl) {
?><!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi Viandita! - Administracion - Editar</title>
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../css/consultas.css">
    <link rel="stylesheet" href="../css/responsive/responsive.css">
    <link rel="stylesheet" href="../css/responsive/responsive-consultas.css">
    <?php echo '<script'; ?>
 type="text/javascript" src="../js/nav.js"><?php echo '</script'; ?>
>
    <?php echo '<script'; ?>
 type="text/javascript" src="../js/newImg.js"><?php echo '</script'; ?>
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

            
            <form class="formulario" method="post" action="actualizarVianda/<?php echo $_smarty_tpl->tpl_vars['vianda']->value->id_vianda;?>
" enctype="multipart/form-data">
                <h1 class="subtitulo"> EDITA LA VIANDA:  <?php echo $_smarty_tpl->tpl_vars['vianda']->value->nombre;?>
</h1>
                <label class="itemformulario"> Nombre: </label><input type="text" name="nombre"  value='<?php echo $_smarty_tpl->tpl_vars['vianda']->value->nombre;?>
'>
                <label class="itemformulario"> Precio: </label> <input type="number" name="precio"  REQUIRED value=<?php echo $_smarty_tpl->tpl_vars['vianda']->value->precio;?>
>
                <label class="itemformulario"> Tipo de vianda: (Anteriormente era: <?php echo $_smarty_tpl->tpl_vars['vianda']->value->tipo_vianda;?>
)</label> 
                    <select name="dirigidoA" id="select">
                        <?php
$_from = $_smarty_tpl->smarty->ext->_foreach->init($_smarty_tpl, $_smarty_tpl->tpl_vars['tipo']->value, 'categoria');
$_smarty_tpl->tpl_vars['categoria']->do_else = true;
if ($_from !== null) foreach ($_from as $_smarty_tpl->tpl_vars['categoria']->value) {
$_smarty_tpl->tpl_vars['categoria']->do_else = false;
?>
                            <option value="<?php echo $_smarty_tpl->tpl_vars['categoria']->value->id_dirigidoA;?>
"><?php echo $_smarty_tpl->tpl_vars['categoria']->value->tipo_vianda;?>
</option>
                        <?php
}
$_smarty_tpl->smarty->ext->_foreach->restore($_smarty_tpl, 1);?>
                    </select>
                <label class="itemformulario"> Nueva descripcion: </label> <textarea type="text" REQUIRED name="descripcion"><?php echo $_smarty_tpl->tpl_vars['vianda']->value->descripcion;?>
</textarea>
                
                <label class="textoInput"> Nueva Imagen: <input type="file" name="file"/></label>

                <button type="submit" id="botonEnviar">Actualizar!</button>

            </form>

        </section>

    </article>

        <section class="section-consultas">
            <a class="botonAdministrar" href="administracion/viandas"> Volver a administrar</a>
        </section>
 <!-- FOOTER -->

    <?php $_smarty_tpl->_subTemplateRender("file:footer.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>

</body>
</html><?php }
}
