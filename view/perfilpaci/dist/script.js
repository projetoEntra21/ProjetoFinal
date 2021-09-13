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

 