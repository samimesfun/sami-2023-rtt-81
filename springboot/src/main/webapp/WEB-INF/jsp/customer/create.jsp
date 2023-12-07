<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>
<section>
    <div class="bg-light2 pt-5 pb-5">
        <div class="row">
            <div class="col-12 text-center">
                <h1 class="m-0">Create Customer</h1>
            </div>
        </div>
    </div>
</section>

<section>
    <div class="container">
        <form method="get" action="/customer/createSubmit">
         <input type="hidden" name="id" value="${form.id}">
            <div class="mb-3">
                <label for="firstName" class="form-label">Fist Name</label>
                <input type="text" class="form-control" id="firstName" aria-describedby="firstNameHelp" name="firstName" value="${form.firstName}">
                <div id="firstNameHelp" class="form-text">Please let us know your first name </div>
            </div>
                       <div class="mb-3">
                            <label for="lastName" class="form-label">Last Name</label>
                            <input type="text" class="form-control" id="lastName" aria-describedby="lastNameHelp" name="lastName" value="${form.lastName}">
                            <div id="lastNameHelp" class="form-text">Please let us know your last name </div>
                        </div>
                        <div class="mb-3">
                            <label for="phone" class="form-label">Phone</label>
                            <input type="text" class="form-control" id="phone" name="phone" value="${form.phone}">
                         </div>
                         <div class="mb-3">
                                <label for="city" class="form-label">City</label>
                                <input type="text" class="form-control" id="city" name="city"  value="${form.city}">
                          </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</section>
<jsp:include page="../include/footer.jsp"/>