
function validateEmail(email) {
  var re = /\S+@\S+\.\S+/;
  return re.test(email);
}
    
console.log(validateEmail('texto@texto.com')); // true
console.log(validateEmail('texto@texto')); // false
console.log(validateEmail('texto.com')); // false
console.log(validateEmail('texto')); // false


   var password = document.getElementById("password")
   , confirm_password = document.getElementById("confirm_password");
 
 function validatePassword(){
   if(password.value != confirm_password.value) {
     confirm_password.setCustomValidity("Senhas diferentes!");
   } else {
     confirm_password.setCustomValidity('');
   }
 }
 
 password.onchange = validatePassword;
 confirm_password.onkeyup = validatePassword;
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
//valida o CNPJ digitado
function ValidarCNPJ(cnpj){
  cnpj = cnpj.value.replace(/[^\d]+/g,'');

if(cnpj == '') return false;

if (cnpj.length < 14){
   alert('CNPJ não digitado corretamente ou faltando informação! Digite a forma correta Ex. 66.075.246/0001-30');
  return false;
}

// Elimina CNPJs invalidos conhecidos
if (cnpj == "00000000000000" || 
  cnpj == "11111111111111" || 
  cnpj == "22222222222222" || 
  cnpj == "33333333333333" || 
  cnpj == "44444444444444" || 
  cnpj == "55555555555555" || 
  cnpj == "66666666666666" || 
  cnpj == "77777777777777" || 
  cnpj == "88888888888888" || 
  cnpj == "99999999999999")
  return false;
   
// Valida DVs
tamanho = cnpj.length - 2
numeros = cnpj.substring(0,tamanho);
digitos = cnpj.substring(tamanho);
soma = 0;
pos = tamanho - 7;
for (i = tamanho; i >= 1; i--) {
soma += numeros.charAt(tamanho - i) * pos--;
if (pos < 2)
      pos = 9;
}
resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
if (resultado != digitos.charAt(0))
  return false;
   
tamanho = tamanho + 1;
numeros = cnpj.substring(0,tamanho);
soma = 0;
pos = tamanho - 7;
for (i = tamanho; i >= 1; i--) {
soma += numeros.charAt(tamanho - i) * pos--;
if (pos < 2)
      pos = 9;
}
resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
if (resultado != digitos.charAt(1)){
   alert('CNPJ Inválido! Digite a forma correta Ex. 66.075.246/0001-30');
   return false
}
return true;
         

}