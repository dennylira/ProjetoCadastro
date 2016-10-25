<%@page import="br.com.fatec.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.fatec.CDatabase"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    ArrayList<Cliente> lista = CDatabase.getClientes();
    if(request.getParameter("incluir") != null){
        Cliente p = new Cliente();
        p.setNome(request.getParameter("nome"));
        p.setCpf(request.getParameter("cpf"));
        p.setRg(request.getParameter("rg"));
        p.setEmail(request.getParameter("email"));
        p.setTelefone(request.getParameter("telefone"));
        p.setEndereco(request.getParameter("endereco"));
        lista.add(p);
        response.sendRedirect(request.getRequestURI()); 
    }
    
    if(request.getParameter("excluir") != null){
        String par = request.getParameter("i");
        int i = Integer.parseInt(par);
        lista.remove(i);
        response.sendRedirect(request.getRequestURI());
    }
%>

<%@ include file="WEB-INF/jspf/header.jspf" %>

<div class="row">
    <div class="form-group col-md-6">
        <h1>Cadastro Cliente</h1>
        <form method="POST">
            <div class="form-group">
                <label for="campo-1">Nome </label>
                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->
                <input name="nome" style='width: 80%' type="text" class="form-control" placeholder="Descreva o campo">
                <label for="campo-1">Cpf </label>
                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->
                <input name="cpf" style='width: 80%' type="text" class="form-control" placeholder="Descreva o campo">
                <label for="campo-1">RG </label>
                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->
                <input name="rg" style='width: 80%' type="text" class="form-control" placeholder="Descreva o campo">
                <label for="campo-1">Email </label>
                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->
                <input name="email" style='width: 80%' type="email" class="form-control" placeholder="Descreva o campo">
                <label for="campo-1">Telefone </label>
                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->
                <input name="telefone" style='width: 80%' type="text" class="form-control" placeholder="Descreva o campo">
                <label for="campo-1">Endereço </label>
                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->
                <input name="endereco" style='width: 80%' type="text" class="form-control" placeholder="Descreva o campo">
            </div>
            
            <input type="submit" name="incluir" class="btn btn-primary" value="Enviar">
        </form>
    </div>
    
    <div class="col-md-6">
        <h1>Lista</h1>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>CPF</th>
                <th>RG</th>
                <th>Email</th>
                <th>Telefone</th>
                <th>Endereco</th>
                <th>Exclusão</th>
            </tr>
            <% for(Cliente p: lista){ %>
            <tr>
                <td><%= lista.indexOf(p) %></td>
                <td><%= p.getNome() %></td>
                <td><%= p.getCpf() %></td>
                <td><%= p.getRg() %></td>
                <td><%= p.getEmail() %></td>
                <td><%= p.getTelefone() %></td>
                <td><%= p.getEndereco() %></td>
                <td>
                    <form>
                        <input type="hidden" name="i" value="<%= lista.indexOf(p) %>"/>
                        <input type="submit" name="excluir" value="Excluir"/>
                    </form>
                </td>
            </tr>
            <% } %>
        </table>
    </div>
</div>
<%@ include file="WEB-INF/jspf/footer.jspf" %>