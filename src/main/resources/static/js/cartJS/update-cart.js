/**
 * 
 */
 
 jQuery(document).ready(function($) {

		 $.ajax({
		            type: 'GET',
		            url: '/gotrip/showCartItems',
		            data:{},
		            async:false,
		            success: function (data) {
		     	
		                console.log(data);
		                
		                $('#cartIcon').attr("data-notify",data);
		               
		            },
		    		error: function(jqXHR,textStatus) {
		    			 
						console.log(jqXHR);
						console.log(textStatus); 
						console.log(jqXHR.responseText);
					}
		                	                
		});		
	
	})