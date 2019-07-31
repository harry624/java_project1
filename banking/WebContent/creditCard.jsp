<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Credit Card</title>
<link rel="stylesheet" type="text/css" href="./css/main.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
	<div class="centerDiv">
		<%@ include file="header.jsp" %>
		<h2>Credit Card</h2>
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th scope="col">id</th>
		      <th scope="col">type</th>		      
		      <th scope="col">Apr</th>
		      <th scope="col">Credit_Limit</th>
		      <th scope="col">Reward_Eligible </th>
		      <th scope="col">Offering_Date</th>
		      <th scope="col">Expiration_Date</th>
		    </tr>
		  </thead>
		  
		  <tbody id="creditCardList">

		  </tbody>
		</table>
		<div>
			<h2>Update a Credit Card Product</h2>
			<form action="./updateCCProdServlet" method="GET">
			<table class="table table-striped">
			  <thead>
			    <tr>
			      <th scope="col">id</th> 
			      <th scope="col">Type</th>		      
			      <th scope="col">Apr</th>
			      <th scope="col">Credit_Limit</th>
			      <th scope="col">Reward_Eligible </th>
			      <th scope="col">Offering_Date</th>
			      <th scope="col">Expiration_Date</th>
			    </tr>
			  </thead>  
				 <tbody>
			    <tr>
			      <th scope="row"><input type="text" class="form-control" name="id" size="2" required/></th>
			      <td><input type="text" class="form-control" name="type" size="16" required/></td>
			      <td><input type="text" class="form-control" name="apr" size="8" required/></td>
			      <td><input type="text" class="form-control" name="credit_Limit" size="8" required/></td>
				  <td><select name="reward_Eligible" id="inputState" class="form-control">
					   	<option selected>yes</option>
					    <option>no</option>
				       </select>
				  </td>
				  <td><input type="date" class="form-control" name="offering_Date" size="8" required/></td>
			      <td><input type="date" class="form-control" name="expiration_Date" size="8" required/></td>
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
			<h2>Add a Credit Card Product</h2>
			<form action="./createCCProdServlet" method="GET">
			
				<table class="table table-striped" style="width:100%">
				  <thead>
				    <tr>
				      <th scope="col">Type</th>		      
				      <th scope="col">Apr</th>
				      <th scope="col">Credit_Limit</th>
				      <th scope="col">Reward_Eligible </th>
				      <th scope="col">Offering_Date</th>
				      <th scope="col">Expiration_Date</th>
				    </tr>
				  </thead>
				  
				  <tbody>
				    <tr>
				      <th scope="row"><input type="text" class="form-control" name="type" size="16" required/></th>
				      <td><input type="text" class="form-control" name="apr" size="8" required/></td>
				      <td><input type="text" class="form-control" name="credit_Limit" size="8" required/></td>
				      <td><select name="reward_Eligible" id="inputState" class="form-control">
					        <option selected>yes</option>
					        <option>no</option>
				      	   </select>
				      </td>
				      <td><input type="date" class="form-control" name="offering_Date" size="8" required/></td>
				      <td><input type="date" class="form-control" name="expiration_Date" size="8" required/></td>
				    </tr>
				   </tbody>
				</table>
				
				<div class="buttonDiv">
					<button type="submit" class="btn btn-secondary btn-sm" >Submit</button>
					<button type="reset" class="btn btn-secondary btn-sm">Reset</button>
				</div>
			</form>
		</div>
	</div>


	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script type="text/javascript" src="./javascript/main.js"></script>
</body>
</html>