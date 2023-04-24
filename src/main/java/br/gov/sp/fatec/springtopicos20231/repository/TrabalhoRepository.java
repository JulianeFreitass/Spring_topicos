package br.gov.sp.fatec.springtopicos20231.repository;


import br.gov.sp.fatec.springtopicos20231.entity.Trabalho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long> {
    public Trabalho findByTitulo(String titulo);
}
