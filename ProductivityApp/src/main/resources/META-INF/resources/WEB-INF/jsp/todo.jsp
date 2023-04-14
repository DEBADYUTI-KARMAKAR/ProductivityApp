<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">

	<h1>Enter work Details</h1>
	<form:form action="" method="post" modelAttribute="todo">
	
		<fieldset class="mb-3">
			<form:errors path="description" cssClass="text-warning"></form:errors>
			<br>
			<form:label path="description">Description</form:label>
			<form:input type="text" path="description" name="description"
				required="required" />
		</fieldset>

		<fieldset class="mb-3">
			<form:errors path="targetDate" cssClass="text-warning"></form:errors>
			<br>
			<form:label path="targetDate">Target Date</form:label>
			<form:input type="text" path="targetDate" required="required" />
		</fieldset>

		<form:input type="hidden" path="id" name="id" />
		<form:input type="hidden" path="done" name="done" />
		<input type="submit" class="btn btn-success">
	</form:form>
</div>

<%@ include file="common/footer.jspf"%>
<script type="text/javascript">
	$('#targetDate').datepicker({
		format : 'yyyy-mm-dd'
	});
</script>