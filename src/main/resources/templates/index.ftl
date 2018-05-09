<#import "pagetools/menu.ftl" as m>
<#import "pagetools/header.ftl" as h>
<#import "pagetools/footer.ftl" as f>
<#import "skoreTable.ftl" as s>

<!DOCTYPE html>
<html lang="en">
	<@h.header /> 
<body>

 	<@m.menu leagues=leagues /> 
  
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
    
    
    <@s.skore teams=teams />
    
    
	<@f.footer />
</body>
</html>