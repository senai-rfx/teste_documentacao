package br.com.senai.infoa.backend.teste_documentacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.infoa.backend.teste_documentacao.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
