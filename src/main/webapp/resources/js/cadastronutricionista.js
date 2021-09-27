function validateEmail(email) {
  var re = /\S+@\S+\.\S+/;
  return re.test(email);
}
    
console.log(validateEmail('texto@texto.com')); // true
console.log(validateEmail('texto@texto')); // false
console.log(validateEmail('texto.com')); // false
console.log(validateEmail('texto')); // false


   var password = document.getElementById("myPassword")
   , confirm_password = document.getElementById("confirm_password");
 
 function validatePassword(){
   if(myPassword.value != confirm_password.value) {
     confirm_password.setCustomValidity("Senhas diferentes!");
   } else {
     confirm_password.setCustomValidity('');
   }
 }
 
 myPassword.onchange = validatePassword;
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
function mouseoverPass(obj) {
  var obj = document.getElementById('myPassword');
  obj.type = "text";
}
function mouseoutPass(obj) {
  var obj = document.getElementById('myPassword');
  obj.type = "password";
}
document.getElementById('cnpj').addEventListener('input', function (e) {
  var x = e.target.value.replace(/\D/g, '').match(/(\d{0,2})(\d{0,3})(\d{0,3})(\d{0,4})(\d{0,2})/);
  e.target.value = !x[2] ? x[1] : x[1] + '.' + x[2] + '.' + x[3] + '/' + x[4] + (x[5] ? '-' + x[5] : '');
});