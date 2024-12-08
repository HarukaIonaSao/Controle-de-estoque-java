package com.estoque.repository; 

import java.util.List;

import org.springframework.stereotype.Repository;

import com.estoque.model.Fornecedor;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor,Long> {
    List<Fornecedor>findAllByNomeContainingIgnoreCase(String nome);
    List<Fornecedor>findAllByContatoContainingIgnoreCase(String nome);
}