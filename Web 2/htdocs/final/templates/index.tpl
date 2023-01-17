<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Final</title>
</head>
<body>

    {foreach from=$ciudades item=ciudad}
        <h3>{ciudad->nombre}</h3>
        <ul>
            <li>Lote {ciudad->nro_lote} - </li>
        </ul>
    {/foreach}
</body>
</html>