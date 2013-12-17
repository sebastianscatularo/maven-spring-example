<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head><title>Employees List</title></head>
<body>
    <a href="/employees/new">Add new employee</a>
    <h1>Employees List</h1>
    <table border="1">
        <tr>
            <td>Name</td>
            <td>Surname</td>
        </tr>
      <c:forEach items="${employees}" var="employee">
        <tr>
          <td><c:out value="${employee.value.name}" /></td>
          <td><c:out value="${employee.value.surname}" /></td>
          <td><a href="/employees/delete/<c:out value="${employee.key}"/>"">X</a></td>
        </tr>
      </c:forEach>
    </table>
</body>
</html>