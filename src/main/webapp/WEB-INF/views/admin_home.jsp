<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin Home page</title>
    <link rel="stylesheet" type="text/css" href="resources/css/styles.css"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  </head>
  <body>
    <div class="container mt-5">
    <h1>Welcome ${admin.name }</h1><br><br><br><br><br><br>
    <div class="row">
    <div class="col">
     <button class="btn btn-primary big-button" onclick="window.location.href='adcar'">Create a new ad</button>
    </div>
    <div class="col">
     <button class="btn btn-danger big-button">View Quotes</button>
    </div>
    <div class="col">
     <button class="btn btn-warning big-button" onclick="window.location.href='viewcust'">View Registered Users</button>
    </div>
    
    </div>
   
    </div>
  </body>
</html>