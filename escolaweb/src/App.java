import javax.swing.JOptionPane;

import br.com.escolaweb.controller.AlunoController;
import br.com.escolaweb.controller.FuncionarioController;
import br.com.escolaweb.model.Aluno;
import br.com.escolaweb.model.Funcionario;
import br.com.escolaweb.services.FuncionarioService;

public class App {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno();
            aluno.setNome("Ana Maria");
            aluno.setEmail("ana@email.com");
            aluno.setSenha("123456");
            AlunoController alunoController = new AlunoController();
            alunoController.cadastrar(aluno);
            JOptionPane.showMessageDialog(null, "Cadastrado!");
        } catch (Exception e) {
            System.err.println("Erro >>> " + e);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!" + e.getMessage());
        }
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.setNome("Ana Maria");
            funcionario.setEmail("ana@email.com");
            funcionario.setSenha("123456");
            FuncionarioController funcionarioController = new FuncionarioController();
            funcionarioController.cadastrar(funcionario);
            JOptionPane.showMessageDialog(null, "Cadastrado!");
        } catch (Exception e) {
            System.err.println("Erro >>> " + e);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!" + e.getMessage());
        }

        // update
        try {
            FuncionarioService funcionarioService = new FuncionarioService();
            Funcionario funcionario = new Funcionario();
            funcionario.setId("123456");
            funcionario.setNome("Novo Nome");
            funcionario.setEmail("novoemail@exemplo.com");
            funcionario.setCargo("Novo Cargo");
            funcionarioService.update(funcionario);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        // remove

        
    }
}
