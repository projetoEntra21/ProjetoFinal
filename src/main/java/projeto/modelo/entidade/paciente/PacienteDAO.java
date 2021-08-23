package projeto.modelo.entidade.paciente;

public interface PacienteDAO {

	void inserirPaciente(Paciente paciente);

	void deletarPaciente(Paciente paciente);

	void atualizarId(Paciente paciente, int novoId);

	void atualizarIdEnderecoPaciente(Paciente paciente, int novoIdEnderecoPaciente);

	void atualizarIdContatoPaciente(Paciente paciente, int novoIdContatoPaciente);

	void atualizarCpf(Paciente paciente, String novoCpf);

	void atualizarNome(Paciente paciente, String novoNome);

	void atualizarSobreNome(Paciente paciente, String novoSobreNome);

	void atualizarIdade(Paciente paciente, int novoIdade);

}
