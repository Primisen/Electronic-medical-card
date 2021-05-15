<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Учет профилактических прививок</title>
    <jsp:include page="../bootstrap.jsp"/>
</head>
<body>

<jsp:include page="../header.jsp"/>
<jsp:include page="../menu.jsp"/>


<div class="container">

    <h4 class="text-center mt-4 mb-4">Учет профилактических прививок</h4>

    <div>
        <div class="row">
            <div class="col-2 bg-light border">
                <h5>Дата</h5>
            </div>
            <div class="col bg-light border">
                <h5>Прививка против</h5>
            </div>
            <div class="col bg-light border">
                <h5>Доза</h5>
            </div>
            <div class="col bg-light border">
                <h5>Наименование препарата</h5>
            </div>
            <div class="col bg-light border">
                <h5>Серия</h5>
            </div>
            <div class="col bg-light border">
                <h5>Местная реакция</h5>
            </div>
            <div class="col bg-light border">
                <h5>Общая реакция</h5>
            </div>
            <div class="col-2 bg-light border">
                <h5>Врач</h5>
            </div>
        </div>

        <c:forEach var="vaccination" items="${vaccination}">

            <div class="row">
                <div class="col-2 bg-light border">
                    <p>${vaccination.recordDate}</p>
                </div>
                <div class="col bg-light border">
                    <p>${vaccination.vaccination_name}</p>
                </div>
                <div class="col bg-light border">
                    <p>${vaccination.dose}</p>
                </div>
                <div class="col bg-light border">
                    <p>${vaccination.drugName}</p>
                </div>
                <div class="col bg-light border">
                    <p>${vaccination.series}</p>
                </div>
                <div class="col bg-light border">
                    <p>${vaccination.localReaction}</p>
                </div>
                <div class="col bg-light border">
                    <p>${vaccination.generalReaction}</p>
                </div>
                <div class="col-2 bg-light border">
                    <p>${vaccination.medicalWorker.surname} ${vaccination.medicalWorker.name} ${vaccination.medicalWorker.patronymic}</p>
                </div>
            </div>
        </c:forEach>

        <sec:authorize access="hasAuthority('MEDICAL')">

            <form:form method="post" modelAttribute="vaccinationPage">

                <form:input type="text" path="vaccination_name" placeholder="Прививка против"/>
                <form:input type="text" path="dose" placeholder="Доза"/>
                <form:input type="text" path="drugName" placeholder="Наименование препарата"/>
                <form:input type="text" path="series" placeholder="Серия"/>
                <form:input type="text" path="localReaction" placeholder="Местная реакция"/>
                <form:input type="text" path="generalReaction" placeholder="Общая реакция"/>

                todo: это добавляется в один день, в одну запись? или по частям

                <button type="submit">Добавить</button>

            </form:form>
        </sec:authorize>

    </div>

</div>
<jsp:include page="../footer.jsp"/>
</body>
</html>
