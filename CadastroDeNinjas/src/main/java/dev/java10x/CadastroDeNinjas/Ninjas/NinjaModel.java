package dev.java10x.CadastroDeNinjas.Ninjas;

import org.hibernate.annotations.ManyToAny;

import dev.java10x.CadastroDeNinjas.Missões.MissoesModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

// @Entity ele transforma uma classe em uma entidade no Banco de Dados
@Entity  
@Table (name = "tb_cadastro") 
@NoArsConstructor

public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToAny
    @JoinColumn(name = "missoes_id")

    private MissoesModel missoes;
    

    
}
