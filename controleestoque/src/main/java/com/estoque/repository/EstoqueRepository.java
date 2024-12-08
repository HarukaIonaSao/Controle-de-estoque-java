package com.estoque.repository; 

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estoque.model.Estoque;
import com.estoque.model.Transacao;

public interface EstoqueRepository extends JpaRepository<Estoque, Long>{
    List<Transacao> findByProdutoId(Integer produto_id);
    List<Transacao> findByNomeContainingIgnoreCase(String nome);
    List<Transacao> findByImgUrl (String imgUrl);
    List<Transacao> findByFornecedor(String fornecedor);
    List<Transacao> findByQuantidadeGreaterThan(Integer quantidade);
    List<Transacao> findByDataBetween(LocalDateTime startDate, LocalDateTime endDate); 
    List<Transacao> findByValidade(LocalDateTime validade);
}