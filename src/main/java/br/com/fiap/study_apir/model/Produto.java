package br.com.fiap.study_apir.model;

import java.math.BigDecimal;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data //importa tudo para voce!


public class Produto {
    private final Long id;
    private  final String nome;

    //somente valores monetarios
    private  final BigDecimal valor;
  
    
}


  
