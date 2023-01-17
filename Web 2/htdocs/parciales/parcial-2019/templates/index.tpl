<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>REPUESTOS</title>
    <base href="{$base_url}">
</head>

<body>

    <h1>REPUESTOS</H1>
    <ul>
        {foreach from=$ item=}
            <li>
                {$->}{$->}
            </li>
        {/foreach}
    </ul>

    <h2>CATEGORIAS</h2>

    <ul>
        {foreach from=$categoria item=cate}
            <li>{$cate->categoria}</li>
        {/foreach}
    </ul>




</body>
</html>