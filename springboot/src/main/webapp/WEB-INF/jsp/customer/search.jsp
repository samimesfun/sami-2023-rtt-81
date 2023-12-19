<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>
<section>
<section>
    <div class="bg-light2 pt-5 pb-5">
        <div class="row">
            <div class="col-12 text-center">
                <h1 class="m-0">Customer Search</h1>
            </div>
        </div>
    </div>
</section>

<section class="bg-light1 pt-5 pb-5">


<div class = "container pt-5">
   <form action="/customer/search">
   <label for="firstName">First Name:</label>
   <input type="text" name="firstName" placeholder="Search by first name" value="${firstName}"/>
   <button type = "submit" class="btn btn-primary">Submit</button>
   </form>

<div class= "pt-3">
<form action="/customer/search">
<label for="lastName">Last Name:</label>
<input type="text" name="lastName" placeholder="Search by last name" value="${lastName}"/>
<button type = "submit" class="btn btn-primary">Submit</button>
</form>
</div>

<c:if test="${not empty customerVar}">
            <h1>Customers Found ${customerVar.size()}</h1>

            <table class="table">
                <tr>
                    <td>Id</td>
                    <td>First Name</td>
                    <td>Last Name</td>
                    <td>Phone</td>
                    <td>City</td>
                    <td>Image</td>
                    <td>Edit</td>
                    <td>Detail</td>
                    <td>Upload</td>
                </tr>
                <c:forEach items="${customerVar}" var="customer">
                    <tr>
                        <td>${customer.id}</td>
                        <td>${customer.firstName}</td>
                        <td>${customer.lastName}</td>
                        <td>${customer.phone}</td>
                        <td>${customer.city}</td>
                        <td><img src="${customer.imageUrl}" style="max-width:100px"></td>
                        <td><a href="/customer/edit/${customer.id}">Edit</a></td>
                        <td><a href="/customer/detail?id=${customer.id}">Detail</a></td>
                         <td><a href="/customer/fileupload?id=${customer.id}">Upload</a></td>
                    </tr>
                </c:forEach>
            </table>

        </c:if>
</div>
</section>
<jsp:include page="../include/footer.jsp"/>