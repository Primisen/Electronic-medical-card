<%--
  Created by IntelliJ IDEA.
  User: primi
  Date: 13.04.2021
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>


<sec:authorize access="hasAuthority('PATIENT')">
    <sec:authentication var="user" property="principal" />

<%--<sec:authorize access="hasAuthority('MEDICAL')">--%>
<%--    <sec:authentication var="user" property="principal" />--%>
<%--</sec:authorize>--%>

<div class="card-footer">

    <div class="container">
    ${user.surname} ${user.name} ${user.patronymic}
    </div>
</div>
</sec:authorize>

<div class="collapse" id="navbarToggleExternalContent">
    <div class="bg-light p-4">

        <div class="container">

        <h5 class="text-black h4">Навигация</h5>
        <div>
            <ul class="nav navbar-nav">

                <li><a href="/personal_page/${user.id}" class="navbar-brand">Личная информация</a></li>
                <li><a href="/diagnosis/${user.id}" class="navbar-brand">Лист для записи заключительных (уточненных) диагнозов</a></li>
                <li><a href="/preventive_examination/${user.id}" class="navbar-brand">Лист профилактических осмотров с данными опроса и осмотра</a>
                </li>
                <li><a href="/vaccination/${user.id}" class="navbar-brand">Карта учета профилактических прививок</a></li>
                <li><a href="/gynecological/${user.id}" class="navbar-brand">Данные о профилактических гинекологических осмотрах</a></li>
                <li><a href="/disability/${user.id}" class="navbar-brand">Лист учета временной нетрудоспособности</a></li>
                <li><a href="/xray/${user.id}" class="navbar-brand">Лист учета рентгенологических обследований</a></li>
                <li><a href="/anamnesis/${user.id}" class="navbar-brand">Данные анамнеза и дополнения к анамнезу</a></li>
                <li><a href="/medical_examination/${user.id}" class="navbar-brand">Листы для записи врачебных осмотров</a></li>
            </ul>
        </div>


        </div>
    </div>
</div>

<nav class="navbar navbar-light bg-light">
    <div class="container-fluid">

        <div class="container">

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
            <span>Нажмите чтобы открыть/скрыть навигацию</span>
        </button>

        </div>
    </div>
</nav>