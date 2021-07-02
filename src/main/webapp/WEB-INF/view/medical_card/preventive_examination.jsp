<%--
  Created by IntelliJ IDEA.
  User: primi
  Date: 15.04.2021
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Профилактические осмотры</title>
    <jsp:include page="../bootstrap.jsp"/>
</head>
<body>

<jsp:include page="../header.jsp"/>
<sec:authorize access="hasAuthority('PATIENT')">
    <jsp:include page="../medical_card_navigation.jsp"/>
</sec:authorize>

<div class="container col-8">

    <h4 class="text-center mt-4 mb-4">Профилактические осмотры</h4>

    <sec:authorize access="hasAuthority('MEDICAL')">

        <div class="p-3  mb-5 mt-5 bg-light border border-1">

            <nav class="navbar sticky-top navbar-light bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">Добавление записи</a>
                </div>
            </nav>

            <form:form method="post" modelAttribute="preventiveExaminationPage">

                <div>
                    <div class="mb-3">
                        <label for="d" class="form-label">Кожа</label>
                        <form:input type="text" path="leather" placeholder="Кожа" id="d" cssClass="form-control"/>
                    </div>

                    <div class="mb-3">
                        <label for="h" class="form-label">Губа</label>
                        <form:input type="text" path="lip" placeholder="Губа" id="h" cssClass="form-control"/>
                    </div>
                    <div class="mb-3">
                        <label for="d" class="form-label">Язык и слизистая рта</label>
                        <form:input type="text" path="tongueAndOralMucosa" placeholder="Язык и слизистая рта" id="d"
                                    cssClass="form-control"/>
                    </div>
                    <div class="mb-3">
                        <label for="d" class="form-label">Пищевод</label>
                        <form:input type="text" path="esophagus" placeholder="Пищевод" id="d" cssClass="form-control"/>
                    </div>
                    <div class="mb-3">
                        <label for="d" class="form-label">Желудок</label>
                        <form:input type="text" path="stomach" placeholder="Желудок" id="d" cssClass="form-control"/>
                    </div>
                    <div class="mb-3">
                        <label for="d" class="form-label">Прямая кишка</label>
                        <form:input type="text" path="rectum" placeholder="Прямая кишка" id="d"
                                    cssClass="form-control"/>
                    </div>
                    <div class="mb-3">
                        <label for="d" class="form-label">Легкие</label>
                        <form:input type="text" path="lungs" placeholder="Легкие" id="d" cssClass="form-control"/>
                    </div>
                    <div class="mb-3">
                        <label for="d" class="form-label">Молочная железа</label>
                        <form:input type="text" path="breast" placeholder="Молочная железа" id="d"
                                    cssClass="form-control"/>
                    </div>
                    <div class="mb-3">
                        <label for="d" class="form-label">Матка</label>
                        <form:input type="text" path="uterus" placeholder="Матка" id="d" cssClass="form-control"/>
                    </div>
                    <div class="mb-3">
                        <label for="d" class="form-label">Прочие</label>
                        <form:input type="text" path="other" placeholder="Прочие" id="d" cssClass="form-control"/>
                    </div>
                </div>

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
                            <p>Есть ли на коже, губах, слизистой полости рта и языка язвы, трещины, разрастания,
                                уплотнение и
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
                            <p>Есть ли в настоящее время кашель, кровохаркание, боли в грудной клетке, осиплость
                                голоса? </p>
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
                            <p>Имеются ли уплотнения в молочных (грудных) железах, язвы, трещины в области соска,
                                кровянистые
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

                </div>

                <button type="submit">Добавить</button>

            </form:form>
        </div>
    </sec:authorize>

    <h4 class="text-center mt-4 mb-4">Данные профилактических осмотров</h4>

    <div>
        <table class="table">

            <thead>
            <tr>
                <th>
                    <h5>Дата</h5>
                </th>
                <th>
                    <h5>Кожа</h5>
                </th>
                <th>
                    <h5>Губа</h5>
                </th>
                <th>
                    <h5>Язык и слизистая рта</h5>
                </th>
                <th>
                    <h5>Пищевод</h5>
                </th>
                <th>
                    <h5>Желудок</h5>
                </th>
                <th>
                    <h5>Прямая кишка</h5>
                </th>
                <th>
                    <h5>Легкие</h5>
                </th>
                <th>
                    <h5>Молочная железа</h5>
                </th>
                <th>
                    <h5>Матка</h5>
                </th>
                <th>
                    <h5>Прочее</h5>
                </th>
                <th>
                    <h5>Врач</h5>
                </th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="page" items="${preventiveExaminationPages}">

                <tr>
                    <td>
                        <p>${page.recordDate}</p>
                    </td>
                    <td>
                        <p>${page.leather}</p>
                    </td>
                    <td>
                        <p>${page.lip}</p>
                    </td>
                    <td>
                        <p>${page.tongueAndOralMucosa}</p>
                    </td>
                    <td>
                        <p>${page.esophagus}</p>
                    </td>
                    <td>
                        <p>${page.stomach}</p>
                    </td>
                    <td>
                        <p>${page.rectum}</p>
                    </td>
                    <td>
                        <p>${page.lungs}</p>
                    </td>
                    <td>
                        <p>${page.breast}</p>
                    </td>
                    <td>
                        <p>${page.uterus}</p>
                    </td>
                    <td>
                        <p>${page.other}</p>
                    </td>
                    <td>
                        <p>${page.medicalWorker.surname} ${page.medicalWorker.name} ${page.medicalWorker.patronymic}</p>

                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

        <div>
            результаты опроса
            <c:forEach var="page" items="${preventiveExaminationPages}">
                <table class="table">
                    <tbody>

                    <tr>
                        <td>
                            <h5>ФИО</h5>
                        </td>
                        <td>${page.questionnaire.}</td>

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
                        <td>${phoneNumber}</td>
                    </tr>

                    <tr>
                        <td>
                            <h5>Адрес</h5>
                        </td>
                        <td>${region} область, ${district}
                            район, ${locality},улица(переулок) ${street}, дом № ${homeNumber}, корпус ${caseNumber},
                            квартира ${flatNumber}
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <h5>Место работы</h5>
                        </td>
                        <td>${workPlace}</td>
                    </tr>

                    <tr>
                        <td>
                            <h5>Должность</h5>
                        </td>
                        <td>${position}</td>
                    </tr>

                    <tr>
                        <td>
                            <h5>Диспансерная группа</h5>
                        </td>
                        <td>${dispensaryGroup}</td>
                    </tr>

                    <tr>
                        <td>
                            <h5>Льготы</h5>
                        </td>
                        <td>${privileged}</td>
                    </tr>

                    </tbody>
                </table>
            </c:forEach>
        </div>
    </div>


</div>
<jsp:include page="../footer.jsp"/>
</body>
</html>
