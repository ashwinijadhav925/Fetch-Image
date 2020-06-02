<?php

$servername = "localhost";
$username = "root";
$password = "";
$database = "fetch_imgdb";

$conn = new mysqli($servername, $username, $password, $database);
 
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$sql = "select location_name from image_tb";
	
	$res = mysqli_query($conn,$sql);
	$result = array();
	
	$url = "http://192.168.43.249/Images/getImage.php?location_name=";
	while($row = mysqli_fetch_array($res)){
		array_push($result,array('url'=>$url.$row['location_name']));
	}
	
	echo json_encode(array("result"=>$result));
	
	mysqli_close($con);
?>
