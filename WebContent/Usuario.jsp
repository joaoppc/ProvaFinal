<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*,insper.edu.br.Controller.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Maquina Caça Níquel</title>
</head>
<body>
<%RandChar rand1 = new RandChar();%>
<%RandChar rand2 = new RandChar();%>
<%RandChar rand3 = new RandChar();%>
<%DAO dao = new DAO();%>
<%int moedas = dao.getMoedas(); %>

<p>Bom dia ${param.usuario } </p>

<p>Simbolos Sorteados:</p>
<%char simb1 = rand1.getSimbol(); %>
<% out.println(simb1); %>
<%char simb2 = rand2.getSimbol(); %>
<% out.println(simb2); %>
<%char simb3 = rand3.getSimbol(); %>
<% out.println(simb3); %>
<br/>
<%if(simb1==simb2 && simb2==simb3 && simb1==simb3){out.println("Parabéns você ganhou!!");moedas+=10;}
	else{out.println("Tente Novamente");moedas--;} %>	
	

<p>Moedas restantes:</p>
<% out.println(moedas); %>
<br/>
<form action="${pageContext.request.contextPath}/myservlet" method="post">
    <input type="submit" name="button" value="Jogue" />
</form>




</body>
</html>