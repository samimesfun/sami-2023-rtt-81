<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>


<section>
    <div class="bg-light2 pt-5 pb-5">
        <div class="row">
            <div class="col-12 text-center">
                <h1 class="m-0">File Upload</h1>
            </div>
        </div>
    </div>
</section>

<section class="pt-5 pb-5">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-3">First Name</div>
            <div class="col-4">${customer.firstName}</div>
        </div>
        <div class="row justify-content-center">
            <div class="col-3">Last Name</div>
            <div class="col-4">${customer.lastName}</div>
        </div>
        <form method="POST" action="/customer/fileUploadSubmit" enctype="multipart/form-data">
            <input type="hidden" name="id" value="${customer.id}"/>
            <div class="row justify-content-center pt-5">
                <div class="col-7">
                    <input type="file" name="file"/>
                </div>
            </div>
            <div class="row  justify-content-center pt-3">
                <div class="col-7">
                    <input type="submit" value="Submit"/>
                </div>
            </div>
        </form>
    </div>
</section>
<jsp:include page="../include/footer.jsp"/>