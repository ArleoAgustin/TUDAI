<?php
/* Smarty version 3.1.34-dev-7, created on 2020-12-10 21:45:27
  from 'C:\xampp\htdocs\GGCAMISETAS\templates\categoria.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_5fd288e789b288_08570732',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '3f07831b6b4af5a40ca65d2912075d305c55af62' => 
    array (
      0 => 'C:\\xampp\\htdocs\\GGCAMISETAS\\templates\\categoria.tpl',
      1 => 1607556840,
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
function content_5fd288e789b288_08570732 (Smarty_Internal_Template $_smarty_tpl) {
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
        
        <div class="articulos">

            <?php
$_from = $_smarty_tpl->smarty->ext->_foreach->init($_smarty_tpl, $_smarty_tpl->tpl_vars['productos']->value, 'producto');
$_smarty_tpl->tpl_vars['producto']->do_else = true;
if ($_from !== null) foreach ($_from as $_smarty_tpl->tpl_vars['producto']->value) {
$_smarty_tpl->tpl_vars['producto']->do_else = false;
?>
                
                <div class="producto">
                    <a href="<?php echo $_smarty_tpl->tpl_vars['producto']->value->id;?>
"> <?php echo $_smarty_tpl->tpl_vars['producto']->value->producto;?>
 </a>
                </div>

            <?php
}
$_smarty_tpl->smarty->ext->_foreach->restore($_smarty_tpl, 1);?>

        </div>
        
    </div>

    <?php $_smarty_tpl->_subTemplateRender("file:sections/footer.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>
    
    
</body>
</html><?php }
}