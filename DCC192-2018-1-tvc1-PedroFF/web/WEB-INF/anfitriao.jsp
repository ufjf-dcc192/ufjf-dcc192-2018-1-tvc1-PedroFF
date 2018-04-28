<%@page import="ufjf.br.dcc192.Anfitriao"%>
<%@page import="ufjf.br.dcc192.ListaDeAnfitriao"%>
<%@include file="jspf/cabecalho.jspf" %>
<form>
    <div class="form-group">
        <label>Nome: </label>
        <input type="text" class="form-control" required="required" name="nome" placeholder="Digite seu Nome">
    </div>
    <div class="form-group">
            <label>Categoria: </label>
            <input type="text" class="form-control" required="required" name="cat" placeholder="Docente/Discente/TAE/Tercerizado">
    </div>
    <div class="form-group">
        <label>Disponibilidade para hospedar: </label>
        <input type="text" class="form-control" required="required" name="disp" placeholder="1,2 semanas/ 1,2 semestres">
        <input type="hidden" value="anfitriao" name="anfitriao"/>
    </div>
    <button type="submit" class="btn btn-primary">Enviar</button>
    <button type="reset" class="btn btn-secondary">Resetar</button>
</form>

<%@include file="jspf/rodape.jspf" %>
