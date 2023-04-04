import javax.swing.JOptionPane;

import br.com.escolaweb.controller.AlunoController;
import br.com.escolaweb.controller.FuncionarioController;
import br.com.escolaweb.model.Aluno;
import br.com.escolaweb.model.Funcionario;
import br.com.escolaweb.services.FuncionarioService;

public class App {
    public static void main(String[] args) {
        //novo funcionario
        FuncionarioService funcionarioService = new FuncionarioService();
        try {
            Aluno aluno = new Aluno();
            // escrever para add aluno
            JOptionPane.showMessageDialog(null,"Cadastrar o aluno");
            aluno.setNome(JOptionPane.showInputDialog(null,"Coloque o nome do aluno?"));
            aluno.setEmail(JOptionPane.showInputDialog(null,"Coloque o email?"));
            aluno.setSenha(JOptionPane.showInputDialog(null,"Coloque a senha?"));
            /*aluno.setNome("Ana Maria");
            aluno.setEmail("ana@email.com");
            aluno.setSenha("123456");*/
            AlunoController alunoController = new AlunoController();
            alunoController.cadastrar(aluno);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro >>> " + e);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!" + e.getMessage());
        }
        try {
            Funcionario funcionario = new Funcionario();
            JOptionPane.showMessageDialog(null,"Cadastrar o funcionario");
            funcionario.setNome(JOptionPane.showInputDialog(null,"Coloque o nome?"));
            funcionario.setEmail(JOptionPane.showInputDialog(null,"Coloque o email?"));
            funcionario.setSenha(JOptionPane.showInputDialog(null,"Coloque a senha?"));
            /*funcionario.setNome("Ana Maria");
            funcionario.setEmail("ana@email.com");
            funcionario.setSenha("123456"); */
            FuncionarioController funcionarioController = new FuncionarioController();
            funcionarioController.cadastrar(funcionario);
            JOptionPane.showMessageDialog(null, "Cadastrado!");
        } catch (Exception e) {
            System.err.println("Erro >>> " + e);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!" + e.getMessage());
        }

        // update
        try {
            
            Funcionario funcionario = new Funcionario();
            JOptionPane.showMessageDialog(null,"Troca o nome");
            funcionario.setNome(JOptionPane.showInputDialog(null,"Qual novo nome?"));
            funcionario.setEmail(JOptionPane.showInputDialog(null,"Qual novo email?"));
            funcionario.setCargo(JOptionPane.showInputDialog(null,"Qual novo cargo?"));
            funcionarioService.update(funcionario);
            /*funcionario.setId("123456");
            funcionario.setNome("Novo Nome");
            funcionario.setEmail("novoemail@exemplo.com");
            funcionario.setCargo("Novo Cargo");
            funcionarioService.update(funcionario);*/

        } catch (Exception e) {
            e.printStackTrace();
        }
        // remove
        try {
            String id = "YMmF3hl7YRPJrsZD7nEFbOOix3hLUyKeGlHMltP+lS"; 
            funcionarioService.remove(id);
            JOptionPane.showMessageDialog(null, "Removido!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
