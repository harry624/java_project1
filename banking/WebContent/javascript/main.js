$(document).ready(function(){
    console.log( "ready!" );

    window.onload = function() {
    	var url = window.location.href;
    	if (url.endsWith("moneyMarket.jsp")) {
        	console.log("money market loaded");

    		getmmlist();
    		return;
    	}else if (url.endsWith("creditCard.jsp")) {
        	console.log("creditCard loaded");
    		getcclist();
    		return;
    	}else if (url.endsWith("mortgage.jsp")) {
        	console.log("mortgage loaded");
    		getmlist();
    		return;
    	}
    }
    
    //home
	$('#homeBtn').click(function(){
	    console.log( "homebtn clicked!" );
		location.href="./home.jsp";
	});

	//money market	
	function getmmlist(){
	    $.ajax({
			  method: "GET",
			  url: "./moneyMarketServlet",
			  data: {},
			  error: function(){
				  console.log( "error" );
			  },
			  success: function(data){
				$('#productsList').append(data);
			  }
	    });
	}
	
	$('#moneyButtonBtn').click(function(){
	    console.log( "moneyButtonBtn clicked!" );
		location.href = "./moneyMarket.jsp";

	});
	
	$('#updateMM').click(function(){
		$.ajax({
			  method: "GET",
			  url: "./updateMKProuctServlet",
			  data: {id : $('#update_id').val(),
				  	name : $('#update_name').val(), 
				  	minBalance: $('#update_minBalance').val(), 
				  	maxBalance : $('#update_maxBalance').val(), 
				  	compound_Day : $('#update_compound_Day').val(),
				  	minimum_Deposit : $('#update_minimum_Deposit').val(),
				    offering_Date : $('#update_offering_Date').val(),
				    expiration_Date : $('#update_expiration_Date').val()
			  },
			  error: function(){
				  console.log("error");
			  },
			  success: function(){
				  $('.mmList').remove();
				  $('.centerDiv').after("<div class=\"alert alert-success\" role=\"alert\">update product success</div>")
				  getmmlist();
				  $('.alert alert-success').remove();
				  console.log("success");
			  }
		});
	})
	
	$('#createMKProduct').click(function(){
		$.ajax({
			  method: "GET",
			  url: "./createMKProuctServlet",
			  data: {name : $('#name').val(), 
				  	minBalance: $('#minBalance').val(), 
				  	maxBalance : $('#maxBalance').val(), 
				  	compound_Day : $('#compound_Day').val(),
				  	minimum_Deposit : $('#minimum_Deposit').val(),
				    offering_Date : $('#offering_Date').val(),
				    expiration_Date : $('#expiration_Date').val()
			  },
			  error: function(){
				  console.log("error");
			  },
			  success: function(){
				  $('.mmList').remove();
				  $('.centerDiv').before("<div class=\"alert alert-success\" role=\"alert\">create product success</div>")
				  getmmlist();
				  $('.alert alert-success').remove();
				  console.log("success");
			  }
		});
	});
	
	//credit card
	$('#creditCardBtn').click(function(){
	    console.log( "creditCardBtn clicked!" );
	    
		location.href="./creditCard.jsp";

	});
	
	function getcclist(){
	    $.ajax({
			  method: "GET",
			  url: "./CreditCardServlet",
			  data: {},
			  error: function(){
				  console.log( "error" );
			  },
			  success: function(data){
				$('#creditCardList').append(data);
			  }
	    });
	}
	
	
	
	//cd
	$('#CDBtn').click(function(){
	    console.log( "CDBtn clicked!" );
		location.href="./CD.jsp";
	});
	
	
	//mortgage
	$('#mortgageBtn').click(function(){
	    console.log( "mortgageBtn clicked!" );
		location.href="./mortgage.jsp";
	});
	
	function getmlist(){
	    $.ajax({
			  method: "GET",
			  url: "./MortgageServlet",
			  data: {},
			  error: function(){
				  console.log( "error" );
			  },
			  success: function(data){
				  console.log("list reloaded")
				$('#mortgageList').append(data);
				
			  }
	    });
	}
	
})