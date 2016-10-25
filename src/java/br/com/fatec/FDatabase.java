package br.com.fatec;

import java.util.ArrayList;

public class FDatabase {
    private static ArrayList<Fornecedor> 
    fornecedores = new ArrayList<>();            
    
    public static ArrayList<Fornecedor> getFornecedores(){
        return fornecedores;
    }
}
