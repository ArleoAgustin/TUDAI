<?php
    require_once 'operaciones.php'
    
    if (!isset($_GET['action'])) {

        $action = $_GET['action'];
    }
    else {
        $action = 'home';
    }

    $params = explode('/', $action);

    switch ($params[0]) {
        
        case 'home': 
            home(); 
            break;

        case 'sumar': 
            sumar($params[1], $params[2]); 
            break;

        case 'restar': 
            restar($params[1], $params[2]); 
            break;

        case 'pi': 
            showPi(); 
            break;
            
        default: 
            echo('404 Page not found'); 
            break;


    }

?>