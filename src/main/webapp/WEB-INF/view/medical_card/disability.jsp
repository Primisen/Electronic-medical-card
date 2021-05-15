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
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Лист временной нетрудоспособности</title>
    <jsp:include page="../bootstrap.jsp"/>
</head>
<body>

<jsp:include page="../header.jsp"/>
<jsp:include page="../menu.jsp"/>


<div class="container">

    <h4 class="text-center mt-4 mb-4">Лист временной нетрудоспособности</h4>

    <div>
        <div class="row">
            <div class="col-2 bg-light border">
                <h5>Дата</h5>
            </div>
            <div class="col bg-light border">
                <h5>Диагноз(причина) временной нетрудоспособности</h5>
            </div>
            <div class="col bg-light border">
                <h5>Дата закрытия</h5>
            </div>
            <div class="col bg-light border">
                <h5>Количество дней</h5>
            </div>
            <div class="col-2 bg-light border">
                <h5>Врач</h5>
            </div>
        </div>

        <c:forEach var="disability" items="${disability}">

            <div class="row">
                <div class="col-2 bg-light border">
                    <p>${disability.beginDate}</p>
                </div>
                <div class="col bg-light border">
                    <p>${disability.diagnosis}</p>
                </div>
                <div class="col bg-light border">
                    <p>${disability.endDate}</p>
                </div>
                <div class="col bg-light border">
                    <p>${disability.numberOfDays}</p>
                </div>
                <div class="col-2 bg-light border">
                    <p>${disability.medicalWorker.surname} ${disability.medicalWorker.name} ${disability.medicalWorker.patronymic}</p>
                </div>
            </div>
        </c:forEach>

        <sec:authorize access="hasAuthority('MEDICAL')">

            <form:form method="post" modelAttribute="disabilityPage">

                <form:input type="text" path="diagnosis" placeholder="Диагноз"/>
                <form:input type="text" path="endDate" placeholder="Дата закрытия"/>
                <form:input type="text" path="numberOfDays" placeholder="Количество дней"/>

                <button type="submit">Добавить</button>

            </form:form>
        </sec:authorize>

    </div>

</div>
<jsp:include page="../footer.jsp"/>
</body>
</html>
