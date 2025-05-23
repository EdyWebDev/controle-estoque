package com.edy.controleestoque.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity @Table(name = "tb_produtos")
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduto;

    @Column(name = "nome_produto", nullable = false)
    private String nomeProduto;

    @Column(name = "descricao_produto", nullable = false)
    private String descricaoProduto;

    @Column(name = "codigo_barra_produto", nullable = false)
    private String codigoBarraProduto;

    @Column(name = "quantidade_produto", nullable = false)
    private String quantidadeProduto;

    @Column(name = "preco_compra_produto", nullable = false)
    private BigDecimal precoCompraProduto;

    @Column(name = "preco_venda_produto", nullable = false)
    private BigDecimal precoVendaProduto;

    @Column(name = "unidade_medida_produto", nullable = false)
    private String unidadeMedidaProduto; // Ex. cx, litro, unidade
    
}
