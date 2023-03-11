<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Welcome</title>
        <link rel="stylesheet" type="text/css" href="resources/css/styles.css"/>
       <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
    <h1>Welcome ${customer.name }</h1><br><br>
    <div class="row">
    <div class="col">
    <form action="filter" method="post">
    <h4>Filter By</h4>
     <label for="color">Select the Color</label>
      <select name="color">
        <option value="0" style="display: none">Select</option>
        <c:forEach var="color" items="${color}">
          <option value="${color.name }">${color.name }</option>
        </c:forEach>
      </select>&nbsp;&nbsp;&nbsp;

      <label for="manafacturer">Select Manafacturer</label>
      <select name="manafacturer">
        <option value="0" style="display: none">Select</option>
        <c:forEach var="manafact" items="${manafact}">
          <option value="${manafact.name }">${manafact.name }</option>
        </c:forEach>
      </select>&nbsp;&nbsp;&nbsp; 
      <label for="transmission">Select transmission</label>
      <select name="transmission">
      <option value="0" style="display: none">Select</option>
      <option value="Manual">Manual</option>
      <option value="Automatic">Automatic</option>
      </select>&nbsp;&nbsp;&nbsp;
      <button class="btn btn-primary" type="submit">Filter</button>
    <%-- <input type="hidden" value="${customer.email}" name="email"> --%>
         
    </form>

    </div>
  
    </div><br><br>
  
    
    
    
    
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
<form method="post" action="cardetails">
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
    </div>
  </body>
</html>