
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estoque.model.Categoria;
import com.estoque.model.Fornecedor;
import com.estoque.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    List<Produto> findByNomeContainingIgnoreCase(String nome);
    List<Produto> findByPrecoBetween(Double precoInicial, Double precoFinal);
    List<Produto> findByCategoria(Categoria categoria);
    List<Produto> findByEstoqueGreaterThan(Integer quantidadeMinima);
    List<Produto> findByFornecedor(Fornecedor fornecedor);
   
}