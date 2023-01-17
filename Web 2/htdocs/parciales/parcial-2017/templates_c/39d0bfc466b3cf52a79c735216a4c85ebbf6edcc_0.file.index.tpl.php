<?php
/* Smarty version 3.1.34-dev-7, created on 2020-10-27 18:37:32
  from 'C:\xampp\htdocs\parciales\parcial-2017\templates\index.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_5f985adc5f92c1_87181733',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '39d0bfc466b3cf52a79c735216a4c85ebbf6edcc' => 
    array (
      0 => 'C:\\xampp\\htdocs\\parciales\\parcial-2017\\templates\\index.tpl',
      1 => 1603820149,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_5f985adc5f92c1_87181733 (Smarty_Internal_Template $_smarty_tpl) {
?><!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CLETA</title>
    <base href="<?php echo $_smarty_tpl->tpl_vars['base_url']->value;?>
">
</head>

<body>

    <h1>BICICLETERIA</H1>
    <ul>
        <?php
$_from = $_smarty_tpl->smarty->ext->_foreach->init($_smarty_tpl, $_smarty_tpl->tpl_vars['bicis']->value, 'cleta');
$_smarty_tpl->tpl_vars['cleta']->do_else = true;
if ($_from !== null) foreach ($_from as $_smarty_tpl->tpl_vars['cleta']->value) {
$_smarty_tpl->tpl_vars['cleta']->do_else = false;
?>
            <li>
                <?php echo $_smarty_tpl->tpl_vars['cleta']->value->marca;
echo $_smarty_tpl->tpl_vars['cleta']->value->categoria;
if (($_smarty_tpl->tpl_vars['cleta']->value->categoria == "Retro")) {?> ES RETRO<?php }?>
            </li>
        <?php
}
$_smarty_tpl->smarty->ext->_foreach->restore($_smarty_tpl, 1);?>
    </ul>

    <h2>CATEGORIAS</h2>

    <ul>
        <?php
$_from = $_smarty_tpl->smarty->ext->_foreach->init($_smarty_tpl, $_smarty_tpl->tpl_vars['categoria']->value, 'cate');
$_smarty_tpl->tpl_vars['cate']->do_else = true;
if ($_from !== null) foreach ($_from as $_smarty_tpl->tpl_vars['cate']->value) {
$_smarty_tpl->tpl_vars['cate']->do_else = false;
?>
            <li><?php echo $_smarty_tpl->tpl_vars['cate']->value->categoria;?>
</li>
        <?php
}
$_smarty_tpl->smarty->ext->_foreach->restore($_smarty_tpl, 1);?>
    </ul>

    <h2>FILTRO: BICIS < 10000</h2>

    <ul>
        <?php
$_from = $_smarty_tpl->smarty->ext->_foreach->init($_smarty_tpl, $_smarty_tpl->tpl_vars['biciFiltrada']->value, 'filtro');
$_smarty_tpl->tpl_vars['filtro']->do_else = true;
if ($_from !== null) foreach ($_from as $_smarty_tpl->tpl_vars['filtro']->value) {
$_smarty_tpl->tpl_vars['filtro']->do_else = false;
?>
            <li>MARCA:<?php echo $_smarty_tpl->tpl_vars['filtro']->value->marca;?>
 --PRECIO:<?php echo $_smarty_tpl->tpl_vars['filtro']->value->precio;?>
</li>
        <?php
}
$_smarty_tpl->smarty->ext->_foreach->restore($_smarty_tpl, 1);?>
    </ul>
    


</body>
</html><?php }
}
