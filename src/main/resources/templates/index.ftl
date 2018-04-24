<#import "menu.ftl" as m>
<#import "header.ftl" as h>
<#import "footer.ftl" as f>

<!DOCTYPE html>
<html lang="en">
	<@h.header /> 
<body>

 	<@m.menu leagues=leagues /> 
    <h2>Radball manager v0.1</h2>
  
    <ul>
    	<#list teams as team>
    	
    	<li>${team.name}</li>
    	
    	</#list>
    </ul>	
-------------------------
    <ul>	
        	
    	<#list matches as match>
    	<li>${match.round}, ${match.matchNo}, ${match.team1.name} - ${match.team2.name}</li>
    	

    	</#list>
    </ul>
    
    
    
    
	<@f.footer />
</body>
</html>