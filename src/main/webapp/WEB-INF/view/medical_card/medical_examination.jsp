<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Лист для врачебных записей</title>
    <jsp:include page="../bootstrap.jsp"/>
</head>
<body>

<jsp:include page="../header.jsp"/>
<jsp:include page="../menu.jsp"/>


<div class="container">

    <h4 class="text-center mt-4 mb-4">Лист для врачебных записей</h4>

<c:forEach var="medicalExamination" items="${medicalExamination}">

<div>
        <div class="row">
            <div class="col-2">
                <h5>Жалобы на</h5>
            </div>
            <div class="col">${medicalExamination.complaints}</div>
        </div>

        <div class="row">
            <div class="col-2">
                <h5>Объективно</h5>
            </div>
            <div class="col">${medicalExamination.objectively}</div>
        </div>

        <div class="row">
            <div class="col-2">
                <h5>Диагноз</h5>
            </div>
            <div class="col">${medicalExamination.diagnosis}</div>
        </div>

        <div class="row">
            <div class="col-2">
                <h5>План обследования</h5>
            </div>
            <div class="col">${medicalExamination.surveyPlan}</div>
        </div>

        <div class="row">
            <div class="col-2">
                <h5>Лечение</h5>
            </div>
            <div class="col">${medicalExamination.treatment}</div>
        </div>

        <div class="row">
            <div class="col-2">
                <h5>АД</h5>
            </div>
            <div class="col">${medicalExamination.ad}</div>
        </div>

        <div class="row">
            <div class="col-2">
                <h5>Частота сердцебиения</h5>
            </div>
            <div class="col">${medicalExamination.heartRate}</div>
        </div>

        <div class="row">
            <div class="col-2">
                <h5>ЧД</h5>
            </div>
            <div class="col">${medicalExamination.bh}</div>
        </div>

        <div class="row">
            <div class="col-2">
                <h5>Дата</h5>
            </div>
            <div class="col">${medicalExamination.recordDate}</div>
        </div>

        <div class="row">
            <div class="col-2">
                <h5>Врач</h5>
            </div>
            <div class="col">${medicalExamination.receivingDoctor}</div>
        </div>
    </div>

</c:forEach>

    <sec:authorize access="hasAuthority('MEDICAL')">

        <form:form method="post" modelAttribute="medicalExaminationPage">

            <form:input type="text" path="complaints" placeholder="Жалобы на "/>
            <form:input type="text" path="objectively" placeholder="Объективно"/>
            <form:input type="text" path="diagnosis" placeholder="Диагноз"/>
            <form:input type="text" path="surveyPlan" placeholder="План обследования"/>
            <form:input type="text" path="treatment" placeholder="Лечение"/>
            <form:input type="text" path="ad" placeholder="АД"/>
            <form:input type="text" path="heartRate" placeholder="Частота сердцебиения"/>
            <form:input type="text" path="bh" placeholder="ЧД"/>

            <button type="submit">Добавить</button>

        </form:form>
    </sec:authorize>

</div>
<jsp:include page="../footer.jsp"/>
</body>
</html>
