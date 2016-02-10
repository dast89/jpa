<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <%--<link rel="stylesheet" href="css/style.css">--%>
  <%--<link rel="stylesheet" href="css/reset.css">--%>
  <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
  <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap-theme.css">
</head>
<body>
<div class="b-page">
  <div class="b-page__content">
    <h1>Список футболистов</h1>
    <a href="add">Добавить</a>
    <table class="h-table h-table_bordered">
      <tr>
        <th>ФИО</th>
        <th>Позиция</th>
        <th>Страна</th>
        <th>Возрост</th>
      </tr>
      <c:forEach items="${players}" var="player">
        <tr> <td>${player.fio}</td>
          <td>${player.country}</td>
          <td></td>
          <td></td></tr>
      </c:forEach>

    </table>
  </div>

</div>

</body>
</html>

