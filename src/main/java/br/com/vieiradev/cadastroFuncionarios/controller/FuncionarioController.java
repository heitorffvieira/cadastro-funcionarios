package br.com.vieiradev.cadastroFuncionarios.controller;

import br.com.vieiradev.cadastroFuncionarios.model.Funcionario;
import br.com.vieiradev.cadastroFuncionarios.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public List<Funcionario> listarFuncionarios() {
        return funcionarioService.listarFuncionarios();
    }

    @GetMapping("/{id}")
    public Funcionario listarPorId(@PathVariable Long id) {
        return funcionarioService.listarIdFuncionario(id);
    }

    @PostMapping
    public Funcionario cadastrarFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioService.cadastrarFuncionario(funcionario);
    }

    @PutMapping("/{id}")
    public Funcionario editarFuncionario(@PathVariable Long id, @RequestBody Funcionario funcionario) {
        return funcionarioService.editarFuncionario(id, funcionario);
    }

    @DeleteMapping("/{id}")
    public void excluirFuncionario(@PathVariable Long id) {
        funcionarioService.excluirFuncionario(id);
    }

}
