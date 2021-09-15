function cnpj(cnpj){
  cnpj=cnpj.replace(/\D/g,"")                           //Remove tudo o que não é dígito
  cnpj=cnpj.replace(/^(\d{2})(\d)/,"$1.$2")             //Coloca ponto entre o segundo e o terceiro dígitos
  cnpj=cnpj.replace(/^(\d{2})\.(\d{3})(\d)/,"$1.$2.$3") //Coloca ponto entre o quinto e o sexto dígitos
  cnpj=cnpj.replace(/\.(\d{3})(\d)/,".$1/$2")           //Coloca uma barra entre o oitavo e o nono dígitos
  cnpj=cnpj.replace(/(\d{4})(\d)/,"$1-$2")              //Coloca um hífen depois do bloco de quatro dígitos
  return cnpj
}

var password = document.getElementById("password")
  , confirm_password = document.getElementById("confirm_password");

function validatePassword(){
  if(password.value != confirm_password.value) {
    confirm_password.setCustomValidity("Senhas diferentes!");
  } else {
    confirm_password.setCustomValidity('');
  }
}

var validaForm = document.getElementById("password"),
  confirm_password = document.getElementById("confirm_passord"),
    cnpj = document.getElementById("cnpj")

  if(password == null || cnpj == null){
    
  }
  



    
