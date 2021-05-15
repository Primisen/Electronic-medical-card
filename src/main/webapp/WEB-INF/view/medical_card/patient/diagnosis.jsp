<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Личная информация</title>
    <jsp:include page="../../bootstrap.jsp"/>
</head>
<body>

<jsp:include page="../../header.jsp"/>
<jsp:include page="../../menu.jsp"/>


<c:set var="patient" scope="session" value="${patient}"/>

<div class="container">

    <h4 class="text-center mt-4 mb-4">Лист для записи заключительных (уточненных) диагнозов</h4>

    <div>
        <div class="row">
            <div class="col-2 bg-light border">
                <h5>Дата обращения</h5>
            </div>
            <div class="col bg-light border">
                <h5>Заключительный (уточненный) диагноз</h5>
            </div>
            <div class="col bg-light border">
                <h5>Впервые установленные диагнозы (отметить +)</h5>
            </div>
            <div class="col-2 bg-light border">
                <h5>Врач</h5>
            </div>
        </div>

        <c:forEach var="diagnosis_data" items="${d}">

            <div class="row">
                <div class="col-2 bg-light border">
                    <p>Дата обращения</p>
                </div>
                <div class="col bg-light border">
                    <p>Заключительный (уточненный) диагноз</p>
                </div>
                <div class="col bg-light border">
                    <p>Впервые установленные диагнозы (отметить +)</p>
                </div>
                <div class="col-2 bg-light border">
                    <p>Врач</p>
                </div>
            </div>
        </c:forEach>

    </div>

    <div class="mt-5">
        todo: пусть в форме дата сама появляется, в "Впервые установленные диагнозы (отметить +)" много дел с валидацией, у доктора добавить кнопочку "добавить"

    </div>
</div>

</body>
</html>
