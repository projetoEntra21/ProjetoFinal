$('#myModal').on('shown.bs.modal', function () {
  $('#meuInput').trigger('focus')
})
var password = document.getElementById("password"),
 confirm_password = document.getElementById("confirm_password");

function validatePassword(){
if(password.value != confirm_password.value) {
  confirm_password.setCustomValidity("Senhas diferentes!");
} else {
  confirm_password.setCustomValidity('');
}
}

  password.onchange = validatePassword;  
 confirm_password.onkeyup = validatePassword;

 
 //valida telefone
function ValidaTelefone(tel){
  exp = /\(\d{2}\)\ \d{4}\-\d{4}/
  if(!exp.test(tel.value))
          alert('Numero de Telefone Invalido!');
}

//valida CEP
function ValidaCep(cep){
  exp = /\d{2}\.\d{3}\-\d{3}/
  if(!exp.test(cep.value))
          alert('Numero de Cep Invalido!');               
}

//valida data
function ValidaData(data){
  exp = /\d{2}\/\d{2}\/\d{4}/
  if(!exp.test(data.value))
          alert('Data Invalida!');                        
}

//valida o CPF digitado
function ValidarCPF(Objcpf){
  var cpf = Objcpf.value;
  exp = /\.|\-/g
  cpf = cpf.toString().replace( exp, "" ); 
  var digitoDigitado = eval(cpf.charAt(9)+cpf.charAt(10));
  var soma1=0, soma2=0;
  var vlr =11;

  for(i=0;i<9;i++){
          soma1+=eval(cpf.charAt(i)*(vlr-1));
          soma2+=eval(cpf.charAt(i)*vlr);
          vlr--;
  }       
  soma1 = (((soma1*10)%11)==10 ? 0:((soma1*10)%11));
  soma2=(((soma2+(2*soma1))*10)%11);

  var digitoGerado=(soma1*10)+soma2;
  if(digitoGerado!=digitoDigitado)        
          alert('CPF Invalido!');         
}