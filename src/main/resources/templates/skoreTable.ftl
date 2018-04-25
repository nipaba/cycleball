<#macro skore teams="">
 <table class="table table-striped">
    <thead>
      <tr>
        <th>Team</th>
        <#list teams as team>
        	<th>${team?index+1}</th>
        </#list>
        <th>Skore</th>
        <th>Body</th>
        <th>Position</th>
      </tr>
    </thead>
    <tbody>
    	<#list teams as team>
      		<tr>
	      		<td>${team.name}</td>
	      		<#list teams as team2>
	      			<#if team2?index == team?index >
	        			<td>###</td>
	        		<#else>
	        			<td>0:0</td>
	        		</#if>
	        	</#list>
	        	<td>-</td>
	        	<td>-</td>
	        	<td>-</td>
      		</tr>
      	</#list>
        </tbody>
  </table>
  </#macro>