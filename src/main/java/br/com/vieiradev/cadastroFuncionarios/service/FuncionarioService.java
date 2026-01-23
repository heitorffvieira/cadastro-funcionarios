package br.com.vieiradev.cadastroFuncionarios.service;

import br.com.vieiradev.cadastroFuncionarios.exception.FuncionarioException;
import br.com.vieiradev.cadastroFuncionarios.model.Funcionario;
import br.com.vieiradev.cadastroFuncionarios.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Funcionario listarIdFuncionario(Long id) {
        return findFuncionarioOrThrow(id);
    }

    public Funcionario cadastrarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario editarFuncionario(Long id, Funcionario funcionario) {
        findFuncionarioOrThrow(id);
        funcionario.setId(id);
        return funcionarioRepository.save(funcionario);
    }

    public void excluirFuncionario(Long id) {
        findFuncionarioOrThrow(id);
        funcionarioRepository.deleteById(id);
    }

    private Funcionario findFuncionarioOrThrow(Long id) {
        return funcionarioRepository.findById(id).orElseThrow(FuncionarioException::new);
    }

}
