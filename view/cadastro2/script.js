function validateEmail(email) {
  var re = /\S+@\S+\.\S+/;
  return re.test(email);
}
    
console.log(validateEmail('texto@texto.com')); // true
console.log(validateEmail('texto@texto')); // false
console.log(validateEmail('texto.com')); // false
console.log(validateEmail('texto')); // false


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


 $("#submit").on("click", function() {
  if ($("#form-login").valid()) { //Verifica se o formulário está válido.
    $('#myModal').modal('show'); //Se for válido, exibe o modal.
  }
});
$('#myModal').on('shown.bs.modal', function () {
  $('#meuInput').trigger('focus')
})

$('#myForm').on('submit', function(e) {
  var email = $('#email');
 

  // Check if there is an entered value
  if(!email.val()) {
    // Add errors highlight
    email.closest('.form-group').removeClass('has-success').addClass('has-error');

    // Stop submission of the form
    e.preventDefault();
  } else {
    // Remove the errors highlight
    email.closest('.form-group').removeClass('has-error').addClass('has-success');
  }
});
$('#myForm').on('submit', function(e) {
  var password = $('#password');
 

  // Check if there is an entered value
  if(!password.val()) {
    // Add errors highlight
    password.closest('.form-group').removeClass('has-success').addClass('has-error');

    // Stop submission of the form
    e.preventDefault();
  } else {
    // Remove the errors highlight
    password.closest('.form-group').removeClass('has-error').addClass('has-success');
  }
});
function mouseoverPass(obj) {
  var obj = document.getElementById('myPassword');
  obj.type = "text";
}
function mouseoutPass(obj) {
  var obj = document.getElementById('myPassword');
  obj.type = "password";
}


function isValidCPF() {
  let cpf = document.getElementById("cpf").value;
  if (typeof cpf !== "string") return false
  cpf = cpf.replace(/[\s.-]*/igm, '')
  if (
      !cpf ||
      cpf.length != 11 ||
      cpf == "00000000000" ||
      cpf == "11111111111" ||
      cpf == "22222222222" ||
      cpf == "33333333333" ||
      cpf == "44444444444" ||
      cpf == "55555555555" ||
      cpf == "66666666666" ||
      cpf == "77777777777" ||
      cpf == "88888888888" ||
      cpf == "99999999999" 
  ) {
      return false
  }
  var soma = 0
  var resto
  for (var i = 1; i <= 9; i++) 
      soma = soma + parseInt(cpf.substring(i-1, i)) * (11 - i)
  resto = (soma * 10) % 11
  if ((resto == 10) || (resto == 11))  resto = 0
  if (resto != parseInt(cpf.substring(9, 10)) ) return false
  soma = 0
  for (var i = 1; i <= 10; i++) 
      soma = soma + parseInt(cpf.substring(i-1, i)) * (12 - i)
  resto = (soma * 10) % 11
  if ((resto == 10) || (resto == 11))  resto = 0
  if (resto != parseInt(cpf.substring(10, 11) ) ) return false
  return true
}