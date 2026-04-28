package br.com.fiap.study_apir.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity 
@Table(name = "produtos")
@Data  //importa tudo para voce!


public class Produto {


    
    
    public Produto() {


        
    }

    public Produto(Long id, String nome, BigDecimal valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }
@Id
    private Long id;
    private  String nome;

    //somente valores monetarios
    private  BigDecimal valor;
  
    
}




  
