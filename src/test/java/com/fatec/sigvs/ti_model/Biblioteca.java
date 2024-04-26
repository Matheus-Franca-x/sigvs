package com.fatec.sigvs.ti_model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Biblioteca 
{
    private List<Livro> livros = new ArrayList<Livro>();

    public void save(Livro l)
    {
        livros.add(l);
    }

    public int size()
    {
        return livros.size();
    }
}
