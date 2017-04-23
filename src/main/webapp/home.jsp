<%--
  Created by IntelliJ IDEA.
  User: Tucker Kloetzke
  Date: 10/27/2016
  Time: 10:41 PM
  To change this template use File | Settings | File Templates.
--%>
<div ng-controller="homeCtrl" class="container">
    <div class="row">
  		<a class="col-sm-6" href="<%=request.getContextPath()%>/#/bodyfat"> <img
          class="homeIcons" id="bodyFatIcon" src="/home/resources/images/main/body_fat.jpg"
          alt="bodyfat" /></a>
  		<a class="col-sm-6"><img
          class="homeIcons" id="movieIcon" src="/home/resources/images/main/movieicon.png"
          alt="movie" /></a>
    </div>
</div>