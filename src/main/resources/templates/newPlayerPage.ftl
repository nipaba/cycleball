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


	<form action="/newPlayer" method="post">
		<@spring.bind "newPlayer"/>
		
		 <div class="form-group">
			<label for="firstname">Firstname</label>
			<@spring.formInput "newPlayer.firstname" "class='form-control' placeholder='firstname'"/>
	        <@spring.showErrors "<br>"/>
        </div>
		 <div class="form-group">
			<label for="firstname">Surname</label>
			<@spring.formInput "newPlayer.surname" "class='form-control' placeholder='surname'"/>
	        <@spring.showErrors "<br>"/>
        </div>
		 <div class="form-group">
			<label for="firstname">Birthdate</label>
			<@spring.formInput "newPlayer.birthdate" "class='form-control' placeholder='firstname'" "date" />
	        <@spring.showErrors "<br>"/>
        </div>
  	<button type="submit" class="btn btn-primary">Submit</button>
  	</form>
    
    
	<@f.footer />
</body>
</html>