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
    <title>Личная информация</title>
    <jsp:include page="../bootstrap.jsp"/>
</head>
<body>

<jsp:include page="../header.jsp"/>
<sec:authorize access="hasAuthority('PATIENT')">
    <jsp:include page="../medical_card_navigation.jsp"/>
</sec:authorize>
<td class="container">

    <%--    <div class="container">--%>
    <%--    <nav aria-label="breadcrumb">--%>
    <%--        <ol class="breadcrumb">--%>
    <%--            <li class="breadcrumb-item active" aria-current="page">Личная информация</li>--%>
    <%--        </ol>--%>
    <%--    </nav>--%>

    <%--    <nav aria-label="breadcrumb">--%>
    <%--        <ol class="breadcrumb">--%>
    <%--            <li class="breadcrumb-item"><a href="#">Home</a></li>--%>
    <%--            <li class="breadcrumb-item active" aria-current="page">Library</li>--%>
    <%--        </ol>--%>
    <%--    </nav>--%>

    <%--    <nav aria-label="breadcrumb">--%>
    <%--        <ol class="breadcrumb">--%>
    <%--            <li class="breadcrumb-item"><a href="#">Home</a></li>--%>
    <%--            <li class="breadcrumb-item"><a href="#">Library</a></li>--%>
    <%--            <li class="breadcrumb-item active" aria-current="page">Data</li>--%>
    <%--        </ol>--%>
    <%--    </nav>--%>

    <div class="container col-8">
        <h4 class="text-center mt-5 mb-5">Медицинская карта амбулаторного больного № ${id}</h4>

        <table class="table">
            <tbody>

            <tr>
                <td>
                    <h5>ФИО</h5>
                </td>
                <td>${surname} ${name} ${patronymic}</td>

            </tr>

            <tr>
                <td>
                    <h5>Пол</h5>
                </td>
                <td>${gender}</td>


            </tr>

            <tr>
                <td>
                    <h5>Дата рождения</h5>
                </td>
                <td>${birthday}</td>

            </tr>

            <tr>
                <td>
                    <h5>Телефон</h5>
                </td>
                <%--                <td>${phoneNumber}</td>--%>
                <td>+375 29 9863524</td>

            </tr>

            <tr>
                <td>
                    <h5>Адрес</h5>
                </td>
                <td>${region} область, ${district}
                    район, ${locality},улица ${street}, дом № ${homeNumber}, корпус ${caseNumber},
                    квартира ${flatNumber}
                </td>
            </tr>

<%--            <tr>--%>
<%--                <td>--%>
<%--                    <h5>Диспансерная группа</h5>--%>
<%--                </td>--%>
<%--                <td>${dispensaryGroup}</td>--%>
<%--                &lt;%&ndash;                <td>III</td>&ndash;%&gt;--%>

<%--            </tr>--%>

            <%--            <tr>--%>
            <%--                <td>--%>
            <%--                    <h5>Льготы</h5>--%>
            <%--                </td>--%>
            <%--&lt;%&ndash;                <td>${privileged}</td>&ndash;%&gt;--%>
            <%--                <td>нет</td>--%>

            <%--            </tr>--%>

            </tbody>
        </table>


    </div>

    <jsp:include page="../footer.jsp"/>
</body>
</html>