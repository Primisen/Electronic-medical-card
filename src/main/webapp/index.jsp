<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Электронная медицинская карта</title>
<jsp:include page="/WEB-INF/view/bootstrap.jsp"/>
</head>
<body>

<jsp:include page="/WEB-INF/view/header.jsp"/>

<sec:authorize access="hasAuthority('PATIENT')">
    <jsp:include page="/WEB-INF/view/menu.jsp"/>
</sec:authorize>

<div class="bg-light">

<%--    <h1>This is secured!</h1>--%>
<%--    <p>--%>
<%--        Hello <b><c:out value="${pageContext.request.remoteUser}"/></b>--%>
<%--    </p>--%>
    <main class="container">
        <div class="position-relative overflow-hidden p-3 p-md-5 m-md-3 text-center ">
            <div class="col-md-8 p-lg-5 mx-auto my-5">
                <h1 class="display-4 fw-normal">Электронная медицинская карта амбулаторного больного</h1>
                <p class="lead fw-normal">Одна медицинская карта, одна история болезней, не зависимо от того, сколько раз Вы перезжали и меняли поликлинику по новому месту жительста. Это упрощает и повышает качество работы врачей, так они могут узнать все Ваши перенесенные болезни, а также как и чем Вас лечили, Вашу реакцию на лечение и конечный результат. Также электронная медицинская карта никогда не потеряется. А все это улучшает качество ухода за Вашим здоровьем.</p>
                <sec:authorize access="!isAuthenticated()">
                <a class="btn btn-primary btn-lg" href="/registration">Завести электронную медицинскую карту</a>
                </sec:authorize>
            </div>
            <div class="product-device shadow-sm d-none d-md-block"></div>
            <div class="product-device product-device-2 shadow-sm d-none d-md-block"></div>
        </div>

<%--        -<div class="d-md-flex flex-md-equal w-100 my-md-3 ps-md-3">--%>
        <%--            <div class="bg-dark me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center text-white overflow-hidden">--%>
        <%--                <div class="my-3 py-3">--%>
        <%--                    <h2 class="display-5">Another headline</h2>--%>
        <%--                    <p class="lead">And an even wittier subheading.</p>--%>
        <%--                </div>--%>
        <%--                <div class="bg-light shadow-sm mx-auto" style="width: 80%; height: 300px; border-radius: 21px 21px 0 0;"></div>--%>
        <%--            </div>--%>
        <%--            <div class="bg-light me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">--%>
        <%--                <div class="my-3 p-3">--%>
        <%--                    <h2 class="display-5">Another headline</h2>--%>
        <%--                    <p class="lead">And an even wittier subheading.</p>--%>
        <%--                </div>--%>
        <%--                <div class="bg-dark shadow-sm mx-auto" style="width: 80%; height: 300px; border-radius: 21px 21px 0 0;"></div>--%>
        <%--            </div>--%>
        <%--        </div>--%>

        <%--        <div class="d-md-flex flex-md-equal w-100 my-md-3 ps-md-3">--%>
        <%--            <div class="bg-light me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">--%>
        <%--                <div class="my-3 p-3">--%>
        <%--                    <h2 class="display-5">Another headline</h2>--%>
        <%--                    <p class="lead">And an even wittier subheading.</p>--%>
        <%--                </div>--%>
        <%--                <div class="bg-dark shadow-sm mx-auto" style="width: 80%; height: 300px; border-radius: 21px 21px 0 0;"></div>--%>
        <%--            </div>--%>
        <%--            <div class="bg-primary me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center text-white overflow-hidden">--%>
        <%--                <div class="my-3 py-3">--%>
        <%--                    <h2 class="display-5">Another headline</h2>--%>
        <%--                    <p class="lead">And an even wittier subheading.</p>--%>
        <%--                </div>--%>
        <%--                <div class="bg-light shadow-sm mx-auto" style="width: 80%; height: 300px; border-radius: 21px 21px 0 0;"></div>--%>
        <%--            </div>--%>
        <%--        </div>--%>

        <%--        <div class="d-md-flex flex-md-equal w-100 my-md-3 ps-md-3">--%>
        <%--            <div class="bg-light me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">--%>
        <%--                <div class="my-3 p-3">--%>
        <%--                    <h2 class="display-5">Another headline</h2>--%>
        <%--                    <p class="lead">And an even wittier subheading.</p>--%>
        <%--                </div>--%>
        <%--                <div class="bg-body shadow-sm mx-auto" style="width: 80%; height: 300px; border-radius: 21px 21px 0 0;"></div>--%>
        <%--            </div>--%>
        <%--            <div class="bg-light me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">--%>
        <%--                <div class="my-3 py-3">--%>
        <%--                    <h2 class="display-5">Another headline</h2>--%>
        <%--                    <p class="lead">And an even wittier subheading.</p>--%>
        <%--                </div>--%>
        <%--                <div class="bg-body shadow-sm mx-auto" style="width: 80%; height: 300px; border-radius: 21px 21px 0 0;"></div>--%>
        <%--            </div>--%>
        <%--        </div>--%>

        <%--        <div class="d-md-flex flex-md-equal w-100 my-md-3 ps-md-3">--%>
        <%--            <div class="bg-light me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">--%>
        <%--                <div class="my-3 p-3">--%>
        <%--                    <h2 class="display-5">Another headline</h2>--%>
        <%--                    <p class="lead">And an even wittier subheading.</p>--%>
        <%--                </div>--%>
        <%--                <div class="bg-body shadow-sm mx-auto" style="width: 80%; height: 300px; border-radius: 21px 21px 0 0;"></div>--%>
        <%--            </div>--%>
        <%--            <div class="bg-light me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">--%>
        <%--                <div class="my-3 py-3">--%>
        <%--                    <h2 class="display-5">Another headline</h2>--%>
        <%--                    <p class="lead">And an even wittier subheading.</p>--%>
        <%--                </div>--%>
        <%--                <div class="bg-body shadow-sm mx-auto" style="width: 80%; height: 300px; border-radius: 21px 21px 0 0;"></div>--%>
        <%--            </div>--%>
<%--    </div>--%>

</div>
    </main>
</body>
</html>
