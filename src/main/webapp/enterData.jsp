<div class="container-fluid">
	<h3 style="text-align: center">Enter Your Stats</h3>
	<div class="row textAlignCentered" style="padding-top:1%">
		<div valign="top">
			<label for="currentWeight" class="enterDataLabel paddingTop5">Current
				Weight </label>
		</div>
		<div valign="top">
			<input ng-model="currentWeight" type="text"
				class="enterDataInput form-condivol paddingTop5" id="currentWeight">
		</div>
	</div>
	<div class="row textAlignCentered" style="padding-top:1%">
		<div valign="top">
			<label for="currentBodyFat" class="enterDataLabel paddingTop5">Current
				Body Fat </label>
		</div>
		<div valign="top">
			<input type="text" ng-model="currentBodyFat" name="currentBodyFat"
				class="enterDataInput form-condivol paddingTop5" />
		</div>
	</div>
	<div class="row textAlignCentered paddingTop5" style="padding-top:1%">
		<div colspan="2">
			<input value="Submit" class="usernameBox textAlignCentered"
				ng-click="submitAndViewProgress()">
		</div>
	</div>
</div>