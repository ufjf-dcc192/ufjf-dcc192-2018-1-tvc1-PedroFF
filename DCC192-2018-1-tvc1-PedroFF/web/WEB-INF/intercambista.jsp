<%@include file="jspf/cabecalho.jspf" %>
<form>
    <div class="form-group">
        <label>Nome: </label>
        <input type="text" class="form-control" required="required" name="nome" placeholder="Digite seu Nome">
    </div>
    <div class="form-group">
        <label>Email: </label>
        <input type="email" class="form-control" required="required" name="email" placeholder="Digite seu email">
    </div>
    <div class="form-group">
        <label>País: </label>
        <input type="text" class="form-control" required="required" name="pais" placeholder="Digite seu país">
    </div>
    <div class="form-group">
        <label>Tempo de estadia: </label>
        <input type="text" class="form-control" required="required" name="est" placeholder="1,2 semanas/ 1,2 semestres">
    </div>
    <button type="submit" class="btn btn-primary">Enviar</button>
    <button type="reset" class="btn btn-secondary">Resetar</button>
</form>
<%@include file="jspf/rodape.jspf" %>
