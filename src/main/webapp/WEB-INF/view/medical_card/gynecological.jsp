<%--
  Created by IntelliJ IDEA.
  User: primi
  Date: 14.04.2021
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Осмотр гинеколога</title>
    <jsp:include page="../bootstrap.jsp"/>
</head>
<body>

<jsp:include page="../header.jsp"/>
<jsp:include page="../menu.jsp"/>

<div class="container">

    <h4 class="text-center mt-5 mb-5">Осмотр гинеколога</h4>

    <sec:authorize access="hasAuthority('MEDICAL')">

        <div class="p-3  mb-5 mt-5 bg-light border border-1">

            <nav class="navbar sticky-top navbar-light bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">Добавление данных осмотра гинеколога</a>
                </div>
            </nav>

            <form:form method="post" modelAttribute="gynecologicalPage">

                <div class="mb-3">
                    <label for="d" class="form-label">Диагноз</label>
                    <form:input cssClass="form-control" type="text" path="diagnosis" id="d" placeholder="Диагноз"/>
                </div>
                <div class="mb-3">
                    <label for="c" class="form-label">Цитология</label>
                    <form:input cssClass="form-control" type="text" path="cytology" id="c" placeholder="Цитология"/>
                </div>
                <div class="mb-3">
                    <button type="submit" class="btn btn-secondary">Добавить</button>
                </div>

            </form:form>

        </div>
    </sec:authorize>

    <h4 class="text-center mt-5 mb-5">Таблица осмотров гинеколога</h4>

    <table class="table mt-5 mb-5">
        <thead>
        <tr>
            <th>
                <h5>Дата</h5>
            </th>
            <th>
                <h5>Диагноз</h5>
            </th>
            <th>
                <h5>Цитология</h5>
            </th>
            <th>
                <h5>Врач</h5>
            </th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="gynecological" items="${gynecological}">

            <tr>
                <td>
                    <p>${gynecological.recordDate}</p>
                </td>
                <td>
                    <p>${gynecological.diagnosis}</p>
                </td>
                <td>
                    <p>${gynecological.cytology}</p>
                </td>
                <td>
                    <p>${gynecological.medicalWorker.surname} ${gynecological.medicalWorker.name} ${gynecological.medicalWorker.patronymic}</p>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
<jsp:include page="../footer.jsp"/>
</body>
</html>
