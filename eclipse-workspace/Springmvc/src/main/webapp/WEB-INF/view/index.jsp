<%
String s =(String) request.getAttribute("hola");
%>

<html>
<body>
<h2>${hola}</h2>
<h2 Style="color:red;"><%=s%></h2>
<h2  Style="color:blue;">${name}</h3>
</body>
</html>
