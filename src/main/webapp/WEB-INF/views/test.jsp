<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   
    <table>
  <tr>
    <th></th>
    <th>Model</th>
  <th>Manafacurer</th>
    <th>Year</th>
      <th>Transmission</th>
        <th>Color</th>
          <th>Kilometers driven</th>
            <th>Expected Price</th>
            
  
  </tr>
    <tr>
     
      <c:forEach var="car" items="${car}">
<form method="post" action="customer/cardetails">
        <tr>
        <td><img alt="car_image" src="${car.imgurl }" width="300px" height="200px"></td>
        <td>${car.model }</td>
          <td>${car.manafacturer }</td>
            <td>${car.year}</td>
              <td>${car.transmission }</td>
              <td>${car.color }</td>
                <td>${car.kmdriven }</td>
                  <td>${car.price }</td> 
                  <input type="hidden"value="${customer.email}" name="email">
                  <input type="hidden"value="${car.ad_id}" name="carid">
                  <td><button class="btn btn-primary" type="submit">View Details</button></td>
                  
                  </form>
         </c:forEach>
  <tr>
 
    </table>
</body>
</html>