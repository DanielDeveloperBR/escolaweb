package br.com.escolaweb.services;

import java.sql.PreparedStatement;

import br.com.escolaweb.model.Pessoa;

public class PessoaService extends DAO {

    public void add(Pessoa pessoa) throws Exception {
        String sql1 = "insert into pessoa (_id, nome, email, data_nasc, senha) values (?,?,?,?,?)";
        Conectar();
        PreparedStatement stman = conn.prepareStatement(sql1);
        stman.setString(1, pessoa.getId());
        stman.setString(2, pessoa.getNome());
        stman.setString(3, pessoa.getEmail());
        stman.setDate(4, null, pessoa.getDataNasc());
        stman.setString(5, pessoa.getSenha());
        stman.execute();
        stman.close();
    }
    public void update(Funcionario funcionario) throws SQLException {
        // atualiza o registro na tabela pessoa
        PessoaService pessoaService = new PessoaService();
        pessoaService.update(funcionario);
    
        // atualiza o registro na tabela funcionario
        String sql = "UPDATE funcionario SET cargo = ? WHERE _id_pessoa = ?";
        Conectar();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, funcionario.getCargo());
        stmt.setString(2, funcionario.getId());
        stmt.executeUpdate();
        stmt.close();
    }
}
