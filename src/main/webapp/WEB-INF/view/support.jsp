<%--
  Created by IntelliJ IDEA.
  User: primi
  Date: 22.05.2021
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Служба поддержки</title>
</head>
<body>

<jsp:include page="/WEB-INF/view/header.jsp"/>

<form:form class="row mx-5 g-2" method="post" action="/support">

    <%--    <h4 class="h4 mb-2 fw-normal">Пожалуйста войдите</h4>--%>
    <p>
        Если вы хотите подсказать нам, как улучшить наш сайт, высказать ваши замечания или задать вопрос службе
        поддержки,
        напишите нам.
    </p>

<%--    <label for="floatingInput">Тема</label>--%>
<%--    <input name="title" type="text" class="form-control" autofocus="true" id="floatingInput"--%>
<%--           placeholder="Логин">--%>

    <label for="floatingPassword">Содержание</label>
    <textarea name="message" type="text" class="form-control" id="floatingPassword" placeholder="Пароль"></textarea>

    <label for="floatingInput">Имя</label>
    <input name="name" type="text" class="form-control"  id="floatingInput"
           placeholder="Логин">

    <label for="floatingInput">Эектронная почта</label>
    <input name="email" type="text" class="form-control"  id="floatingInput"
           placeholder="Логин">

    <button class="w-100 btn btn-lg btn-primary" type="submit">Отправить</button>


</form:form>

<jsp:include page="footer.jsp"/>
</body>
</html>
