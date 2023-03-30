package br.com.escolaweb.controller;

import br.com.escolaweb.model.Aluno;
import br.com.escolaweb.services.AlunoService;

public class AlunoController {
    public void cadastrar(Aluno aluno) throws Exception{
        if(aluno.getNome().equalsIgnoreCase(null)){
            throw new Exception("Nome em branco!");
        }
        if(aluno.getEmail().equals(null)){
            throw new Exception("Email inválido!");
        } else if (aluno.getEmail().indexOf("@") == -1 || aluno.getEmail().indexOf(".") == -1){
            throw new Exception("E-mail inválido!");
        }
        /* if(aluno.getDataNasc().equals(null)){
            throw new Exception("Data de nascimento em branco!");
        } */
        if (aluno.getSenha().equals(null)) {
            throw new Exception("Senha em branco!");
        }

        AlunoService alunoservice = new AlunoService();
        alunoservice.add(aluno);
    }
}
