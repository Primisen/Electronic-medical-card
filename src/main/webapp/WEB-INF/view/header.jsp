<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false" %>

<header class="bg-light p-3">

    <div class="container">

        <div class="d-flex flex-wrap align-item-center justify-content-center justify-content-lg-center">

            <a href="/" class="d-flex align-items-center mb-3 mb-lg-0 me-lg-auto text-dark text-decoration-none">
                <span class="fs-4">Электронная медицинская карта</span>
            </a>

            <sec:authentication var="user" property="principal"/>

            <sec:authorize access="isAuthenticated()">
                <sec:authorize access="hasAuthority('MEDICAL')">
                    <ul class="nav col-12 col-lg-auto  mb-2 justify-content-end mb-md-0">
                        <li>
                            <a class="nav-link px-2 link-dark" href="/patients">Список пациентов</a>
                        </li>
                    </ul>
                </sec:authorize>

                <div class="dropdown text-end">
                    <a class="nav-link dropdown-toggle px-2 link-dark" data-bs-toggle="dropdown" href="#" role="button"
                       aria-expanded="false">${user.surname} ${user.name}</a>
                    <ul class="dropdown-menu text-small" aria-labelledby="dropdownUser1">

                        <sec:authorize access="hasAuthority('ADMIN')">
                            <li><a class="dropdown-item" href="/registration-applications">Заявки на регистрацию</a></li>
                            <li><a class="dropdown-item" href="#">Управление пользователями</a></li>
                        </sec:authorize>

<%--                        <li>--%>
<%--                            <hr class="dropdown-divider">--%>
<%--                        </li>--%>
                        <li><a class="dropdown-item" href="/logout">Выйти</a></li>
                    </ul>
                </div>
            </sec:authorize>

            <sec:authorize access="!isAuthenticated()">
                <form class="col-12 col-lg-auto mb-3 mb-lg-0">
                    <ul class="nav  col-lg-auto me-lg-auto mb-2 justify-content-end mb-md-0">
                        <li><a href="/registration" class="nav-link px-2 link-dark">Зарегистрироваться</a></li>
                        <li><a href="/login" class="nav-link px-2 link-dark">Войти</a></li>
                    </ul>
                </form>
            </sec:authorize>

        </div>

    </div>
</header>