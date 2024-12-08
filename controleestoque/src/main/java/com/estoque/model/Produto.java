package com.estoque.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String imgUrl;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private Float preco;

    @Column(nullable = false)
    private Categoria categoria;

    @Column(nullable = false)
    private Fornecedor fornecedor;

    @Column(nullable = false)
    private Integer estoque = 0;

    @Column(nullable = false)
    private String lote;

    @Column(nullable = false)
    private LocalDateTime validade;


    /*Get e Set */
    // Getter para id
    public Long getId() {
        return id;
    }

     // Setter para id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

     // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

     // Getter para descricao
     public String getDescricao() {
        return descricao;
    }

    // Setter para descricao
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter para preco
    public Float getPreco() {
        return preco;
    }

    // Setter para preco
    public void setPreco(Float preco) {
        this.preco = preco;
    }

    // Getter para categoria
    public Categoria getCategoria() {
        return categoria;
    }

    // Setter para categoria
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Getter para fornecedor
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    // Setter para fornecedor
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    // Getter para estoque
    public Integer getEstoque() {
        return estoque;
    }

    // Setter para estoque
    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    // Getter para validade
    public String getValidade() {
        return validade;
    }

     // Setter para validade
    public void setValidade(String validade) {
        this.validade = validade;
    }
    // Getter para lote
    public String getLote() {
        return lote;
    }

     // Setter para lote
    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
