<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SOBRE</title>
</head>
<body>

    <h1>Acerca de</h1>

    <?php include 'nav.php' ?>

    <p>Lorem ipsum dolor sit amet consectetur, adipisicing eult. Exercitationem nemo consectetur eos expedita at? Quos.</p>
    
    <h2>Los fachas</h2>
    <ul>
        <li><a href="about.php?dev=agustin">Agustin</a></li>
        <li><a href="about.php?dev=matias">Matias</a></li>
        <li><a href="about.php?dev=gonzalo">Gonzalo</a></li>
        <li><a href="about.php?dev=lucas">Lucas</a></li>
    </ul>

</body>
</html>

<?php

    if (isset($_GET["dev"])) {

        $developer = $_GET["dev"];

        switch ($developer) {
            case 'agustin':
                echo $developer . " es un crack";
                break;
            
            case 'matias':
                echo $developer . " es un vicio";
            break;
        
            case 'lucas':
                echo $developer . " es un drogadicto";
            break;

            case 'gonzalo':
                echo $developer . " es un pollera";
            break;
        }

    }

?>