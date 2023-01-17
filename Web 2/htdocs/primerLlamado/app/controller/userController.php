<?php

require_once("./app/model/userModel");

class userController {

    private $model;

    function __construct(){

        $this->model = new modelUser();
    }

    function esAdmin(){
        
        $es_admin = false;
        if (isset($_SESSION["user"]) && ($_SESSION["admin"] == 1)) {
            $es_admin = true;
        }
        else {
            header("Location: ".BASE_URL."login");
        }
    return $es_admin;
}