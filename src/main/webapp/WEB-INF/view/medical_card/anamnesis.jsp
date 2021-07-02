<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Анамнез</title>
    <jsp:include page="../bootstrap.jsp"/>
</head>
<body>

<jsp:include page="../header.jsp"/>
<sec:authorize access="hasAuthority('PATIENT')">
    <jsp:include page="../medical_card_navigation.jsp"/>
</sec:authorize>

<div class="container col-8">
    <h4 class="text-center mt-5 mb-5">Данные анамнеза и дополнения к анамнезу</h4>

    <table class="table">
        <tbody>

        <c:forEach var="anamnesisPage" items="${anamnesis}">

            <tr>
                <td>
                    <h5>Перенесенные заболевания, операции</h5>
                </td>
                <td>${anamnesisPage.operations}</td>

            </tr>

            <tr>
                <td>
                    <h5>Наследственность</h5>
                </td>
                <td>${anamnesisPage.heredity}</td>

            </tr>

            <tr>
                <td>
                    <h5>Медикаментозная аллергия</h5>
                </td>
                <td>${anamnesisPage.drugAllergy}</td>
            </tr>

            <tr>
                <td>
                    <h5>Факторы риска</h5>
                </td>
                <td>${anamnesisPage.riskFactors}</td>
            </tr>

            <tr>
                <td>
                    <h5>Вредные и опасные условия труда</h5>
                </td>
                <td>${anamnesisPage.harmfulAndHazardousWorkingConditions}</td>
            </tr>

            <tr>
                <td>
                    <h5>Краткие сведения об основном заболевании</h5>
                </td>
                <td>${anamnesisPage.briefInformationAboutTheMainDisease}</td>
            </tr>

            <tr>
                <td>
                    <h5>Прочие сведения</h5>
                </td>
                <td>${anamnesisPage.otherInformation}</td>
            </tr>

            <%--        <tr>--%>
            <%--            <td>--%>
            <%--                <h5>Дата взятия на "Д" учет</h5>--%>
            <%--            </td>--%>
            <%--            <td>${anamnesisPage.dateOfRegistrationOnDispensaryGroup}</td>--%>
            <%--        </tr>--%>

            <tr>
                <td>
                    <h5>Дата</h5>
                </td>
                <p><fmt:formatDate value="${anamnesisPage.recordDate}" pattern="dd.MM.yyyy"/></p>

            </tr>

            <tr>
                <td>
                    <h5>Врач</h5>
                </td>
                <td>
                    <p>${anamnesisPage.medicalWorker.surname} ${anamnesisPage.medicalWorker.name} ${anamnesisPage.medicalWorker.patronymic}</p>
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

    <sec:authorize access="hasAuthority('MEDICAL')">

        <div class="p-3  mb-5 mt-5 bg-light border border-1">

            <nav class="navbar sticky-top navbar-light bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">Дополнение анамнеза</a>
                </div>
            </nav>

            <form:form method="post" modelAttribute="anamnesisPage">

                <div class="mb-3">
                    <label for="d" class="form-label">Перенесенные заболевания, операции</label>
                    <form:input type="text" path="operations" placeholder="Перенесенные заболевания, операции" id="d"
                                cssClass="form-control"/>
                </div>

                <div class="mb-3">
                    <label for="h" class="form-label">Наследственность</label>
                    <form:input type="text" path="heredity" placeholder="Наследственность" id="h"
                                cssClass="form-control"/>
                </div>
                <div class="mb-3">
                    <label for="d" class="form-label">Медикаментозная аллергия</label>
                    <form:input type="text" path="drugAllergy" placeholder="Медикаментозная аллергия" id="d"
                                cssClass="form-control"/>
                </div>
                <div class="mb-3">
                    <label for="d" class="form-label">Факторы риска</label>
                    <form:input type="text" path="riskFactors" placeholder="Факторы риска" id="d"
                                cssClass="form-control"/>
                </div>
                <div class="mb-3">
                    <label for="d" class="form-label">Вредные и опасные условия труда</label>
                    <form:input type="text" path="harmfulAndHazardousWorkingConditions"
                                placeholder="Вредные и опасные условия труда" id="d" cssClass="form-control"/>
                </div>
                <div class="mb-3">
                    <label for="d" class="form-label">Краткие сведения об основном заболевании</label>
                    <form:input type="text" path="briefInformationAboutTheMainDisease"
                                placeholder="Краткие сведения об основном заболевании" id="d" cssClass="form-control"/>
                </div>
                <div class="mb-3">
                    <label for="d" class="form-label">Прочие сведения</label>
                    <form:input type="text" path="otherInformation" placeholder="Прочие сведения" id="d"
                                cssClass="form-control"/>
                </div>
                <%--                <div class="mb-3">--%>
                <%--                    <label for="d" class="form-label">Дата взятия на "Д" учет</label>--%>
                <%--                    <form:input type="text" path="dateOfRegistrationOnDispensaryGroup"--%>
                <%--                                placeholder="Дата взятия на Д учет" id="d" cssClass="form-control"/>--%>
                <%--                </div>--%>

                <div class="mb-3">
                    <button type="submit" class="btn btn-secondary">Добавить</button>
                </div>

            </form:form>
        </div>
    </sec:authorize>

</div>
<jsp:include page="../footer.jsp"/>

</body>
</html>
