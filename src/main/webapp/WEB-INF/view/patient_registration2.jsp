<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Регистрация</title>
    <jsp:include page="bootstrap.jsp"/>

    <style>

        .callout {
            padding: 20px;
            margin: 20px 0;
            border: 1px solid #eee;
            border-left-width: 5px;
            border-radius: 3px;
            border-left-color: #5bc0de;
        }
    </style>
</head>
<body>

<jsp:include page="header.jsp"/>
<div class="container">

    <h3>Регистрация</h3>

    <div class="callout">
        Вы регистрируете электронную медицинскую карту. Для
        регистрации как <b>медицинского работника</b> необходимо получить индивидуальную ссылку регистрации.
    </div>

    <div class="row g-3 mx-md-5">

        <form:form method="POST" modelAttribute="userForm">

            <div class="col-7">
                <label class="form-label">Имя</label>
                <form:input type="text" class="form-control" path="name" placeholder="Имя"
                            autofocus="true"/>
                <form:errors path="username"/>
            </div>
            <div class="col-7">
                <label class="form-label">Фамилия</label>
                <form:input type="text" class="form-control" path="surname" placeholder="Фамилия"
                            autofocus="true"/>
            </div>
            <div class="col-7">
                <label class="form-label">Отчество</label>
                <form:input type="text" class="form-control" path="patronymic" placeholder="Отчество"
                            autofocus="true"/>
            </div>

            <div class="col-7">
                <label class="form-label">Пол</label>

                <div class="form-check">
                    <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1"
                           checked>
                    <label class="form-check-label" for="flexRadioDefault1">
                        Мужской
                    </label>
                </div>

                <div class="form-check">
                    <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2">
                    <label class="form-check-label" for="flexRadioDefault2">
                        Женский
                    </label>
                </div>
            </div>

            <div class="col-7">
                <label class="form-label">Логин</label>
                <form:input type="text" class="form-control" path="username" placeholder="Логин"
                            autofocus="true"/>
                <form:errors path="username">
                    ${usernameError}</form:errors>
            </div>

            <div class="col-7">
                <label class="form-label">Пароль</label>
                <form:input type="text" class="form-control" path="password" placeholder="Пароль"
                            autofocus="true"/>
                    <%--            <input type="password" class="form-control" id="inputPassword4">--%>
            </div>
            <div class="col-7">
                <label class="form-label">Повторите пароль</label>
                <form:input type="password" class="form-control" path="passwordConfirm"
                            placeholder="Повторите пароль"/>
                <form:errors path="password">
                    ${passwordError}</form:errors>
            </div>


            <div class="col-12 mt-3">
                <button type="submit" class="btn btn-primary">Зарегестрироваться</button>
            </div>
        </form:form>


        <div class="mt-5">
            todo: А нужны ли мне паспортные данные?????; кстати, адрес. области можно в бд занести и пользователь будет
            ее выбырить, а не вводить,
            добавить "не работаю"
            пол надо добавить

        </div>
    </div>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>