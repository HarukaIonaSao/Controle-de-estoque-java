package com.estoque.repository; 

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estoque.model.Transacao;

public interface TransacaoRepository extends JpaRepository<Transacao, Long>{
    List<Transacao> findByProdutoId(Integer produto_id);
    List<Transacao> findByTipo(String tipo);
    List<Transacao> findByQuantidadeGreaterThan(Integer quantidade);
    List<Transacao> findByDataBetween(LocalDateTime startDate, LocalDateTime endDate); 

}