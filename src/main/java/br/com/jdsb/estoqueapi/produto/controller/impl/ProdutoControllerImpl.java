package br.com.jdsb.estoqueapi.produto.controller.impl;

import br.com.jdsb.estoqueapi.produto.controller.ProdutoController;
import br.com.jdsb.estoqueapi.produto.model.dto.ProdutoDTO;
import br.com.jdsb.estoqueapi.produto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoControllerImpl implements ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @Override
    public ResponseEntity<ProdutoDTO> create(ProdutoDTO dto) {
        return ResponseEntity.ok().body(produtoService.create(dto));
    }

    @Override
    public ResponseEntity<List<ProdutoDTO>> findAll() {
        return ResponseEntity.ok().body(produtoService.findAll());
    }

    @Override
    public ResponseEntity<ProdutoDTO> findById(Long id) {
        return ResponseEntity.ok().body(produtoService.findById(id));
    }

    @Override
    public ResponseEntity<ProdutoDTO> update(Long id,ProdutoDTO dto) {
        return ResponseEntity.ok().body(produtoService.update(id,dto));
    }

    @Override
    public ResponseEntity<ProdutoDTO> delete(Long id) {
        produtoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
