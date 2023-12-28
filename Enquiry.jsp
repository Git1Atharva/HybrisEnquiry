  <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

        <html>
        <head>
            <title>My JSP Page</title>
        </head>
        <body>

            <form:form action="${pageContext.request.contextPath}/myController/myHandler" method="post" modelAttribute="user">
                <label for="firstName">First Name:</label>
                <form:input path="firstName" id="firstName" required="true"/><br>

                <label for="lastName">Last Name:</label>
                <form:input path="lastName" id="lastName" required="true"/><br>

                <label for="email">Email:</label>
                <form:input path="email" id="email" required="true"/><br>

                <label for="age">Age:</label>
                 <form:input path="age" id="age" required="true"/><br>

                <input type="submit" value="Submit">
            </form:form>

        </body>
        </html>

