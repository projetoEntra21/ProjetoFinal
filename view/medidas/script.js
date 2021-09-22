function validamedidas(){

    var number = document.getElementbyId("peso");
    if(peso >= 0 && peso <= 500) 
        console.log("O seu peso está incorreto");
    

var number = document.getElementbyId("altura");
    if(altura => 0 && altura <= 3.0) 
    console.log("A sua altura está incorreta");
 

var number = document.getElementbyId("cintura");
    if (cintura >= 0 && cintura <= 102)
    console.log("A sua cintura está incorreta");

    
var quadril = document.getElementbyId("quadril");
    if (quadril >= 0 && quadril <= 1)
    console.log("O seu quadril está incorreto");


var number = document.getElementbyId("busto");
    if (busto >= 0 && busto <= 200)
    console.log("O seu busto está incorreto");

}