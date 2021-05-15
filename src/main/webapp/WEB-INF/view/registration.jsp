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
<div class="container position-relative">
    <div class="container position-absolute top-50 start-50 translate-middle-x " style="max-width: 500px">


        <h3>Регистрация</h3>

        <div class="callout">
            Вы регистрируете электронную медицинскую карту. Для
            регистрации как <b>медицинского работника</b> необходимо получить индивидуальную ссылку регистрации.
        </div>

        <div class="row g-3">

            <form:form method="POST" modelAttribute="medicalCardForm">

                <div class="card border-light mb-3">
                    <div class="card-header">ФИО</div>
                    <div class="card-body">

                        <label class="form-label">Имя</label>
                        <form:input type="text" class="form-control" path="patient.name" placeholder="Имя"
                                    autofocus="true"/>

                        <label class="form-label">Фамилия</label>
                        <form:input type="text" class="form-control" path="patient.surname" placeholder="Фамилия"/>

                        <label class="form-label">Отчество</label>
                        <form:input type="text" class="form-control" path="patient.patronymic" placeholder="Отчество"/>
                    </div>
                </div>

                <div class="card border-light mb-3">
                    <div class="card-header">Адрес</div>
                    <div class="card-body">

                        <label class="form-label">Область</label>
                        <form:input type="text" class="form-control" path="personalPage.address.region"
                                    placeholder="Область"/>

                        <label class="form-label">Район</label>
                        <form:input type="text" class="form-control" path="personalPage.address.district"
                                    placeholder="Район"/>

                        <label class="form-label">Населенный пункт</label>
                        <form:input type="text" class="form-control" path="personalPage.address.locality"
                                    placeholder="Населенный пункт"/>

                        <label class="form-label">Улица</label>
                        <form:input type="text" class="form-control" path="personalPage.address.street"
                                    placeholder="Улица"/>

                        <label class="form-label">Номер дома</label>
                        <form:input type="text" class="form-control" path="personalPage.address.homeNumber"
                                    placeholder="Номер дома"/>

                        <label class="form-label">Корпус</label>
                        <form:input type="text" class="form-control" path="personalPage.address.caseNumber"
                                    placeholder="Корпус"/>

                        <label class="form-label">Номер квартиры</label>
                        <form:input type="text" class="form-control" path="personalPage.address.flatNumber"
                                    placeholder="Номер квартиры"/>
                    </div>
                </div>

                <div class="card border-light mb-3">
                    <div class="card-header">Контактные данные</div>
                    <div class="card-body">

                        <label class="form-label">Номер телефона</label>
                        <form:input type="text" class="form-control" path="personalPage.phoneNumbers"
                                    placeholder="Номер телефона"/>

                        <label class="form-label">Место работы</label>
                        <form:input type="text" class="form-control" path="personalPage.workPlace"
                                    placeholder="Место работы"/>

                        <label class="form-label">Должность</label>
                        <form:input type="text" class="form-control" path="personalPage.position"
                                    placeholder="должность"/>

                        рабочий телефон
                    </div>
                </div>

                <div class="card border-light mb-3">
                    <div class="card-header">Прочее</div>
                    <div class="card-body">

                        <label class="form-label">Дата рождения</label>

                            <%--                <form:input type="text" path="personalPage.dateOfBirth"/>--%>

                        <label class="form-label">Пол</label>

                        <div class="form-check">
                                <%--                            <form:radiobutton path="personalPage.gender" class="form-check-input" value="MAN"--%>
                                <%--                                              name="flexRadioDefault" id="flexRadioDefault1"--%>
                                <%--                            />--%>
                                <%--                            <label class="form-check-label" for="flexRadioDefault1">--%>
                                <%--                                Мужской--%>
                                <%--                            </label>--%>
                            <td>Мужской: <form:radiobutton path="personalPage.gender" value="мужской"/> <br/>
                                Женский: <form:radiobutton path="personalPage.gender" value="женский"/></td>
                        </div>

                            <%--                        <div class="form-check">--%>
                            <%--                            <form:radiobutton path="personalPage.gender" class="form-check-input" type="radio"--%>
                            <%--                                              name="flexRadioDefault" id="flexRadioDefault2"/>--%>
                            <%--                            <label class="form-check-label" for="flexRadioDefault2">--%>
                            <%--                                Женский--%>
                            <%--                            </label>--%>
                            <%--                        </div>--%>
                    </div>
                </div>

                <div class="card border-light mb-3">
                    <div class="card-header">Логин и пароль</div>
                    <div class="card-body">

                        <label class="form-label">Логин</label>
                        <form:input type="text" class="form-control" path="patient.username" placeholder="Логин"/>
                        <form:errors path="patient.username">${usernameError}</form:errors>

                        <label class="form-label">Пароль</label>
                        <form:input type="password" class="form-control" path="patient.password" placeholder="Пароль"/>
                            <%--            <input type="password" class="form-control" id="inputPassword4">--%>

                        <label class="form-label">Повторите пароль</label>
                        <form:input type="password" class="form-control" path="patient.passwordConfirm"
                                    placeholder="Повторите пароль"/>
                        <form:errors path="patient.password">
                            ${passwordError}</form:errors>
                    </div>
                </div>

                <button type="submit" class="btn btn-primary">Зарегестрироваться</button>
            </form:form>


            <%--        <div class="mt-5">--%>
            <%--            todo: кстати, адрес. области можно в бд занести и пользователь будет, отметить, что все поля обязательные--%>
            <%--            ее выбырить, а не вводить,--%>
            <%--            добавить "не работаю"--%>
            <%--            пол надо добавить--%>

            <%--        </div>--%>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>