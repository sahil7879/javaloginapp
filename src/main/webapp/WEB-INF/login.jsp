<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login Page</h2>
    <form action="/login" method="post">
        <label for="username">Username: </label>
        <input type="text" id="username" name="username"><br>
        <label for="password">Password: </label>
        <input type="password" id="password" name="password"><br>
        <input type="submit" value="Login">
    </form>

    <c:if test="${not empty error}">
        <div style="color: red;">
            ${error}
        </div>
    </c:if>
</body>
</html>
