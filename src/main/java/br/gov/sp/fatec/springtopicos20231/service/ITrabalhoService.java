package br.gov.sp.fatec.springtopicos20231.service;

import br.gov.sp.fatec.springtopicos20231.entity.Trabalho;

import java.util.List;

public interface ITrabalhoService {

    public Trabalho novoTrabalho(Trabalho trabalho);

    public List<Trabalho> buscarTodosTrabalhos();

    public Trabalho buscarPorId(Long id);
}
