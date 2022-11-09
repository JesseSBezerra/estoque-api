package br.com.jdsb.estoqueapi.produto.service.impl;

import br.com.jdsb.estoqueapi.produto.model.dto.ProdutoDTO;
import br.com.jdsb.estoqueapi.produto.model.entity.Produto;
import br.com.jdsb.estoqueapi.produto.repository.ProdutoRepository;
import br.com.jdsb.estoqueapi.produto.service.ProdutoService;
import br.com.jdsb.estoqueapi.produto.service.exception.ProdutoNaoEncontradoException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public ProdutoDTO create(ProdutoDTO dto) {
        return mapper.map(produtoRepository.save(mapper.map(dto, Produto.class)),ProdutoDTO.class);
    }

    @Override
    public ProdutoDTO findById(Long id) {
        return mapper.map(produtoRepository.findById(id)
                .orElseThrow(() -> new ProdutoNaoEncontradoException("Produto Não Encontrado")),ProdutoDTO.class);
    }

    @Override
    public List<ProdutoDTO> findAll() {
        return produtoRepository.findAll()
                .stream().map(produto -> mapper.map(produto,ProdutoDTO.class)).collect(Collectors.toList());
    }

    @Override
    public ProdutoDTO update(Long id,ProdutoDTO dto) {
        dto.setId(id);
        return mapper.map(produtoRepository.save(mapper.map(dto, Produto.class)),ProdutoDTO.class);
    }

    @Override
    public void delete(Long id) {
      produtoRepository.deleteById(id);
    }
}
