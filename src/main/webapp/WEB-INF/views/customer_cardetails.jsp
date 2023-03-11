<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Car Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
    <h1>${car.manafacturer} ${car.model }</h1><br>
    <img alt="car_image" src="${car.imgurl}" width="500px" height="300px"><br><br>
    <div class="row">
    <div class="col">
    
    
    </div>
    <div class="">
    </div>
    
    </div>
   <h5>Transmission: ${car.transmission }</h5>
   <h5>Year: ${car.year }</h5>
   <h5>Color: ${car.color }</h5>
   <h5>Kilometers Driven: ${car.kmdriven }</h5>
   <h5>Expected price: ${car.price } </h5>
   <form action="customer/makeoffer" method="post">
      <h5>
      <label for="remarks">Remarks</label> 
      <textarea id="remarks" name="remarks" rows="2" cols="50"></textarea>
      </h5>
   <h5>
      <label for="quote">Make an Offer </label>
      <input type="number" name="quote">
    </h5>
	<input type="hidden"value="${car.model}" name="model">
	<input type="hidden"value="${car.manafacturer}" name="manafacturer">
    <input type="hidden"value="${email}" name="email">
    <input type="hidden"value="${car.ad_id}" name="ad_id">
   <button class="btn btn-primary">Place</button>
   </form>
    
    </div>
  </body>
</html>