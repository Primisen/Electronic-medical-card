<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Учет рентгенологических обследований</title>
    <jsp:include page="../bootstrap.jsp"/>
</head>
<body>

<jsp:include page="../header.jsp"/>
<sec:authorize access="hasAuthority('PATIENT')">
    <jsp:include page="../medical_card_navigation.jsp"/>
</sec:authorize>

<div class="container col-8">

    <h4 class="text-center mt-5 mb-5">Учет рентгенологических обследований</h4>

    <sec:authorize access="hasAuthority('MEDICAL')">

        <div class="p-3  mb-5 mt-5 bg-light border border-1">
            <form:form method="post" modelAttribute="xrayPage">

                <div class="mb-3">
                    <label for="d" class="form-label">Вид исследования</label>
                    <form:input cssClass="form-control" type="text" path="typeOfResearch" id="d" placeholder="Вид исследования"/>
                </div>
                <div class="mb-3">
                    <label for="z" class="form-label">Доза</label>
                    <form:input cssClass="form-control" type="text" path="dose" id="z" placeholder="Доза"/>
                </div>

                <button type="submit" class="btn btn-secondary">Добавить</button>

            </form:form>
        </div>
    </sec:authorize>

    <h4 class="text-center mt-5 mb-5">Таблица рентгенологических обследований</h4>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">
                <h5>Дата</h5>
            </th>
            <th scope="col">
                <h5>Вид исследования</h5>
            </th>
            <th scope="col">
                <h5>Доза</h5>
            </th>
            <th scope="col">
                <h5>Врач</h5>
            </th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="xray" items="${xray}">

            <tr>
                <td>
                    <p><fmt:formatDate value="${xray.recordDate}" pattern="dd.MM.yyyy"/></p>
                </td>
                <td>
                    <p>${xray.typeOfResearch}</p>
                </td>
                <td>
                    <p>${xray.dose}</p>
                </td>
                <td>
                    <p>${xray.medicalWorker.surname} ${xray.medicalWorker.name} ${xray.medicalWorker.patronymic}</p>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</div>
<jsp:include page="../footer.jsp"/>
</body>
</html>
