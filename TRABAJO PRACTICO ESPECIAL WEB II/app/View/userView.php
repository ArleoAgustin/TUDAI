<?php

require_once("./libs/smarty/Smarty.class.php");

class userView{

    private $smarty;

    function __construct(){
        $this->smarty = new Smarty();
        $this->smarty->assign('base_url',BASE_URL);
    }
    
 //MUESTRA EL FORMULARIO DE LOGIN
    function ShowLog($mensaje = ""){
        $this->smarty->assign('mensaje', $mensaje);
        $this->smarty->display('../templates/log.tpl');
    }

 //MUESTRA EL FORMULARIO DE REGISTER
    function ShowRegister($mensaje = ""){
        $this->smarty->assign('mensaje', $mensaje);
        $this->smarty->display('../templates/register.tpl');
    }

 //MUESTRA TODOS LOS USUARIOS
    function showUsers($usuarios){
        $this->smarty->assign("usuarios", $usuarios);
        $this->smarty->display('../templates/adminUsers.tpl');
    }

 //MUESTRA EL FORMULARIO EDITAR ROL
    function showFormUser($usuario){
        $this->smarty->assign("usuario", $usuario);
        $this->smarty->display('../templates/formEditarUser.tpl');
    }

 //RUTA A ADMINISTRACION DE USUARIOS
    function showAdminUsersLocation(){
        header("Location: ".BASE_URL."administracion/usuarios");
    }
}
?>