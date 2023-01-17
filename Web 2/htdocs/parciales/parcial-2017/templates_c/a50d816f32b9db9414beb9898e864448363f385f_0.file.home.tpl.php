<?php
/* Smarty version 3.1.34-dev-7, created on 2020-10-25 00:31:29
  from 'C:\xampp\htdocs\GGCAMISETAS\templates\home.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_5f94ab41dd7ee2_19255135',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    'a50d816f32b9db9414beb9898e864448363f385f' => 
    array (
      0 => 'C:\\xampp\\htdocs\\GGCAMISETAS\\templates\\home.tpl',
      1 => 1603577661,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
    'file:sections/header.tpl' => 1,
    'file:sections/nav.tpl' => 1,
    'file:sections/footer.tpl' => 1,
  ),
),false)) {
function content_5f94ab41dd7ee2_19255135 (Smarty_Internal_Template $_smarty_tpl) {
?><!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">
    <title>GG CAMISETAS - Home</title>
</head>
<body>

    <?php $_smarty_tpl->_subTemplateRender("file:sections/header.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>
    <?php $_smarty_tpl->_subTemplateRender("file:sections/nav.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>
    
    <div class="cuerpo">
        
        <div class="presentacion">

            <h2>¿Quienes somos?</h2>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Aspernatur blanditiis sint esse facere magnam quaerat?</p>

        </div>

        <div class="contacto">
            
            <h2>Contacto</h2>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusamus eaque doloribus aut mollitia ratione dolore aperiam architecto enim vero natus</p>

        </div>

        <div class="pagos"> 

            <h2>Medios de pagos</h2>
            <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Laudantium cum pariatur a eos, ex itaque non nobis nihil dignissimos iusto laboriosam corporis hic beatae nam? Maxime deleniti consequuntur possimus facere.</p>

        </div>
    </div>

    <?php $_smarty_tpl->_subTemplateRender("file:sections/footer.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>
    
    
</body>
</html><?php }
}
