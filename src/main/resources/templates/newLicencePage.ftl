<#import "pagetools/menu.ftl" as m>
<#import "pagetools/header.ftl" as h>
<#import "pagetools/footer.ftl" as f>
<#import "skoreTable.ftl" as s>

<#import "/spring.ftl" as spring />

<!DOCTYPE html>
<html lang="en">
	<@h.header /> 
<body>

 	<@m.menu leagues=leagues /> 


	<form action="/newLicence" method="post">
		<@spring.bind "newLicence"/>
		
		 <div class="form-group">
			<label for="firstname">Year</label>
			<@spring.formInput "newLicence.year" "class='form-control' min='1900' max='2018'" "number"/>
	        <@spring.showErrors "<br>"/>
        </div>
		 <div class="form-group">
			<label for="firstname">Number</label>
			<@spring.formInput "newLicence.number" "class='form-control' placeholder='number'"/>
	        <@spring.showErrors "<br>"/>
        </div>
        <div class="form-group">
		  <label for="sel1">Hráč</label>
		  <@spring.formSingleSelect "newLicence.playerHashCode" players "class='form-control'"/>
		  <@spring.showErrors "<br>"/>
		</div> 
  	<button type="submit" class="btn btn-primary">Submit</button>
  	</form>
    
    
	<@f.footer />
</body>
</html>