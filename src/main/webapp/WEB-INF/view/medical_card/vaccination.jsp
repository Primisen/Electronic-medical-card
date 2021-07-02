<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Учет профилактических прививок</title>
    <jsp:include page="../bootstrap.jsp"/>
</head>
<body>

<jsp:include page="../header.jsp"/>
<sec:authorize access="hasAuthority('PATIENT')">
    <jsp:include page="../medical_card_navigation.jsp"/>
</sec:authorize>

<div class="container col-9">

    <h4 class="text-center mt-5 mb-5">Учет профилактических прививок</h4>

    <sec:authorize access="hasAuthority('MEDICAL')">

        <div class="p-3  mb-5 mt-5 bg-light border border-1">

            <nav class="navbar sticky-top navbar-light bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">Добавление данных о профилактических прививках</a>
                </div>
            </nav>

            <form:form method="post" modelAttribute="vaccinationPage">

                <div class="mb-3">
                    <label for="d" class="form-label">Прививка против</label>
                    <form:input cssClass="form-control" type="text" path="vaccinationName" id="d" placeholder="Прививка против"/>
                </div>
                <div class="mb-3">
                    <label for="d" class="form-label">Доза</label>
                    <form:input cssClass="form-control" type="text" path="dose" id="d" placeholder="Доза"/>
                </div>
                <div class="mb-3">
                    <label for="d" class="form-label">Наименование препарата</label>
                    <form:input cssClass="form-control" type="text" path="drugName" id="d" placeholder="Наименование препарата"/>
                </div>
                <div class="mb-3">
                    <label for="d" class="form-label">Серия</label>
                    <form:input cssClass="form-control" type="text" path="series" id="d" placeholder="Серия"/>
                </div>
                <div class="mb-3">
                    <label for="d" class="form-label">Местная реакция</label>
                    <form:input cssClass="form-control" type="text" path="localReaction" id="d" placeholder="Местная реакция"/>
                </div>
                <div class="mb-3">
                    <label for="d" class="form-label">Общая реакция</label>
                    <form:input cssClass="form-control" type="text" path="generalReaction" id="d" placeholder="Общая реакция"/>
                </div>

                <div class="mb-3">
                    <button type="submit" class="btn btn-secondary">Добавить</button>
                </div>

            </form:form>

        </div>
    </sec:authorize>

    <h4 class="text-center mt-5 mb-5">Данные о профилактических прививках</h4>

    <table class="table mt-5 mb-5">
        <thead>
        <tr>
            <th>
                <h5>Дата</h5>
            </th>
            <th>
                <h5>Прививка против</h5>
            </th>
            <th>
                <h5>Доза</h5>
            </th>
            <th>
                <h5>Наименование препарата</h5>
            </th>
            <th>
                <h5>Серия</h5>
            </th>
            <th>
                <h5>Местная реакция</h5>
            </th>
            <th>
                <h5>Обшая реакция</h5>
            </th>
            <th>
                <h5>Врач</h5>
            </th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="vaccination" items="${vaccination}">

            <tr>
                <td>
                    <p><fmt:formatDate value="${vaccination.recordDate}" pattern="dd.MM.yyyy"/></p>
                </td>
                <td>
                    <p>${vaccination.vaccinationName}</p>
                </td>
                <td>
                    <p>${vaccination.dose}</p>
                </td>
                <td>
                    <p>${vaccination.drugName}</p>
                </td>
                <td>
                    <p>${vaccination.series}</p>
                </td>
                <td>
                    <p>${vaccination.localReaction}</p>
                </td>
                <td>
                    <p>${vaccination.generalReaction}</p>
                </td>
                <td>
                    <p>${vaccination.medicalWorker.surname} ${vaccination.medicalWorker.name} ${vaccination.medicalWorker.patronymic}</p>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

<jsp:include page="../footer.jsp"/>
</body>
</html>
