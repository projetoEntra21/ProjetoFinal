package projeto.main;

import projeto.modelo.entidade.paciente.Paciente;
import projeto.modelo.entidade.paciente.PacienteDAO;
import projeto.modelo.entidade.paciente.PacienteDAOimpl;
import projeto.modelo.info.contato.Contato;
import projeto.modelo.info.contato.ContatoDAO;
import projeto.modelo.info.contato.ContatoDAOimpl;

public class Principal {

	public static void main(String[] args) {

		PacienteDAO pacienteDAO = new PacienteDAOimpl();
		ContatoDAO contatoDAO = new ContatoDAOimpl();

		String nome = "Lucas do Mau";
		String cpf = "123.456.789-10";

		Paciente paciente = new Paciente();

		paciente.setNome(nome);
		paciente.setCpf(cpf);

		pacienteDAO.inserirPaciente(paciente);

		String telefone = "4002-8922";
		String email = "luquinhasbalafina@gmail.com";
		String celular = "4002-8922";

		Contato contato = new Contato();

		contato.setTelefone(telefone);
		contato.setEmail(email);
		contato.setCelular(celular);

		contatoDAO.inserirContato(contato);

	}

}
