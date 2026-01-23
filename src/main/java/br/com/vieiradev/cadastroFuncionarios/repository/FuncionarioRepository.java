package br.com.vieiradev.cadastroFuncionarios.repository;

import br.com.vieiradev.cadastroFuncionarios.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
