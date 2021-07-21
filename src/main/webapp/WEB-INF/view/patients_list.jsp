<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Список пациентов</title>

    <jsp:include page="bootstrap.jsp"/>
</head>

<body>

<jsp:include page="/WEB-INF/view/header.jsp"/>

<div class="container col-7 mt-5">

    <table class="table table-hover">
        <tbody>
        <c:forEach var="patient" items="${patients}">

            <tr>
                <td>
                    <p>${patient.surname} ${patient.name} ${patient.patronymic}</p>
                </td>

                <td>
                    <div class="d-flex flex-wrap align-item-end justify-content-end justify-content-lg-end">
                        <div class="dropdown justify-content-end">

                            <button class="btn btn-light dropdown-toggle" type="button" id="dropdownMenuButton1"
                                    data-bs-toggle="dropdown" aria-expanded="false">
                                Открыть карту
                            </button>

                            <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1" id="${patient.id}">
                                <li><a class="dropdown-item" href="/personal_page/${patient.id}">Паспортная часть</a>
                                </li>
                                <li><a class="dropdown-item" href="/diagnosis/${patient.id}">Лист для записи
                                    заключительных (уточненных) диагнозов</a></li>

                                <li><a class="dropdown-item" href="/vaccination/${patient.id}">Карта учета
                                    профилактических прививок</a></li>

                                <c:if test="${patient.medicalCard.personalPage.gender.equals('женский')}">
                                <li><a class="dropdown-item" href="/gynecological/${patient.id}">Данные о
                                    гинекологических осмотрах</a></li>
                                </c:if>

                                <li><a class="dropdown-item" href="/disability/${patient.id}">Лист учета временной
                                    нетрудоспособности</a></li>
                                <li><a class="dropdown-item" href="/xray/${patient.id}">Лист учета рентгенологических
                                    обследований</a></li>
                                <li><a class="dropdown-item" href="/anamnesis/${patient.id}">Данные анамнеза и
                                    дополнения к анамнезу</a></li>
                                <li><a class="dropdown-item" href="/medical_examination/${patient.id}">Листы для записи
                                    врачебных осмотров</a></li>
                            </ul>
                        </div>
                    </div>

                </td>
            </tr>

        </c:forEach>
        </tbody>
    </table>


</div>
<%--<jsp:include page="footer.jsp"/>--%>
</body>
</html>
