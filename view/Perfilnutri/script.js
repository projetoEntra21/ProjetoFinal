$("document").ready(function () {

  var textmax=500;
 
  $("#count").text(textmax + ' character left');
  
  $("#bio").keyup(function(){
      
      var userlenght= $("#bio").val().length;
      
      var remain= textmax - userlenght ;

      $("#count").text(remain + ' characters left');
      
  });
  
});

document.getElementById('getval').addEventListener('change', readURL, true);
function readURL(){
  var file = document.getElementById("getval").files[0];
  var reader = new FileReader();
  reader.onloadend = function(){
      document.getElementById('profile-upload').style.backgroundImage = "url(" + reader.result + ")";        
  }
  if(file){
      reader.readAsDataURL(file);
  }else{
  }
}

$(function () {
var $text = $('#texte');
var $input = $('.texte');
$input.on('keydown', function () {
  setTimeout(function () {
    $text.html($input.val());
  }, 0);
});
})


function validateEmail(email) {
 var re = /\S+@\S+\.\S+/;
 return re.test(email);
}
    
console.log(validateEmail('texto@texto.com')); // true
console.log(validateEmail('texto@texto')); // false
console.log(validateEmail('texto.com')); // false
console.log(validateEmail('texto')); // false

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
}}

myPassword.onchange = validatemyPassword;
confirm_password.onkeyup = validatemyPassword;

password.onchange = validatePassword;  
confirm_password.onkeyup = validatePassword;

function mask(o, f) {
 setTimeout(function() {
  var v = mphone(o.value);
  if (v != o.value) {
    o.value = v;
}
}, 1);
}
function mouseoverPass(obj) {
  var obj = document.getElementById('myPassword');
  obj.type = "text";
}
function mouseoutPass(obj) {
  var obj = document.getElementById('myPassword');
  obj.type = "password";
}