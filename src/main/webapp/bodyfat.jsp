<div class="container">
	<h2 id='displayNamesHeader'>Please select your name. Or choose
	other to create one</h2>
	<div id='centerUsernameBox' >
		<div class="textAlignCentered">
			<div ng-repeat="user in usersList">
				<div class="row">
					<input class='usernameBox' type="submit" name="user"
						value="{{user.username}}" ng-click="goToEndData(user.userID)"/>
				</div>
			</div>
			<div class="row">
				<input class='usernameBox' type="submit" name="user"
					value="other" />
			</div>
		</div>
	</div>
</div>