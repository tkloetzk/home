<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		
		<!-- Latest compiled and minified CSS -->
		<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js"></script>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.1.1.min.js"
			integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="
			crossorigin="anonymous"></script>
		<script>
			window.jQuery
					|| document
							.write('_$tag_______________________________________________________\x3C/script>')
		</script>
		
		<!-- attempt to load AngularJS from CDN -->
		<script
			src="https://opensource.keycdn.com/angularjs/1.5.8/angular.min.js"></script>
		<!-- if AngularJS fails to load fallback a local version -->
		<script>
			window.angular
					|| document
							.write('<script src="scripts/external/angular.min.js"><\/script>');
		</script>
		
		<!-- attempt to load AngularJS Route from CDN -->
		<script src="https://code.angularjs.org/1.5.8/angular-route.min.js"></script>
		<!-- if AngularJS fails to load fallback a local version -->
		<script>
			window.angular
					|| document
							.write('<script src="scripts/external/angular-route.min.js"><\/script>');
		</script>
		<!-- Latest compiled and minified JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
		
		<spring:url value="/resources/scripts/app.js" var="appJs" />
		<spring:url value="/resources/scripts/site_config.js" var="siteConfigJS" />
		<meta name="viewport"
			content="width=device-width, initial-scale=1, maximum-scale=1">
		
		<spring:url value="/resources/styles/main.css" var="mainCss" />
		<spring:url value="/resources/images/iOS/homeicon.png" var="homeicon" />
		
		<link href="${homeicon}" rel="apple-touch-icon" />
		<link href="${mainCss}" rel="stylesheet" />
		<script src="${appJs}"></script>
		<script src="${siteConfigJS}"></script>
	</head>
	
	<body ng-app="homeApp">
		<div class="container">
			<div data-ng-view></div>
		</div>
	</body>
	
	
</html>