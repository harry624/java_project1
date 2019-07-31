<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mortgage</title>
<link rel="stylesheet" type="text/css" href="./css/main.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
	<div class="centerDiv">
		<%@ include file="header.jsp" %>

		<div>
			<h2>Mortgage</h2>
			<table class="table table-striped table-sm">
			  <thead>
			    <tr>
			      <th scope="col">id</th>
			      <th scope="col">Fixed_Mortgage</th>		      
			      <th scope="col">Duration</th>
			      <th scope="col">APR</th>
			      <th scope="col">Points</th>
			      <th scope="col">Origination_Fee</th>
			      <th scope="col">Minimum_Payment</th>
			      <th scope="col">Maximum_Amount</th>
			      <th scope="col">Offering_Date</th>
			      <th scope="col">Expiration_Date</th>
			    </tr>
			  </thead>
			  
			  <tbody id="mortgageList">
	
			  </tbody>
			</table>		
		</div>

		
		<div>
			<h2>Update a Mortgage Product</h2>
			<form action="./updateMortgageServlet" method="GET">
				<table class="table table-striped table-sm">
				  <thead>
				    <tr>
				      <th scope="col">id</th>
				      <th scope="col">Fixed_Mortgage</th>		      
				      <th scope="col">Duration</th>
				      <th scope="col">APR</th>
				      <th scope="col">Points</th>
				      <th scope="col">Origination_Fee</th>
				      <th scope="col">Minimum_Payment</th>
				      <th scope="col">Maximum_Amount</th>
				      <th scope="col">Offering_Date</th>
				      <th scope="col">Expiration_Date</th>
				    </tr>
				  </thead>
				  <tbody>
				    <tr>
				      <th scope="row"><input type="text" class="form-control" name="id" aria-describedby="inputGroup-sizing-sm" required/></th>
				      <td><select name="fixed_Mortgage" id="inputState" class="form-control" aria-describedby="inputGroup-sizing-sm">
					   	<option selected>yes</option>
					    <option>no</option>
				       </select>
				  	  </td>
				      <td><input type="number" class="form-control" name="duration" aria-describedby="inputGroup-sizing-sm" required/></td>
				      <td><input type="text" class="form-control" name="apr" aria-describedby="inputGroup-sizing-sm" required/></td>
				      <td><input type="text" class="form-control" name="points" aria-describedby="inputGroup-sizing-sm" required/></td>
				      <td><input type="text" class="form-control" name="origination_Fee" aria-describedby="inputGroup-sizing-sm" required/></td>				      
				      <td><input type="text" class="form-control" name="minimum_Payment" aria-describedby="inputGroup-sizing-sm" required/></td>
				      <td><input type="number" class="form-control" name="maximum_Amount" aria-describedby="inputGroup-sizing-sm" required/></td>
					  <td><input type="date" class="form-control" name="offering_Date" aria-describedby="inputGroup-sizing-sm" required/></td>
				      <td><input type="date" class="form-control" name="expiration_Date" aria-describedby="inputGroup-sizing-sm" required/></td>
				    </tr>
				   </tbody> 
				</table>
				<div class="buttonDiv">
					<button type="submit" class="btn btn-secondary btn-sm">Submit</button>
					<button type="reset" class="btn btn-secondary btn-sm">Reset</button>
				</div>
			</form>
		</div>

		<div>
			<h2>Create a Mortgage Product</h2>
			<form action="./createMortgageServlet" method="GET">
				<table class="table table-striped table-sm">
				  <thead>
				    <tr>
				      <th scope="col">Fixed_Mortgage</th>		      
				      <th scope="col">Duration</th>
				      <th scope="col">APR</th>
				      <th scope="col">Points</th>
				      <th scope="col">Origination_Fee</th>
				      <th scope="col">Minimum_Payment</th>
				      <th scope="col">Maximum_Amount</th>
				      <th scope="col">Offering_Date</th>
				      <th scope="col">Expiration_Date</th>
				    </tr>
				  </thead>
				  <tbody>
				    <tr>
				      <th scope="row"><select name="fixed_Mortgage" id="inputState" class="form-control">
					   	<option selected>yes</option>
					    <option>no</option>
				       </select>
				  	  </th>
				      <td><input type="text" class="form-control" name="duration" required/></td>
				      <td><input type="text" class="form-control" name="apr" required/></td>
				      <td><input type="text" class="form-control" name="points" required/></td>
				      <td><input type="text" class="form-control" name="origination_Fee" required/></td>				      
				      <td><input type="text" class="form-control" name="minimum_Payment" required/></td>
				      <td><input type="text" class="form-control" name="maximum_Amount" required/></td>
					  <td><input type="date" class="form-control" name="offering_Date" required/></td>
				      <td><input type="date" class="form-control" name="expiration_Date" required/></td>
				    </tr>
				   </tbody> 
				</table>
				<div class="buttonDiv">
					<button type="submit" class="btn btn-secondary btn-sm">Submit</button>
					<button type="reset" class="btn btn-secondary btn-sm">Reset</button>
				</div>
			</form>
		</div>
			
		
	</div>


	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script type="text/javascript" src="./javascript/main.js"></script>
</body>
</html>