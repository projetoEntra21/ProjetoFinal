function peso(peso){
    var number = document.createElementbyId("medidas").innerHTML;
    if(peso >= 0 && peso <= 500) {
        return true;
    }else{
        return false;
    }
}

function altura(altura){
    if(altura => 0 && altura <= 3.0) {
        return true;
    }else{
        return false;
    }
}