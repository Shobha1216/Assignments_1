<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>

<html>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<body>

<div class="container-fluid">

 <form:form action="createIntern" cssClass="form-horizontal"
      method="post" modelAttribute="customer">

<div class="container">
  <form:errors path="intern.*"  class="alert alert-danger"/>
</div>




<div class ="card">

<form class="row g-3" action="handleForm" method="post">

  <div class="col-md-3">
    <label for="internName" class="form-label">InternName</label>
    <input type="text" class="form-control" name ="internName" id="internName">
  </div>

  <div class="col-6">
    <label for="email" class="form-label">Email</label>
    <input type="text" class="form-control"  name="email">
  </div>

  <div class="col-12">
    <label for="phoneNo" class="form-label">PhoneNo</label>
    <input type="text" class="form-control" name="phoneNo">
  </div>


  <div class="col-12">
    <button type="submit" class="btn btn-primary m-3 p-3">Submit </button>
  </div>

</form>
</div>

</div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>