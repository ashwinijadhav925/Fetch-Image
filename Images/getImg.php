<?php

$db_host = 'localhost';
    $db_user = 'root';
    $db_pass = '';
    $db_name= 'fetch_imgdb';

$result = array();
$inputJSON = file_get_contents('php://input');
$input = json_decode($inputJSON,TRUE);    
$place= $input['placename'];  
    $con = mysqli_connect($db_host, $db_user, $db_pass, $db_name);
    
if(!$con)
{
    echo "Connection error".mysqli_connect_error();
}
else
{
    //echo "Connection established";
}
$sql = "select * from image_tb where location_name='$place'";
	
	$res = mysqli_query($con,$sql);
	//$result['error'] = "no url";
    //$infomation ="";
	
	$url = "http://192.168.43.249/Images/";

    //echo "Rows".mysqli_num_rows($res);
	while($row = mysqli_fetch_array($res)){
        
        $result['location_name'] = $row['location_name'];
	       $result['url'] = $url.$row['image_name'];
        $result['info'] = $row["info"]; 
        
        //$result['url'] = "kjsdheskjfhksd";
        
        //$information = $row["info"];
	//echo json_encode(array("result"=>$result));

//$result = "$url";
//echo $result;
   //echo "".$row["location_name"]."<br>";
   //echo "".$result."<br>";//.$row.["info"]." ";
   //echo "".$information."<br><br>";
    }
echo json_encode($result);
mysqli_close($con);	
?>