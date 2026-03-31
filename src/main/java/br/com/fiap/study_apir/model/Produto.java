package br.com.fiap.study_apir.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor //cria construtor para todos com final


public class Produto {
    private final Long id;
    private  final String nome;

    //somente valores monetarios
    private  final BigDecimal valor;
  
    
}


  
