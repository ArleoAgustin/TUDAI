
document.getElementById('pass').addEventListener('keydown', function(e){
 
    if (e.keyCode == 13) {
        document.getElementById("error").style.display="block"
        document.getElementById("email").style.border="3px solid red"
    }
  
  })