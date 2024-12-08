package com.estoque.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Size(min = 1, max = 200)
    private String nome;

    @Column(nullable = false)
    @Size(min = 1, max = 1000)
    private String descricao;

    @Column(nullable = false)
    private Float preco;

    private Categoria categoria;
    private Fornecedor fornecedor;
    private Integer estoque = 0;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
