<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Личная информация</title>
    <jsp:include page="../bootstrap.jsp"/>
</head>
<body>

<jsp:include page="../header.jsp"/>

<sec:authorize access="hasAuthority('PATIENT')">
    <jsp:include page="../medical_card_navigation.jsp"/>
</sec:authorize>

<div class="container col-8">
    <h4 class="text-center mt-5 mb-5">Медицинская карта амбулаторного больного № ${personalPage.id}</h4>

    <c:set scope="request" value="${personalPage}" var="personalPage"/>

    <table class="table">
        <tbody>

        <tr>
            <td>
                <h5>ФИО</h5>
            </td>
            <td>${personalPage.surname} ${personalPage.name} ${personalPage.patronymic}</td>
        </tr>

        <tr>
            <td>
                <h5>Пол</h5>
            </td>
            <td>${personalPage.gender}</td>
        </tr>

        <tr>
            <td>
                <h5>Дата рождения</h5>
            </td>
            <td>
                <fmt:formatDate value="${personalPage.birthday}" pattern="dd.MM.YYYY"/>
            </td>
        </tr>

        <tr>
            <td>
                <h5>Телефон</h5>
            </td>
            <td>${personalPage.phoneNumber}</td>
        </tr>

        <tr>
            <td>
                <h5>Адрес</h5>
            </td>
            <td>${personalPage.address.region} область,
                ${personalPage.address.district} район,
                ${personalPage.address.locality},
                улица ${personalPage.address.street},
                дом № ${personalPage.address.homeNumber},
                корпус ${personalPage.address.caseNumber},
                квартира ${personalPage.address.flatNumber}
            </td>
        </tr>

        </tbody>
    </table>

</div>

<jsp:include page="../footer.jsp"/>
</body>
</html>