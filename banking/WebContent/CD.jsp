<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CD</title>
<link rel="stylesheet" type="text/css" href="./css/main.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
	<div class="centerDiv">
		<%@ include file="header.jsp" %>
		<div></div>
			<h2>CD</h2>
			<table class="table table-striped">
			  <thead>
			    <tr>
			      <th scope="col">id</th>
			      <th scope="col">CD_Type</th>		      
			      <th scope="col">Minimum_Deposit</th>
			      <th scope="col">Above_100000</th>
			      <th scope="col">CD_Terms</th>
			      <th scope="col">APR</th>
			      <th scope="col">Compound_Day</th>
			      <th scope="col">Offering_Date</th>
			      <th scope="col">Expiration_Date</th>
			    </tr>
			  </thead>
			  
			  <tbody id="CDList">
	
			  </tbody>
			</table>
		
		<div class="input-group input-group-sm mb-3">
			<h2>Update a CD Product</h2>
			<table class="table table-striped table-sm">
			  <thead>
			    <tr>
			      <th scope="col">id</th>
			      <th scope="col">CD_Type</th>		      
			      <th scope="col">Minimum_Deposit</th>
			      <th scope="col">Above_100000</th>
			      <th scope="col">CD_Terms</th>
			      <th scope="col">APR</th>
			      <th scope="col">Compound_Day</th>
			      <th scope="col">Offering_Date</th>
			      <th scope="col">Expiration_Date</th>
			    </tr>
			  </thead>
			  
			  <tbody>
			    <tr>
			      <th scope="row"><input type="text" class="form-control" name="id" size="2" required/></th>
			      <td><select name="CD_Type" id="inputState" class="form-control">
					   	<option selected>Fixed CD</option>
					    <option>Market CD</option>
				       </select>
				  </td>
			      <td><input type="number" class="form-control" name="minimum_Deposit" size="16" required/></td>
			      <td><select name="Above_100000" id="inputState" class="form-control">
					   	<option selected>yes</option>
					    <option>no</option>
				       </select>
				  </td>
				  <td><select name="CD_Terms" id="inputState" class="form-control">
					   	<option selected>1 year</option>
					    <option>2 years</option>
					    <option>3 years</option>
					    <option>4 years</option>
					    <option>5 years</option>
					    <option>6 years</option>
					    <option>7 years</option>
					    <option>8 years</option>
					    <option>9 years</option>
					    <option>10 years</option> 
				       </select>
				  </td>
				  <td><input type="number" class="form-control" name="apr" size="8" required/></td>
				  <td><input type="number" class="form-control" name="compound_Day" size="8" required/></td>
				  <td><input type="date" class="form-control" name="offering_Date" size="8" required/></td>
			      <td><input type="date" class="form-control" name="expiration_Date" size="8" required/></td>
			    </tr>
			   </tbody> 
			  </tbody>
			</table>
			
			<div class="buttonDiv">
				<button type="submit" class="btn btn-secondary btn-sm">Submit</button>
				<button type="reset" class="btn btn-secondary btn-sm">Reset</button>
			</div>
		</div>
					
		<div>
			<h2>Create a CD product</h2>
			<table class="table table-striped">
			  <thead>
			    <tr>
			      <th scope="col">CD_Type</th>		      
			      <th scope="col">Minimum_Deposit</th>
			      <th scope="col">Above_100000</th>
			      <th scope="col">CD_Terms</th>
			      <th scope="col">APR</th>
			      <th scope="col">Compound_Day</th>
			      <th scope="col">Offering_Date</th>
			      <th scope="col">Expiration_Date</th>
			    </tr>
			  </thead>
			  
			  <tbody>
				<tr>	      
				  <th scope="row">
				  	<select name="CD_Type" id="inputState" class="form-control">
					   	<option selected>Fixed CD</option>
					    <option>Market CD</option>
				    </select>
				  </th>
			      <td><input type="number" class="form-control" name="minimum_Deposit" size="16" required/></td>
			      <td><select name="Above_100000" id="inputState" class="form-control">
					   	<option selected>yes</option>
					    <option>no</option>
				       </select>
				  </td>
				  <td><select name="CD_Terms" id="inputState" class="form-control">
					   	<option selected>1 year</option>
					    <option>2 years</option>
					    <option>3 years</option>
					    <option>4 years</option>
					    <option>5 years</option>
					    <option>6 years</option>
					    <option>7 years</option>
					    <option>8 years</option>
					    <option>9 years</option>
					    <option>10 years</option> 
				       </select>
				  </td>
				  <td><input type="number" class="form-control" name="apr" size="8" required/></td>
				  <td><input type="number" class="form-control" name="compound_Day" size="8" required/></td>
				  <td><input type="date" class="form-control" name="offering_Date" size="8" required/></td>
			      <td><input type="date" class="form-control" name="expiration_Date" size="8" required/></td>
			    </tr>
			  </tbody>
			</table>
			
			<div class="buttonDiv">
				<button type="submit" class="btn btn-secondary btn-sm">Submit</button>
				<button type="reset" class="btn btn-secondary btn-sm">Reset</button>
			</div>
		</div>
			
		
	</div>


	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script type="text/javascript" src="./javascript/main.js"></script>
	
</body>
</html>