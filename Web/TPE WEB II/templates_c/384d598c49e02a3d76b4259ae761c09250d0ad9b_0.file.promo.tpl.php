<?php
/* Smarty version 3.1.34-dev-7, created on 2020-10-08 01:10:05
  from 'C:\xampp\htdocs\TPE-WEB-II\templates\promo.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_5f7e4acd6cd338_21559606',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '384d598c49e02a3d76b4259ae761c09250d0ad9b' => 
    array (
      0 => 'C:\\xampp\\htdocs\\TPE-WEB-II\\templates\\promo.tpl',
      1 => 1602112146,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
    'file:encabezado.tpl' => 1,
    'file:nav.tpl' => 1,
    'file:botonLogin.tpl' => 1,
    'file:footer.tpl' => 1,
  ),
),false)) {
function content_5f7e4acd6cd338_21559606 (Smarty_Internal_Template $_smarty_tpl) {
?><!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi Viandita! - Promociones</title>
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/promo.css">
    <link rel="stylesheet" href="./css/responsive/responsive.css">
    <link rel="stylesheet" href="./css/responsive/responsive-promo.css">
    <?php echo '<script'; ?>
 type="text/javascript" src="./js/nav.js"><?php echo '</script'; ?>
>
    <base href="<?php echo $_smarty_tpl->tpl_vars['base_url']->value;?>
">
</head>

<body>

 <!-- ENCABEZADO -->
    
    <?php $_smarty_tpl->_subTemplateRender("file:encabezado.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>

 <!-- MENU DE NAVEGACION -->

    <?php $_smarty_tpl->_subTemplateRender("file:nav.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>

 <!-- CUERPO DE LA PAGINA-->
 
    <article>

        <section class="contenedorPromo">

         <!-- PROMO 1 -->

            <img src="./images/50-descuento.jpg" alt="50% de descuento" class="fotoPromo">
            
            <h2 class="subtituloPromo">Promo oto??o:</h2>

            <div class="descripcion">
                <p>Durante cada estacion del a??o tenemos promos para vos. Para pasar este oto??o frio durante la cuarentena
                    hay descuentos de hasta el 50% del total del pedido, durante un dia de la semana es un descuento distinto.
                    Para saber mas realiza una consulta mediante el boton "consultas".
                </p>
            </div>

        </section>

        <!-- PROMO 2 -->

        <section class="contenedorPromo">

            <img src="./images/regalo.jpg" alt="vianda vegana" class="fotoPromo">

            <h2 class="subtituloPromo">El regalo:</h2>

            <div class="descripcion">
                <p>Con cada compra acumulas puntos para un regalo, cuanto mas alto es el valor del pedido
                    mejor van a ser los puntos a obtener. Estos se renuevan cada mes, no te olvides de 
                    canjearlos!!
                </p>
            </div>

        </section>

        <!-- PROMO 3 -->

        <section class="contenedorPromo">

            <img src="./images/2x1.png" alt="vianda fideos" class="fotoPromo">

            <h2 class="subtituloPromo">Viandas de Domingo:</h2>

            <div class="descripcion">
                <p>Durante todos los domingos de este mes esta la promo 2x1, pagas un pedido y llevas dos.
                    Solo en productos seleccionados, en caso de querer una de las promos anteriores la 
                    "promo de domigo" se cancela.
                </p>
            </div>

        </section>

    </article>

     <!-- TABLA -->

    <section class="tabla">

        <table>
            <thead>
                <tr>
                    <th>Vianda</th> <th>Precio normal</th><th>Precio con promo</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Milanesa de carne con papas</td> <td>$150</td> <td>$115</td>
                </tr>
                <tr>
                    <td>Milanesa de pollo</td> <td>$100</td> <td>$75</td>
                </tr>
                <tr>
                    <td>Medallones de soja</td> <td>$110</td> <td>$85</td>
                </tr>

                <tr>
                    <td>Fideos con salsa</td> <td>$120</td> <td>$90</td>
                </tr>
                <tr>
                    <td>Ensalada tradicional</td> <td>$70</td> <td>$50</td>
                </tr>
                <td>Ensalada rusa</td> <td>$85</td> <td>$70</td>
                <tr>
                    <td>Vianda vegetariana</td> <td>$100</td> <td>$75</td>
                </tr>
                <tr>
                    <td>Vianda celiacos</td> <td>$105</td> <td>$75</td>
                </tr>
            </tbody>
        </table>

    </section>
        
 <!-- BOTON CONSULTAS Y LOGIN -->

        <?php $_smarty_tpl->_subTemplateRender("file:botonLogin.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>

 <!-- FOOTER -->

    <?php $_smarty_tpl->_subTemplateRender("file:footer.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>

</body>
</html><?php }
}
