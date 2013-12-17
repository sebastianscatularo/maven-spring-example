<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head><title>Employees List</title></head>
<body>
    <a href="/employees/list">Employees list</a>
    <h1>Create Employee</h1>

    <form:form method="POST" action="/employees/create" modelAttribute="form">
        <table>
                <tr>
                    <td><form:label path="name">Name: </form:label></td>
                    <td><form:input type="text" path="name" /></td>
                    <td><form:errors path="name" /></td>
                </tr>
                <tr>
                    <td><form:label path="surname">Surname: </form:label></td>
                    <td><form:input type="text" path="surname" /></td>
                    <td><form:errors path="surname" /></td>
                </tr>
        </table>
        <input type="submit" value="Create"/>
    </form:form>
</body>
</html>