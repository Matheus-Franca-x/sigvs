package com.fatec.sigvs.ti_model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Req01CadastrarLivro 
{
    Biblioteca biblioteca;
    @Test
    public void ct01_cadastrar_livro_com_sucesso()
    {
        //dado que o usuário entrou com as informações do livro
        biblioteca = new Biblioteca();
        Livro livro = new Livro("Engenharia de Software", "Pressman");
        //quando o usuário confirma a operação
        biblioteca.save(livro);
        //então o livro fica disponível para consulta
        assertEquals(1, biblioteca.size());
        
    }
}
