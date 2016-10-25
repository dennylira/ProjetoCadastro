package br.com.fatec;

import java.util.ArrayList;

public class CDatabase {
    private static ArrayList<Cliente> 
    clientes = new ArrayList<>();            
    
    public static ArrayList<Cliente> getClientes(){
        return clientes;
    }
}
