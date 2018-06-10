	 app.controller("EventCtrl",function($scope,$rootScope,$timeout,$http){
	//the image
	    $scope.uploadme;

	     
	     $scope.saveContact=function(newcontact,uploadme)
		{
	    	 debugger;
	    	 console.log(newcontact);
		      console.log(uploadme);
			 var fd = new FormData();
		      var imgBlob = dataURItoBlob($scope.uploadme);
		      fd.append('file', imgBlob);
		      
		      console.log(imgBlob);
		      newcontact.regID=  1;
		      newcontact.imgBlob=  imgBlob;
		      console.log(newcontact);
			
		      	$http.post('rest/event/addRegistration',newcontact).success(function(pcdata) {
				$scope.promoCode = pcdata;
				angular.copy($scope.promoCode,$scope.promoCodeBackup); 
				$scope.pc = {};
				
			})
			.error(function()
			{
				
				console.log("Error while inserting the promoCode details!!");
			});
			
			$scope.showLabel=true;
			
		};
	    //you need this function to convert the dataURI
	    function dataURItoBlob(dataURI) {
	      var binary = atob(dataURI.split(',')[1]);
	      var mimeString = dataURI.split(',')[0].split(':')[1].split(';')[0];
	      var array = [];
	      for (var i = 0; i < binary.length; i++) {
	        array.push(binary.charCodeAt(i));
	      }
	      return new Blob([new Uint8Array(array)], {
	        type: mimeString
	      });
	    }
	 
	function init(){
		 $scope.regType = ["Self", "Group", "Corporate","Others"];
		
		
	}init();//init end of dropdown code
		
		
		
 });

