
<%@ include file="header.jsp"%>

<div class="container">

	<!-- Static navbar -->
	<div class="navbar navbar-default" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="<spring:url value="/" />">Spring Learning</a>
			</div>
			<div class="navbar-collapse collapse">


				<ul class="nav navbar-nav">
					<li class="${current == 'index' ? 'active' : ''}"><a
						href='<spring:url value="/" />'>Home</a></li>
					<li class="${current == 'register' ? 'active' : ''}"><a
						href="<spring:url value="/register.html" />">Register</a></li>
					<li class="${current == 'shopping' ? 'active' : ''}"><a
						href="<spring:url value="/learning.html" />">learning</a></li>
					<li class="${current == 'shopping' ? 'active' : ''}"><a
						href="<spring:url value="/shopping.html" />">Spring</a></li>
				</ul>

			</div>
			<!--/.nav-collapse -->
		</div>
		<!--/.container-fluid -->
	</div>
	
	
	<div class="jumbotron">
	<h1>Hello Spring MVC</h1>
	<p>
	<h3>
		Let's build a better Enterprise
		<h3>
			${commonmessage}
			</p>
			<p>
				<a class="btn btn-lg btn-primary" href="../../components/#navbar"
					role="button">Spring Docs &raquo;</a>
			</p>
</div>
</div>

<%@ include file="footer.jsp"%>
<!-- Main component for a primary marketing message or call to action -->



</html>