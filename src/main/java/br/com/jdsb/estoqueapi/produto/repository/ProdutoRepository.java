package br.com.jdsb.estoqueapi.produto.repository;

import br.com.jdsb.estoqueapi.produto.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
