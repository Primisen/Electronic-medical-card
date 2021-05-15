<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Учет рентгенологических обследований</title>
    <jsp:include page="../bootstrap.jsp"/>
</head>
<body>

<jsp:include page="../header.jsp"/>
<jsp:include page="../menu.jsp"/>


<div class="container">

    <h4 class="text-center mt-5 mb-5">Учет рентгенологических обследований</h4>

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
                    <p>${xray.recordDate}</p>
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

    <sec:authorize access="hasAuthority('MEDICAL')">

        <form:form method="post" modelAttribute="xrayPage">

            <form:input type="text" path="typeOfResearch" placeholder="Вид исследования"/>
            <form:input type="text" path="dose" placeholder="Доза"/>

            <button type="submit">Добавить</button>

        </form:form>
    </sec:authorize>

</div>

</div>
<jsp:include page="../footer.jsp"/>
</body>
</html>
