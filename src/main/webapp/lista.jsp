<%@ page import="java.util.List" %>
<html>
<body>
<h2> LISTA SESC!!</h2>
 <ul>
        <%
            // Recupere a lista de nomes do objeto de solicita��o
            List<String> nomes = (List<String>) request.getAttribute("nomes");
            
            // Itere sobre a lista de nomes e exiba-os
            for (String nome : nomes) {
        %>
            <li><%= nome %></li>
        <%
            }
        %>
</body>
</html>
