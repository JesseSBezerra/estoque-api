package br.com.jdsb.estoqueapi.produto.controller;

import br.com.jdsb.estoqueapi.produto.model.dto.ProdutoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/produto")
public interface ProdutoController {

    @PostMapping
    public ResponseEntity<ProdutoDTO> create(@RequestBody ProdutoDTO dto);

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> findAll();

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> findById(@PathVariable Long id);

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoDTO> update(@PathVariable Long id,@RequestBody  ProdutoDTO dto);

    @DeleteMapping("/{id}")
    public ResponseEntity<ProdutoDTO> delete(@PathVariable Long id);
}
