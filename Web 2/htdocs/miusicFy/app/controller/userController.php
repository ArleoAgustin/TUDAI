<?php

require_once("./app/view/userView.php");
require_once("./app/model/userModel.php");

class userController {

    private $view;
    private $model;

    function __construct(){

        $this->view = new userView();
        $this->model = new userModel();
    }

    function register(){
        
        $this->view->showFormRegister();
    }

    function login(){
        $this->view->showFormLogin();
    }

    function addUser(){
        
        $alias = $_POST["alias"];
        $email = $_POST["email"];
        $pass_input = $_POST["password"];
        $sexo = $_POST["sexo"];
        $admin = false;

        $hash = password_hash($pass_input, PASSWORD_DEFAULT);

        //SE VERIFICA QUE LOS CAMPOS NO ESTEN VACIOS
        if((!empty($_POST["email"])) && (!empty($_POST["password"])) && (!empty($_POST["alias"])) && (!empty($_POST["sexo"]))){

            $existe = $this->verificarUsuario($email);  
        //SI EL USER NO EXISTE LO AGREGA A LA DB

            if ($existe == False) {        

                $this->model->insertUser($alias, $hash, $email, $sexo, $admin);
                $userFromDB = $this->model->getUser($alias);
                session_start();    //SE INICIA UNA SESION
                $_SESSION["alias"] = $userFromDB->alias;    //SE TRAE EL user DEL USUARIO DESDE LA DB
                $_SESSION["admin"] = $userFromDB->admin;    //SE TRAE EL ROL DEL USUARIO DESDE LA DB
                $_SESSION["id_user"] = $userFromDB->id_user;
                setcookie("id_user", $userFromDB->id_user); //SE CREA UNA COOKIE "id_user"
                
                header("Location: ".BASE_URL."home");

            }
            else{
                $this->view->showFormRegister("Usuario ya registrado");   
            }      
        }
        else{
            $this->view->showFormRegister("Ingrese los datos correspondientes");  
        }
    }

 //SI EL USUARIO EXISTE DEVUELVE TRUE, SINO FALSO
     function verificarUsuario($email){     
        $existe = False;
        $usuarios = $this->model->getAllUsers();
        
            foreach ($usuarios as $user) {
                if (strcasecmp($user->email, $email) === 0){
                    $existe = True;
                }
            }
        
                
        return $existe;
    }

    
}