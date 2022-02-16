<?php
/* Smarty version 3.1.34-dev-7, created on 2020-12-03 02:10:01
  from 'C:\xampp\htdocs\TPE-WEB\templates\botonLogin.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.34-dev-7',
  'unifunc' => 'content_5fc83ae942e337_14114370',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '5309471f4b09338c781b93e869c3f1b8f9db909e' => 
    array (
      0 => 'C:\\xampp\\htdocs\\TPE-WEB\\templates\\botonLogin.tpl',
      1 => 1606957373,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_5fc83ae942e337_14114370 (Smarty_Internal_Template $_smarty_tpl) {
?><section class="section-consultas">
    
    <?php if ((!(isset($_SESSION['user'])))) {?>    <!--CON ESTO SE VERIFICA QUE NO HAYA UN USUARIO LOGUEADO-->
        
            <a class="botonLogueo" href="login"> Loguearse <img src="./images/user.png" alt="user.img" class="imagenConsultas"></a>
        <?php } else { ?>
            
                <h3 data-user="<?php echo $_SESSION['id_user'];?>
" class="user"> <?php echo $_SESSION['user'];?>
 </h3>
            
            <a class="botonLogueo" href="logout"> Desloguearse <img src="./images/user.png" alt="user.img" class="imagenConsultas"></a>
       
    <?php }?>
    <a class="botonConsultas" href="consultas"> Consultas</a>

</section><?php }
}
