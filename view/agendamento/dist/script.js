$(document).on('click', 'button', function(){
    var campo = $('input').val(); // Pega valor do campo
nomeSobrenome = /\b[A-Za-zÀ-ú][A-Za-zÀ-ú]+,?\s[A-Za-zÀ-ú][A-Za-zÀ-ú]{2,19}\b/gi;
// Regex para duas strings, separadas com espaço e com no mínimo 3 caracteres. Aceita acentuação e rejeita números.

// Faz a validacao do regex no campo indicado
if(!(nomeSobrenome.test(campo))){
        alert('Inválido'); } });