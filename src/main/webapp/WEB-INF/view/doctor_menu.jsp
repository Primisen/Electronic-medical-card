<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<div class="collapse" id="navbarToggleExternalContent">
    <div class="bg-light p-4">
        <h5 class="text-black h4">Навигация</h5>
        <div>

            <c:set value="${patient}" var="patient"/>

            <ul class="nav navbar-nav">
                <li><a class="dropdown-item" href="/personal_page/${patient.id}">Паспортная часть</a></li>
                <li><a class="dropdown-item" href="/diagnosis/${patient.id}">Лист для записи заключительных (уточненных) диагнозов</a></li>
                <li><a class="dropdown-item" href="/preventive_examination/${patient.id}">Лист профилактических осмотров с данными опроса и осмотра</a></li>
                <li><a class="dropdown-item" href="/vaccination/${patient.id}">Карта учета профилактических прививок</a></li>

                <c:if test="${patient.medicalCard.personalPage.gender == womanGender}">
                    <li><a class="dropdown-item" href="/gynecological/${patient.id}">Данные о профилактических гинекологических осмотрах для женщин</a></li>
                </c:if>

                <li><a class="dropdown-item" href="/disability/${patient.id}">Лист учета временной нетрудоспособности</a></li>
                <li><a class="dropdown-item" href="/xray/${patient.id}">Лист учета рентгенологических обследований</a></li>
                <li><a class="dropdown-item" href="/anamnesis/${patient.id}">Данные анамнеза и дополнения к анамнезу</a></li>
                <li><a class="dropdown-item" href="/medical_examination/${patient.id}">Листы для записи врачебных осмотров</a></li>
            </ul>
        </div>
    </div>
</div>

<nav class="navbar navbar-light bg-light">
    <div class="container-fluid">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
            <span>Нажмите чтобы открыть/скрыть навигацию</span>
        </button>
    </div>
</nav>