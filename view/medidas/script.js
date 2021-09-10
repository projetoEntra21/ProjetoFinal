function montaTr(paciente){
    var pacienteTr = document.createElement("tr");
    pacienteTr.classList.add("paciente");

    if (paciente.peso <= 0 || paciente.peso >= 200){       
        tdImc.textContent = "Peso inválido";
        pacienteTr.classList.add("paciente-invalido");
    }
}