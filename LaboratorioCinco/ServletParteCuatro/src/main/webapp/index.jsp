<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Hello World!</h1>
        <form name ="formNumero" action="/cvdsServlet" method="GET" >                           
            Ingrese un numero:<br>
            <input  id="prueba" type="text" name="id"><br>                                             
        </form>
        <button type="button" onclick="esNumero()">Submit</button>
        
        <p id ="isNumero"></p>
        <script>
            function esNumero(){
                let numero,texto;
                numero = document.getElementById("prueba").value;
                if (isNaN(numero)){
                   texto = "No es un numero"; 
                }else{
                    texto = "Es un numero";
                }
                document.getElementById("isNumero").innerHTML = texto;
            }            
        </script>
    </body>
</html>