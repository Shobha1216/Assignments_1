
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>LibraryManagementSystem</title>
  </head>
  <body>
    <h1 class="text-center warning">Intern Details</h1>
    <table class="table caption-top">

      <thead class="btn-warning">
        <tr>
          <th scope="col">InternId</th>
          <th scope="col">InternName</th>
          <th scope="col">Email</th>
          <th scope="col">PhoneNo</th>
          <th scope="col">Action</th>
        </tr>
      </thead>
      <tbody>


      <c:forEach items="${internList}"  var="p">

        <tr>
          <th scope="row"> ${p.internId}  </th>
          <td>${p.internName}</td>
          <td>${p.email}</td>
          <td>${p.phoneNo}</td>

          <td>
                   <!-- display the update link --><a href="updateForm/${p.internId}">Update</a>
                    <c:url var="updateLink" value="updateForm">
                           <c:param name="internId" value="${p.internId}" />
                          </c:url>

                   | <a href="delete/${p.internId}"
                   onclick="if (!(confirm('Are you sure you want to delete this intern?'))) return false">Delete</a>
                  </td>
        </tr>
         </c:forEach>

      </tbody>
    </table>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

  </body>
</html>