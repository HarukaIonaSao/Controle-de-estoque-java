package com.estoque.repository; 

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estoque.model.Categoria;
import com.estoque.model.Fornecedor;
import com.estoque.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    List<Produto> findByNomeContainingIgnoreCase(String nome);
    List<Produto> findByProdutoId(Integer produto_id);
    List<Produto> findByImgUrl (String imgUrl);
    List<Produto> findByPrecoBetween(Double precoInicial, Double precoFinal);
    List<Produto> findByCategoria(Categoria categoria);
    List<Produto> findByEstoqueGreaterThan(Integer quantidadeMinima);
    List<Produto> findByFornecedor(Fornecedor fornecedor);
    List<Produto> findByEstoqueGreaterThan(String estoque);
    List<Produto> findByDataBetween(LocalDateTime startDate, LocalDateTime endDate); 
    List<Produto> findByLote(String lote);
}
