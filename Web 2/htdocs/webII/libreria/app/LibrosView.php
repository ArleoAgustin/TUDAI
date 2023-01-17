<?php 
    require_once("app/LibrosController.php");

Class LibrosView {

    function showHome ($generos) {
        "<ul>";
        foreach($generos as $gen) {

           echo "<li> <a href= 'libros/".$gen->genero."'>$gen->genero</a> </li>";
        }
        '</ul>';
        /*"<ul>";
        foreach($generos as $gen) {
        echo '<li><a href="libro/'$gen->genero'">Aventura</a></li>';

       }
       "</ul>"/*
        <ul>
            'foreach($generos as $gen) {
                <li><a href="libro/'$gen->genero'">Aventura</a></li>
            }
        </ul>

        <a href="Libros">Ver todos</a>
        <br>
        <a href="ingresarLibro">Cargar libro</a>';
*/
    }

    function renderLibrosByGenre($genre, $libros) {
        echo "<h1 >Lista por género: $genre</h2>";
        
        $this->renderLibros($libros);
    }

    function renderLibros($libros) {

        echo "<a href='Home'> Volver </a>";

        // imprime la tabla de peliculas
        echo "<table border= 2px solid black>
        <thead>
            <tr>
                <th>Genero</th>
                <th>Editor</th>
                <th>Lanzamiento</th>
                <th>Eliminar/Editar</th>
            </tr>
        <thead>
        <tbody>
        ";
        foreach($libros as $libro) {
        echo "
            <tr>
                <td>$libro->genero</td>
                <td>$libro->Editor</td>
                <td>$libro->Lanzamiento</td>
                <td><a href='borrar/".$libro->id."'><button>Eliminar</button></a><a href='editar/".$libro->id."'> <button>Editar</button></td></a>
            </tr>";
        }
        echo " </tbody>    
        </table>";
    }

    function formulario () {

        echo'<form action="insert" method="post">

            <label>Genero</label><input type="text" name="genero" id="">
            <label>Autor</label><input type="text" name="Editor" id="">
            <label>Fecha de lanzamiento</label><input type="text" name="Lanzamiento" id="">
            <input type="submit" value="Enviar">
            </form>';
    }

    function renderError() {
        echo "<h2>Error! Género no especificado.</h2>";
    }

    function showHomeLocation() {

        header("Location: ".BASE_URL."home");
    }

}