<jsp:include page="../include/header.jsp"/>
<h1>Create Employee</h1>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

<section>
    <div class="container">
        <form method="get" action="/employee/createSubmit">
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
             <div class="mb-3">
                            <label for="departmentName" class="form-label">Department Name</label>
                            <input type="text" class="form-control" id="departmentName" aria-describedby="firstNameHelp" name="departmentName" value="${form.departmentName}">
                        </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</section>
<jsp:include page="../include/footer.jsp"/>
