<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CLETA</title>
    <base href="{$base_url}">
</head>

<body>

    <h1>BICICLETERIA</H1>
    <ul>
        {foreach from=$bicis item=cleta}
            <li>
                {$cleta->marca}{$cleta->categoria}{if ($cleta->categoria == "Retro")} ES RETRO{/if}
            </li>
        {/foreach}
    </ul>

    <h2>CATEGORIAS</h2>

    <ul>
        {foreach from=$categoria item=cate}
            <li>{$cate->categoria}</li>
        {/foreach}
    </ul>

    <h2>FILTRO: BICIS < 10000</h2>

    <ul>
        {foreach from=$biciFiltrada item=filtro}
            <li>MARCA:{$filtro->marca} --PRECIO:{$filtro->precio}</li>
        {/foreach}
    </ul>
    


</body>
</html>