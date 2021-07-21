<%--
  Created by IntelliJ IDEA.
  User: primi
  Date: 15.04.2021
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Лист временной нетрудоспособности</title>
    <jsp:include page="../bootstrap.jsp"/>
</head>
<body>

<jsp:include page="../header.jsp"/>
<sec:authorize access="hasAuthority('PATIENT')">
    <jsp:include page="../medical_card_navigation.jsp"/>
</sec:authorize>


<div class="container col-8">

    <h4 class="text-center mt-5 mb-5">Лист временной нетрудоспособности</h4>

    <sec:authorize access="hasAuthority('MEDICAL')">

        <div class="p-3  mb-5 mt-5 bg-light border border-1">

            <nav class="navbar sticky-top navbar-light bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">Добавление</a>
                </div>
            </nav>

            <form:form method="post" modelAttribute="disabilityPage">

                <div class="mb-3">
                    <label for="d" class="form-label">Диагноз</label>
                    <form:input cssClass="form-control" type="text" path="diagnosis" id="d" placeholder="Диагноз"/>
                </div>

                <div class="mb-3">
                    <label for="n" class="form-label">Количество дней</label>
                    <form:input cssClass="form-control" type="text" path="numberOfDays" id="n" placeholder="Количество дней"/>
                </div>
                <div class="mb-3">
                    <button type="submit" class="btn btn-secondary">Добавить</button>
                </div>
            </form:form>
        </div>
    </sec:authorize>

    <h4 class="text-center mt-5 mb-5">Таблица учета временной нетрудоспособности</h4>

    <table class="table">
        <thead>
        <tr>
            <th>
                <h5>Дата</h5>
            </th>
            <th>
                <h5>Диагноз(причина) временной нетрудоспособности</h5>
            </th>
            <th>
                <h5>Количество дней</h5>
            </th>
            <th>
                <h5>Врач</h5>
            </th>

        </tr>
        </thead>

        <tbody>
        <c:forEach var="disability" items="${disability}">

            <tr>
                <td>
                    <p><fmt:formatDate value="${disability.recordDate}" pattern="dd.MM.yyyy"/></p>
                </td>
                <td>
                    <p>${disability.diagnosis}</p>
                </td>

                <td>
                    <p>${disability.numberOfDays}</p>
                </td>
                <td>
                    <p>${disability.medicalWorker.surname} ${disability.medicalWorker.name} ${disability.medicalWorker.patronymic}</p>
                </td>
            </tr>
        </c:forEach>
        </tbody>

    </table>

</div>
<jsp:include page="../footer.jsp"/>
</body>
</html>
