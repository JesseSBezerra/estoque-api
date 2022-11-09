package br.com.jdsb.estoqueapi.produto.model.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO {
    private Long id;
    private String dsProduto;
    private BigDecimal vlCusto;
}
