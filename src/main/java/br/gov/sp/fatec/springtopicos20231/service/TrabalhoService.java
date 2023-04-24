package br.gov.sp.fatec.springtopicos20231.service;

import br.gov.sp.fatec.springtopicos20231.entity.Trabalho;
import br.gov.sp.fatec.springtopicos20231.repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TrabalhoService implements ITrabalhoService{

    @Autowired
    private TrabalhoRepository trabalhoRepo;


    public Trabalho novoTrabalho(Trabalho trabalho) {
        if(trabalho == null
                 || trabalho.getTitulo() == null
                 || trabalho.getDescricao() == null
                 || trabalho.getGrupo() == null
                 || trabalho.getNota() == null
                 || trabalho.getJustificativa() == null)
        {
            throw new IllegalArgumentException("erro");
        }

                 if(trabalho.getDataHoraEntrega() == null){
                     trabalho.setDataHoraEntrega(LocalDateTime.now());
                 }

            return trabalhoRepo.save(trabalho);
    }


    public List<Trabalho> buscarTodosTrabalhos() {
        return trabalhoRepo.findAll();
    }


    public Trabalho buscarPorId(Long id) {
        Optional<Trabalho> trabalhoOp = trabalhoRepo.findById(id);
        if(trabalhoOp.isEmpty()) {
            throw new IllegalArgumentException("erro");
        }
        return trabalhoOp.get();
    }
}
