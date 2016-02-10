<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <%--<link rel="stylesheet" type="text/css" href="css/style.css">--%>
    <%--<link rel="stylesheet" type="text/css" href="css/reset.css">--%>
    <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap-theme.css">
</head>
<body>
<a href="/">Назад</a> <h1>Добавить</h1>
<p style="color: #008744;">${message}</p>
<form  method="post">

    <div class="form-group">
        <label for="fio">ФИО</label>
        <input type="text" class="form-control" id="fio" placeholder="fio">
    </div>
    <div class="form-group">
        <label for="position">Позиция</label>
        <input type="text" class="form-control" id="position" placeholder="position">
    </div>
    <div class="form-group">
        <label for="country">Страна</label>
        <input type="text" class="form-control" id="country" placeholder="country">
    </div>
    <div class="form-group">
        <label for="age">Возраст</label>
        <input type="text" class="form-control" id="age" placeholder="age">
    </div>
    <button name="save" class="btn btn-default">Сохранить</button>
</form>

</body>
</html>
