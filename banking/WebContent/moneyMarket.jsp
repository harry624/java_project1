<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Money Market</title>
<link rel="stylesheet" type="text/css" href="./css/main.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
</head>
<body>
	<div class="centerDiv">
		<%@ include file="header.jsp" %>
		
		<h2>Money Market</h2>
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th scope="col">id</th>
		      <th scope="col">name</th>		      
		      <th scope="col">MinBalance</th>
		      <th scope="col">MaxBalance</th>
		      <th scope="col">Compound_Day</th>
		      <th scope="col">Minimum_Deposit</th>
		      <th scope="col">Offering_Date</th>
		      <th scope="col">Expiration_Date</th>
		    </tr>
		  </thead>
		  
		  <tbody id="productsList">

		  </tbody>
		</table>
		<div>
			<h2>Update a Money Market Product</h2>
			<table class="table table-striped">
			  <thead>
			    <tr>
			      <th scope="col">id</th>
			      <th scope="col">name</th>		      
			      <th scope="col">MinBalance</th>
			      <th scope="col">MaxBalance</th>
			      <th scope="col">Compound_Day</th>
			      <th scope="col">Minimum_Deposit</th>
			      <th scope="col">Offering_Date</th>
			      <th scope="col">Expiration_Date</th>
			    </tr>
			  </thead>
			  
			  <tbody>
			    <tr>
			      <th scope="row"><input type="number" class="form-control" id="update_id" size="2" required/></th>
			      <td><input type="text" class="form-control" id="update_name" size="8" required/></td>
			      <td><input type="number" class="form-control" id="update_minBalance" size="8" required/></td>
			      <td><input type="number" class="form-control" id="update_maxBalance" size="8" required/></td>
			      <td><input type="number" class="form-control" id="update_compound_Day" size="8" required/></td>
			      <td><input type="number" class="form-control" id="update_minimum_Deposit" size="8" required/></td>
			      <td><input type="date" class="form-control" id="update_offering_Date" size="8" required/></td>
			      <td><input type="date" class="form-control" id="update_expiration_Date" size="8" required/></td>
			    </tr>
			   </tbody>
			</table>
			
			<div class="buttonDiv">
				<button type="submit" class="btn btn-secondary btn-sm" id="updateMM">submit</button>
				<button type="reset" class="btn btn-secondary btn-sm">reset</button>
			</div>
		
		</div>
		
		<div>
			<h2>Add a Money Market Product</h2>
			<table class="table table-striped" style="width:100%">
			  <thead>
			    <tr>
			      <th scope="col">name</th>		      
			      <th scope="col">MinBalance</th>
			      <th scope="col">MaxBalance</th>
			      <th scope="col">Compound_Day</th>
			      <th scope="col">Minimum_Deposit</th>
			      <th scope="col">Offering_Date</th>
			      <th scope="col">Expiration_Date</th>
			    </tr>
			  </thead>
			  
			  <tbody>
			    <tr>
			      <th scope="row"><input type="text" class="form-control" id="name" size="8" required/></th>
			      <td><input type="number" class="form-control" id="minBalance" size="8" required/></td>
			      <td><input type="number" class="form-control" id="maxBalance" size="8" required/></td>
			      <td><input type="number" class="form-control" id="compound_Day" size="8" required/></td>
			      <td><input type="number" class="form-control" id="minimum_Deposit" size="8" required/></td>
			      <td><input type="date" class="form-control" id="offering_Date" size="8" required/></td>
			      <td><input type="date" class="form-control" id="expiration_Date" size="8" required/></td>
			    </tr>
			   </tbody>
			</table>
			
			<div class="buttonDiv">
				<button type="button" class="btn btn-secondary btn-sm" id="createMKProduct">submit</button>
				<button type="reset" class="btn btn-secondary btn-sm">reset</button>
			</div>

		</div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script type="text/javascript" src="./javascript/main.js"></script>
	
	</div>
</body>
</html>