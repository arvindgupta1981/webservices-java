<html>
 <head>
  <title>Form to create a new resource</title>
 </head>
<body>
	<form action="departments">
	<label for="id">Department ID</label>
	<input name="empId" />
	<br/>
	<label for="name">Name</label>
	<input name="name" />
	<br/>
	<br/>
	<label for="salary">Salary</label>
	<input name="salary" />
	<input type="hidden" name="action" />
	<br/>
	<input type="submit" value="Add Department" onclick="this.form.action.value='add';this.form.method='POST';"/>
	<input type="submit" value="Update Department"  onclick="this.form.action.value='update';this.form.method='PUT';"/>
	<input type="submit" value="Delete Department"  onclick="this.form.action.value='delete';this.form.method='DELETE';"/>
	<input type="submit" value="Get Department"  onclick="this.form.action.value='get';this.form.method='GET';"/>
	<input type="submit" value="Get All Departments"  onclick="this.form.action.value='gets';this.form.method='GET';"/>
	<input type="submit" value="Previous"  onclick="this.form.action.value='previous';this.form.method='GET';"/>
	<input type="submit" value="Next"  onclick="this.form.action.value='next';this.form.method='GET';"/>
	</form>
</body>
</html> 
 