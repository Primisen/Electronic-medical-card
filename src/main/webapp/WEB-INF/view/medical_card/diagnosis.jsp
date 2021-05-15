<%--
  Created by IntelliJ IDEA.
  User: primi
  Date: 14.04.2021
  Time: 10:56
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
    <title>Постановка диагноза</title>
    <jsp:include page="../bootstrap.jsp"/>
</head>
<body>

<jsp:include page="../header.jsp"/>
<jsp:include page="../menu.jsp"/>

<div class="container col-8">

    <h4 class="text-center mt-5 mb-5">Лист для записи заключительных (уточненных) диагнозов</h4>

    <sec:authorize access="hasAuthority('MEDICAL')">

        <div class="p-3  mb-5 mt-5 bg-light border border-1">

            <nav class="navbar sticky-top navbar-light bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">Добавление диагноза</a>
                </div>
            </nav>

            <form:form method="post" modelAttribute="diagnosisPage">

                <div class="mb-3">
                    <label for="d" class="form-label">Диагноз</label>
                    <form:input type="text" path="diagnosisName" placeholder="Диагноз" id="d" cssClass="form-control"/>
                </div>

                <div class="mb-3">
                    <form:checkbox cssClass="form-check-input" path="newlyDiagnosed" id="n" value="Magic"/>
                    <label for="n" class="form-label">Впервые установленный диагноз </label>
                </div>

                <div class="mb-3">
                    <button type="submit" class="btn btn-secondary">Добавить</button>
                </div>

            </form:form>
        </div>


    </sec:authorize>

    <h4 class="text-center mt-5 mb-5">Таблица заключительных (уточненных) диагнозов</h4>

    <table class="table mt-5 mb-5">

        <thead>
        <tr>
            <th scope="col">
                <h5>Дата обращения</h5>
            </th>
            <th scope="col">
                <h5>Заключительный (уточненный) диагноз</h5>
            </th>
            <th scope="col">
                <h5>Впервые установленные диагнозы</h5>
            </th>
            <th scope="col">
                <h5>Врач</h5>
            </th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="diagnosis" items="${diagnoses}">

            <tr>
                <td>
                    <p>${diagnosis.recordDate}</p>
                </td>
                <td>
                    <p>${diagnosis.diagnosisName}</p>
                </td>
                <td>
                    <c:if test="${diagnosis.newlyDiagnosed == true}">
                        <p>Да</p>
                    </c:if>
                    <c:if test="${diagnosis.newlyDiagnosed == false}">
                        <p>Нет</p>
                    </c:if>
                </td>
                <td>
                    <p>${diagnosis.medicalWorker.surname} ${diagnosis.medicalWorker.name} ${diagnosis.medicalWorker.patronymic}</p>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


    <%--    <sec:authorize access="hasAuthority('MEDICAL')">--%>

    <%--        <div class="p-3  mb-5 mt-5 bg-light border border-4">--%>

    <%--            <nav class="navbar sticky-top navbar-light bg-light">--%>
    <%--                <div class="container-fluid">--%>
    <%--                    <a class="navbar-brand" href="#">Добавление диагноза</a>--%>
    <%--                </div>--%>
    <%--            </nav>--%>

    <%--            <form:form method="post" modelAttribute="diagnosisPage">--%>

    <%--                <div class="mb-3">--%>
    <%--                    <label for="d" class="form-label">Диагноз</label>--%>
    <%--                    <form:input type="text" path="diagnosisName" placeholder="Диагноз" id="d" cssClass="form-control"/>--%>
    <%--                </div>--%>

    <%--                <div class="mb-3">--%>
    <%--                    <label for="n" class="form-label">Впервые установленный диагноз</label>--%>
    <%--                    <form:select path="newlyDiagnosed" class="form-select" id="n" aria-label="Default select example">--%>
    <%--                        <form:option value="true">Да</form:option>--%>
    <%--                        <form:option value="false">Нет</form:option>--%>
    <%--                    </form:select>--%>
    <%--                </div>--%>

    <%--                <div class="mb-3">--%>
    <%--                    <button type="submit" class="btn btn-secondary">Добавить</button>--%>
    <%--                </div>--%>


    <%--            </form:form>--%>
    <%--        </div>--%>


    <%--    </sec:authorize>--%>

</div>

<jsp:include page="../footer.jsp"/>
</body>
</html>
