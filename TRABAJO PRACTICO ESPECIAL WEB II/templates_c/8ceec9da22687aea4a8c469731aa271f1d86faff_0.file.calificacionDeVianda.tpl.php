<?php
/* Smarty version 3.1.34-dev-7, created on 2020-12-03 02:11:01
  from 'C:\xampp\htdocs\TPE-WEB\templates\calificacionDeVianda.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_5fc83b25b3d639_52444691',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '8ceec9da22687aea4a8c469731aa271f1d86faff' => 
    array (
      0 => 'C:\\xampp\\htdocs\\TPE-WEB\\templates\\calificacionDeVianda.tpl',
      1 => 1606957373,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_5fc83b25b3d639_52444691 (Smarty_Internal_Template $_smarty_tpl) {
?><div class="calificacionYComentario">

        <h3 class="calificacion"> Calificar vianda </h3>

        <form id="formulario" method="post" action="calificarVianda">
            <p class="clasificacion">
                <input required id="radio1" type="radio" name="calificacion" value="5"><!--
                --><label for="radio1">★</label><!--
                --><input id="radio2" type="radio" name="calificacion" value="4"><!--
                --><label for="radio2">★</label><!--
                --><input id="radio3" type="radio" name="calificacion" value="3"><!--
                --><label for="radio3">★</label><!--
                --><input id="radio4" type="radio" name="calificacion" value="2"><!--
                --><label for="radio4">★</label><!--
                --><input id="radio5" type="radio" name="calificacion" value="1"><!--
                --><label for="radio5">★</label>
            </p>

            <div class="comentarioYBoton">
                <textarea id="textComentario" required name="comentario" rows="8" cols="40" value="" placeholder="Dejenos sus comentarios"></textarea>
                <input type="submit" id="btnEnviar" value="CALIFICAR">
            </div>
        </form>
    </div>    <?php }
}
