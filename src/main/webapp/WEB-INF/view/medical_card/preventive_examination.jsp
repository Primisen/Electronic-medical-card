<%--
  Created by IntelliJ IDEA.
  User: primi
  Date: 15.04.2021
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Профилактические осмотры</title>
    <jsp:include page="../bootstrap.jsp"/>
</head>
<body>

<jsp:include page="../header.jsp"/>
<jsp:include page="../menu.jsp"/>

<div class="container">

    <h4 class="text-center mt-4 mb-4">Профилактические осмотры</h4>

    <c:forEach var="page" items="${preventiveExaminationPages}">

        <div class="row">
            <div class="col-2 bg-light border">
                <p>${page.recordDate}</p>
            </div>
            <div class="col bg-light border">
<%--                <p>${page.}</p>--%>
            </div>
            <div class="col bg-light border">
<%--                <p>Впервые установленные диагнозы (отметить +)</p>--%>
            </div>
            <div class="col-2 bg-light border">
                <p>Врач</p>
            </div>
        </div>
    </c:forEach>

    <form:form method="post" modelAttribute="preventiveExaminationPage">
        <div>
            <div class="row">
                <div class="col bg-light border">
                    <p>Изменились ли за последние месяцы цвет и размеры пигментных (родимых.)
                        пятен?</p>
                </div>
                <div class="col-1 bg-light border">
                    <select class="form-select" aria-label="Default select example">
                        <option value="1">Нет</option>
                        <option value="2">Да</option>
                    </select>
                </div>
            </div>

            <div class="row">
                <div class="col bg-light border">
                    <p>Есть ли на коже, губах, слизистой полости рта и языка язвы, трещины, разрастания, уплотнение и
                        шелушение?</p>
                </div>
                <div class="col-1 bg-light border">
                    <select class="form-select" aria-label="Default select example">
                        <option value="1">Нет</option>
                        <option value="2">Да</option>
                    </select>
                </div>
            </div>

            <div class="row">
                <div class="col bg-light border">
                    <p>Имеются ли затруднения при проглатывании жидкой или твердой пищи? </p>
                </div>
                <div class="col-1 bg-light border">
                    <select class="form-select" aria-label="Default select example">
                        <option value="1">Нет</option>
                        <option value="2">Да</option>
                    </select>
                </div>
            </div>

            <div class="row">
                <div class="col bg-light border">
                    <p>Отмечаете ли в настоящее время общую слабость, ухудшение аппетита, нарастающее похудение,
                        постоянные отрыжки и рвоты, чувство тяжести и боли в
                        поджелудочной области, запоры, поносы? </p>
                </div>
                <div class="col-1 bg-light border">
                    <select class="form-select" aria-label="Default select example">
                        <option value="1">Нет</option>
                        <option value="2">Да</option>
                    </select>
                </div>
            </div>

            <div class="row">
                <div class="col bg-light border">
                    <p>Отмечается ли примесь крови в моче, кале или дегтеобразный стул?</p>
                </div>
                <div class="col-1 bg-light border">
                    <select class="form-select" aria-label="Default select example">
                        <option value="1">Нет</option>
                        <option value="2">Да</option>
                    </select>
                </div>
            </div>

            <div class="row">
                <div class="col bg-light border">
                    <p>Есть ли в настоящее время кашель, кровохаркание, боли в грудной клетке, осиплость голоса? </p>
                </div>
                <div class="col-1 bg-light border">
                    <select class="form-select" aria-label="Default select example">
                        <option value="1">Нет</option>
                        <option value="2">Да</option>
                    </select>
                </div>
            </div>

            <div class="row">
                <div class="col bg-light border">
                    <p>Имеются ли уплотнения в молочных (грудных) железах, язвы, трещины в области соска, кровянистые
                        выделения из соска? </p>
                </div>
                <div class="col-1 bg-light border">
                    <select class="form-select" aria-label="Default select example">
                        <option value="1">Нет</option>
                        <option value="2">Да</option>
                    </select>
                </div>
            </div>

            <div class="row">
                <div class="col bg-light border">
                    <p>Имеются ли кровянистые выделения из влагалища, не связанные с месячными?</p>
                </div>
                <div class="col-1 bg-light border">
                    <select class="form-select" aria-label="Default select example">
                        <option value="1">Нет</option>
                        <option value="2">Да</option>
                    </select>
                </div>
            </div>

            <div class="row">
                <div class="col bg-light border">
                    <p>Другие жалобы</p>
                </div>
                <div class="col-1 bg-light border">
                    <select class="form-select" aria-label="Default select example">
                        <option value="1">Нет</option>
                        <option value="2">Да</option>
                    </select>
                </div>
            </div>

            <button type="submit">Добавить</button>

        </div>
    </form:form>

    <div class="mt-5">
        функционал страницы не доделан и работает неправильно

    </div>
</div>
<jsp:include page="../footer.jsp"/>
</body>
</html>
