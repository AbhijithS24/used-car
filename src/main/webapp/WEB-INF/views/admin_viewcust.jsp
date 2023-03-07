<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="resources/css/styles.css"/> 
    <title>View Users</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
    <h1>Registered Customers</h1><br><br><br>
    <table>
    <tr>
    <th>Name</th>
        <th>House Name</th>
            <th>Place</th>
                <th>Pincode</th>
                    <th>Email</th>
    </tr>
    <tr>
     
      <c:forEach var="cust" items="${cust}">

        <tr>
        <td>${cust.name}</td>
        <td>${cust.house_name}</td>
        <td>${cust.place }</td>
        <td>${cust.pincode }</td>
        <td>${cust.email }</td>
        <td>
        <form action="makeadmin" method="post">
        <input type="hidden" value=${cust.email } name="email">
         <button class="btn btn-primary">Make Admin</button>
        </form>
       
        </td>
        </tr>

        </c:forEach> 
    
    </tr>
    </table>
    </div>
  </body>
</html>