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

 function mask(o, f) {
  setTimeout(function() {
    var v = mphone(o.value);
    if (v != o.value) {
      o.value = v;
    }
  }, 1);
}

function mphone(v) {
  var r = v.replace(/\D/g, "");
  r = r.replace(/^0/, "");
  if (r.length > 10) {
    r = r.replace(/^(\d\d)(\d{5})(\d{4}).*/, "($1) $2-$3");
  } else if (r.length > 5) {
    r = r.replace(/^(\d\d)(\d{4})(\d{0,4}).*/, "($1) $2-$3");
  } else if (r.length > 2) {
    r = r.replace(/^(\d\d)(\d{0,5})/, "($1) $2");
  } else {
    r = r.replace(/^(\d*)/, "($1");
  }
  return r;
}
function limpa_formulário_cep() {
  //Limpa valores do formulário de cep.
  document.getElementById('rua').value=("");
  document.getElementById('bairro').value=("");
  document.getElementById('cidade').value=("");
  document.getElementById('uf').value=("");
}

function meu_callback(conteudo) {
if (!("erro" in conteudo)) {
  //Atualiza os campos com os valores.
  document.getElementById('rua').value=(conteudo.logradouro);
  document.getElementById('bairro').value=(conteudo.bairro);
  document.getElementById('cidade').value=(conteudo.localidade);
  document.getElementById('uf').value=(conteudo.uf);
} //end if.
else {
  //CEP não Encontrado.
  limpa_formulário_cep();
  alert("CEP não encontrado.");
}
}

function pesquisacep(valor) {

//Nova variável "cep" somente com dígitos.
var cep = valor.replace(/\D/g, '');

//Verifica se campo cep possui valor informado.
if (cep != "") {

  //Expressão regular para validar o CEP.
  var validacep = /^[0-9]{8}$/;

  //Valida o formato do CEP.
  if(validacep.test(cep)) {

      document.getElementById('cep').value = cep.substring(0,5)
      +"-"
      +cep.substring(5);

      //Preenche os campos com "..." enquanto consulta webservice.
      document.getElementById('rua').value="...";
      document.getElementById('bairro').value="...";
      document.getElementById('cidade').value="...";
      document.getElementById('uf').value="...";

      //Cria um elemento javascript.
      var script = document.createElement('script');

      //Sincroniza com o callback.
      script.src = 'https://viacep.com.br/ws/'+ cep + '/json/?callback=meu_callback';

      //Insere script no documento e carrega o conteúdo.
      document.body.appendChild(script);

  } //end if.
  else {
      //cep é inválido.
      limpa_formulário_cep();
      alert("Formato de CEP inválido.");
  }
} //end if.
else {
  //cep sem valor, limpa formulário.
  limpa_formulário_cep();
}
};