<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%> <%@ page isELIgnored="false" %> <%@ taglib
prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>New Ad</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
  </head>
  <body>
    <div class="container">
      <h1>Create a new Ad</h1>
      <br /><br /><br />
      <form action="postcar" method="post">
        <label>Select image</label>
      <select name="imgurl">
        <option value="0" style="display: none">Select</option>
        <option value="resources/images/suv.jpg">Suv</option>
        <option value="resources/images/hatchback.jpg">Hatchbach</option>
        <option value="resources/images/sedan.jpg">Sedan</option>
        </select><br /><br />
      <label for="model">Enter the Model</label>
      <input type="text" name="model" /><br /><br />
      <label for="manafacturer">Select Manafacturer</label>
      <select name="manafacturer">
        <option value="0" style="display: none">Select</option>
        <c:forEach var="manafact" items="${manafact}">
          <option value="${manafact.name }">${manafact.name }</option>
        </c:forEach>
      </select> <br /><br />
      <label for="year">Enter the year of Manafacture</label>
      <input type="number" name="year"><br><br>
      <label for="transmission">Select Transmission</label>
      <select name="transmission">
      <option value="0" style="display: none">Select</option>
      <option value="Manual">Manual</option>
      <option value="Automatic">Automatic</option>
      <option value="Hybrid">Hybrid</option>
      <option value="Electric">Electric</option>
      </select><br><br>
      <label for="color">Select the Color</label>
      <select name="color">
        <option value="0" style="display: none">Select</option>
        <c:forEach var="color" items="${color}">
          <option value="${color.name }">${color.name }</option>
        </c:forEach>
      </select> <br /><br />
      <label for="kmdriven">Kilometers Driven</label>
      <input type="text" name="kmdriven"><br><br>
    <label for="price">Enter expecting price</label>
    <input type="number" name="price"><br><br>
    <button type="submit" class="btn btn-primary">Post</button>
    
      </form>
    
     
    </div>
  </body>
</html>
