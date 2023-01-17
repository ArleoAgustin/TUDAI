<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">
    <title>GG CAMISETAS - Home</title>
</head>
<body>

    {include file="sections/header.tpl"}
    {include file="sections/nav.tpl"}
    
    <div class="cuerpo">
        
        <div class="articulos">

            {foreach from=$productos item=producto}
                
                <div class="producto">
                    <a href="{$producto->id}"> {$producto->producto} </a>
                </div>

            {/foreach}

        </div>
        
    </div>

    {include file="sections/footer.tpl"}
    
    
</body>
</html>