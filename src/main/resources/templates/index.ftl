<#import "menu.ftl" as m>
<#import "header.ftl" as h>
<#import "footer.ftl" as f>

<!DOCTYPE html>
<html lang="en">
	<@h.header /> 
<body>

 	<@m.menu leagues=leagues /> 
    <h2>Radball manager v0.1</h2>
  
    
	<@f.footer />
</body>
</html>