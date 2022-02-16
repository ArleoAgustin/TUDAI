const loader = document.querySelector(".loader");
const main = document.querySelector("ARTICLE");
const nav = document.querySelector("NAV");

function init(){
    setTimeout(() =>{
        loader.style.opacity = 0;
        loader.style.display = 'none';

        main.style.opacity = 1;
        nav.style.opacity = 1;
    }
    ,Math.random() * (2000 - 500) + 500);
}

init();


document.querySelector(".notifications").addEventListener("click", ()=>{

    document.querySelector(".notifications").classList.toggle("click");
     document.querySelector(".notifications-container").classList.toggle("change-display");
});


document.getElementById('searcher').addEventListener('keydown', function(e){
 
  if (e.keyCode == 13) {
      window.location.href = "search.html"
  }

})