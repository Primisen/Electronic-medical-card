<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Лист для врачебных записей</title>
    <jsp:include page="../bootstrap.jsp"/>
</head>
<body>

<jsp:include page="../header.jsp"/>
<sec:authorize access="hasAuthority('PATIENT')">
    <jsp:include page="../medical_card_navigation.jsp"/>
</sec:authorize>


<div class="container col-8">
    <h4 class="text-center mt-5 mb-5">Лист для врачебных записей</h4>

    <sec:authorize access="hasAuthority('MEDICAL')">

        <div class="p-3  mb-5 mt-5 bg-light border border-1">

            <nav class="navbar sticky-top navbar-light bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">Добавление записи</a>
                </div>
            </nav>

            <form:form method="post" modelAttribute="medicalExaminationPage">

                <div class="mb-3">
                    <label for="d" class="form-label">Жалобы на</label>
                    <form:input type="text" path="complaints" placeholder="Жалобы на" id="d" cssClass="form-control"/>
                </div>

                <div class="mb-3">
                    <label for="h" class="form-label">Объективно</label>
                    <form:input type="text" path="objectively" placeholder="Объективно" id="h" cssClass="form-control"/>
                </div>
                <div class="mb-3">
                    <label for="d" class="form-label">Диагноз</label>
                    <form:input type="text" path="diagnosis" placeholder="Диагноз" id="d" cssClass="form-control"/>
                </div>
                <div class="mb-3">
                    <label for="d" class="form-label">План обследования</label>
                    <form:input type="text" path="surveyPlan" placeholder="План обследования" id="d"
                                cssClass="form-control"/>
                </div>
                <div class="mb-3">
                    <label for="d" class="form-label">Лечение</label>
                    <form:input type="text" path="treatment" placeholder="Лечение" id="d" cssClass="form-control"/>
                </div>
                <div class="mb-3">
                    <label for="d" class="form-label">АД</label>
                    <form:input type="text" path="ad" placeholder="АД" id="d" cssClass="form-control"/>
                </div>
                <div class="mb-3">
                    <label for="d" class="form-label">Частота сердцебиения</label>
                    <form:input type="text" path="heartRate" placeholder="Частота сердцебиения" id="d"
                                cssClass="form-control"/>
                </div>
                <div class="mb-3">
                    <label for="d" class="form-label">ЧД</label>
                    <form:input type="text" path="bh" placeholder="ЧД" id="d" cssClass="form-control"/>
                </div>

                <div class="mb-3">
                    <button type="submit" class="btn btn-secondary">Добавить</button>
                </div>

            </form:form>
        </div>


    </sec:authorize>

    <table class="table">
        <tbody>

        <c:forEach var="medicalExaminationPage" items="${medicalExamination}">
            <tr>
                <td>
                    <h5>Жалобы на</h5>
                </td>
                <td>${medicalExaminationPage.complaints}</td>

            </tr>

            <tr>
                <td>
                    <h5>Объективно</h5>
                </td>
                <td>${medicalExaminationPage.objectively}</td>

            </tr>

            <tr>
                <td>
                    <h5>Диагноз</h5>
                </td>
                <td>${medicalExaminationPage.diagnosis}</td>
            </tr>

            <tr>
                <td>
                    <h5>План обследования</h5>
                </td>
                <td>${medicalExaminationPage.surveyPlan}</td>
            </tr>

            <tr>
                <td>
                    <h5>Лечение</h5>
                </td>
                <td>${medicalExaminationPage.treatment}</td>
            </tr>

            <tr>
                <td>
                    <h5>АД</h5>
                </td>
                <td>${medicalExaminationPage.ad}</td>
            </tr>

            <tr>
                <td>
                    <h5>Частота сердцебиения</h5>
                </td>
                <td>${medicalExaminationPage.heartRate}</td>
            </tr>

            <tr>
                <td>
                    <h5>ЧД</h5>
                </td>
                <td>${medicalExaminationPage.bh}</td>
            </tr>

            <tr>
                <td>
                    <h5>Дата</h5>
                </td>
                <td><p><fmt:formatDate value="${medicalExaminationPage.recordDate}" pattern="dd.MM.yyyy"/></p></td>
            </tr>

            <tr>
                <td>
                    <h5>Врач</h5>
                </td>
                <td>
                    <p>${medicalExaminationPage.receivingDoctor.surname} ${medicalExaminationPage.receivingDoctor.name} ${medicalExaminationPage.receivingDoctor.patronymic}</p>
                </td>
            </tr>
            <tr>
                <td>
                    <h5>------------</h5>
                </td>
            </tr>
        </c:forEach>

        </tbody>
    </table>

</div>

<jsp:include page="../footer.jsp"/>
</body>
</html>
