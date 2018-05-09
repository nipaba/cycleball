<#import "pagetools/menu.ftl" as m>
<#import "pagetools/header.ftl" as h>
<#import "pagetools/footer.ftl" as f>
<#import "skoreTable.ftl" as s>

<!DOCTYPE html>
<html lang="en">
	<@h.header /> 
<body>

 	<@m.menu leagues=leagues /> 
  	<div class="container">
	  	<div class="row">
	  	  	<div class="col-sm-4">
	  	  		<h2>Players</h2>
			    <ul>
			    	<#list players as player>
			    		<li>${player.firstname} ${player.surname}
			    			<ul>
			    				<#list player.licences as licence>
			    				     <li>Year ${licence.year} - Licence Number ${licence.number}</li>
			    				</#list>
			    			</ul>
			    		</li>
			    	</#list>
			    </ul>	
			</div>
	  		<div class="col-sm-4">
		  		<h2>Licences</h2>
			    <ul>	
			        	
			    	<#list licences as licence>
			    		<li>${licence.year} - ${licence.number}</li>
			    	</#list>
			    </ul>
	    	</div>
	     </div>
    </div>
	<@f.footer />
</body>
</html>