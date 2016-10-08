<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="WEB-INF/header.jspf" %>
<h1>Cadastro Cliente</h1>
<div class="row">
    <div class="form-group">
        <form method="POST">
            <div class="form-group">
                <label for="campo-1">Nome </label>
                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->
                <input style='width: 80%' type="text" class="form-control" placeholder="Descreva o campo">
                <label for="campo-1">Cpf </label>
                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->
                <input style='width: 80%' type="number" class="form-control" placeholder="Descreva o campo">
                <label for="campo-1">RG </label>
                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->
                <input style='width: 80%' type="text" class="form-control" placeholder="Descreva o campo">
                <label for="campo-1">Email </label>
                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->
                <input style='width: 80%' type="email" class="form-control" placeholder="Descreva o campo">
                <label for="campo-1">Telefone </label>
                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->
                <input style='width: 80%' type="text" class="form-control" placeholder="Descreva o campo">
                <label for="campo-1">Logradouro </label>
                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->
                <input style='width: 80%' type="text" class="form-control" placeholder="Descreva o campo">
                <label for="campo-1">Cidade </label>
                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->
                <input style='width: 80%' type="text" class="form-control" placeholder="Descreva o campo">
                <label for="campo-1">Estado</label>
                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->
                <input style='width: 80%' type="text" class="form-control" placeholder="Descreva o campo">
            </div>
            
            <input type="submit" class="btn btn-primary" value="Enviar">
        </form>
    </div>
</div>
<%@ include file="WEB-INF/footer.jspf" %>