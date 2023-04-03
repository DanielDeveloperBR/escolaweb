package br.com.escolaweb.controller;

import br.com.escolaweb.model.Funcionario;
import br.com.escolaweb.services.FuncionarioService;
public class FuncionarioController {
    public void cadastrar(Funcionario funcionario) throws Exception{
        if(funcionario.getNome().equalsIgnoreCase(null)){
            throw new Exception("Nome em branco!");
        }
        if(funcionario.getEmail().equals(null)){
            throw new Exception("Email inválido!");
        } else if (funcionario.getEmail().indexOf("@") == -1 || funcionario.getEmail().indexOf(".") == -1){
            throw new Exception("E-mail inválido!");
        }
        /* if(aluno.getDataNasc().equals(null)){
            throw new Exception("Data de nascimento em branco!");
        } */
        if (funcionario.getSenha().equals(null)) {
            throw new Exception("Senha em branco!");
        }

        FuncionarioService funcioanrioservice = new FuncionarioService();
        funcioanrioservice.addProf(funcionario);
    }
}
