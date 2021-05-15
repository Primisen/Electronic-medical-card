<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Регистрация</title>
    <jsp:include page="bootstrap.jsp"/>
</head>
<body>

<jsp:include page="header.jsp"/>
<div>
    <form:form method="POST" modelAttribute="userForm">
        <h2>Регистрация</h2>
        <div>
            <form:input type="text" path="name" placeholder="Имя"/>
        </div>
        <div>
            <form:input type="text" path="surname" placeholder="Фамилия"/>
        </div>
        <div>
            <form:input type="text" path="patronymic" placeholder="Отчество"/>
        </div>
        <div>

            <form:input type="text" path="username" placeholder="Логин"
                        autofocus="true"/>
            <form:errors path="username"/>
                ${usernameError}
        </div>
        <div>
            <form:input type="password" path="password" placeholder="Пароль"/>
        </div>
        <div>
            <form:input type="password" path="passwordConfirm"
                        placeholder="Confirm your password"/>
            <form:errors path="password"/>
                ${passwordError}
        </div>
        <button type="submit">Зарегистрироваться</button>
    </form:form>
    <a href="/">Главная</a>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>