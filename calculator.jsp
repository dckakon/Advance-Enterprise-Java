<%-- calculate.jsp : Square Calculator --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
    String input = request.getParameter("number");
    String result = "";
    boolean showResult = false;

    if (input != null && !input.trim().isEmpty()) {
        double number = Double.parseDouble(input.trim());
        double square = number * number;
        result = number + " × " + number + " = " + square;
        showResult = true;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Square Calculator</title>
</head>
<body>

    <h2>Square Calculator</h2>

    <form method="post" action="calculate.jsp">
        Enter a number:
        <input type="number" name="number" value="<%= input != null ? input : "" %>" required />
        <input type="submit" value="Calculate" />
    </form>

    <% if (showResult) { %>
        <p>Result: <strong><%= result %></strong></p>
    <% } %>

</body>
</html>