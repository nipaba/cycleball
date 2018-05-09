<#macro menu leagues>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <a class="navbar-brand" href="#">RadbalManager 2.0.0</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	
	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	    <ul class="navbar-nav mr-auto">
	      <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	          Quick action
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
	          	<a class="dropdown-item" href="/newPlayer">New player</a>
	          	<a class="dropdown-item" href="/newLicence">New licence</a>
	          	<a class="dropdown-item" href="/view">General View</a>
	        </div>
	      </li>
	      <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	          Liga
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
	        	<#list leagues as league>
	          		<a class="dropdown-item" href="#">${league.name!""}</a>
	          	</#list>
	        </div>       
	      </li>
	      <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	          Help
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
	          		<a class="dropdown-item" href="#">About</a>
	          		<a class="dropdown-item" href="#">Contact</a>
	          		<a class="dropdown-item" href="#">Help</a>
	        </div>       
	      </li>
	      
	    </ul>
	    <form class="form-inline my-2 my-lg-0">
	      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
	      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
	    </form>
	  </div>
	</nav>
</#macro>