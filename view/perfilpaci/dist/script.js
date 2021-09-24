$('#myModal').on('shown.bs.modal', function () {
  $('#meuInput').trigger('focus')
})

var myPassword = document.getElementById("myPassword")
, confirm_password = document.getElementById("confirm_password");

function validatemyPassword(){
if(myPassword.value != confirm_password.value) {
  confirm_password.setCustomValidity("Senhas diferentes!");
} else {
  confirm_password.setCustomValidity('');
}
}

myPassword.onchange = validatemyPassword;
confirm_password.onkeyup = validatemyPassword;

  password.onchange = validatePassword;  
 confirm_password.onkeyup = validatePassword;

 
 