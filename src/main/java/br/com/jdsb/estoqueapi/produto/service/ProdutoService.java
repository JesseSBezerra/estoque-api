package br.com.jdsb.estoqueapi.produto.service;

import br.com.jdsb.estoqueapi.produto.model.dto.ProdutoDTO;

import java.util.List;

public interface ProdutoService {

    public ProdutoDTO create(ProdutoDTO dto);

    public ProdutoDTO findById(Long id);

    public List<ProdutoDTO> findAll();

    public ProdutoDTO update(Long id,ProdutoDTO dto);

    public void delete(Long id);

}
