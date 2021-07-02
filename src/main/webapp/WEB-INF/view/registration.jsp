<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Регистрация медицинского работника</title>
    <jsp:include page="bootstrap.jsp"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">

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
<div class=" position-relative mt-5 start-50 translate-middle-x" style="max-width: 500px">

    <h3>Регистрация</h3>

    <div class="callout">
        Вы регистрируете электронную медицинскую карту. Для
        регистрации как <b>медицинского работника</b> необходимо нажать <a href="/medical-registration"> сюда</a>
    </div>

    <div class="row g-3">
        <form:form method="POST" modelAttribute="medicalCardForm">

            <div class="card border-light mb-3">
                <div class="card-header">ФИО</div>
                <div class="card-body">

                    <label class="form-label">Имя</label>
                    <form:input type="text" cssClass="form-control" path="patient.name" placeholder="Имя"
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

                    <form:select path="personalPage.address.region" cssClass="form-select">
                        <form:option value="Брестская"/>
                        <form:option value="Витебская"/>
                        <form:option value="Гомельская"/>
                        <form:option value="Гродненская"/>
                        <form:option value="Минская"/>
                        <form:option value="Могилевская"/>
                    </form:select>

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

                    <label class="form-label">Корпус </label>
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

                </div>
            </div>

            <div class="card border-light mb-3">
                <div class="card-header">Дата рождения</div>
                <div class="card-body">

                    <label class="form-label">День</label>
                    <form:input type="number" path="personalPage.dateOfBirth.date" class="form-control" name="day" value="1"/>

                    <label class="form-label">Месяц (число)</label>
                    <form:input type="number" path="personalPage.dateOfBirth.month" class="form-control" name="month" value="1"/>

                    <label class="form-label">Год</label>
                    <form:input type="number" path="personalPage.dateOfBirth.year" class="form-control" name="year" value="2000"/>

                </div>
            </div>
            <div class="card border-light mb-3">
                <div class="card-header">Пол</div>
                <div class="card-body">

                    <div class="form-check">
                        <td>Мужской: <form:radiobutton path="personalPage.gender" value="мужской"/> <br/>
                            Женский: <form:radiobutton path="personalPage.gender" value="женский"/></td>
                    </div>

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

                    <label class="form-label">Повторите пароль</label>
                    <form:input type="password" class="form-control" path="patient.passwordConfirm"
                                placeholder="Повторите пароль"/>
                    <form:errors path="patient.password">
                        ${passwordError}</form:errors>
                </div>
            </div>

            <button type="submit" class="btn btn-primary">Зарегестрироваться</button>

        </form:form>


<%--        todo:  отметить, что все поля обязательные--%>

    </div>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>