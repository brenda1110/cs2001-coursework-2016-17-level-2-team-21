<?php
$host = "localhost";
$db_user ="group21";
$db_password="panos";
$db_name = "test";

$con = mysqli_connect($host,$db_user,$db_password,$db_name);
$sql = "select Menuname from rediron;";
//$sql = "select * from subs;";
//echo"connection made";
$result =  mysqli_query($con,$sql);


$response = array();

while($row = mysqli_fetch_assoc($result))
{
array_push($response,array("Menuname"=>$row["Menuname"]));
//array_push($response,array("Menuname"=>$row["Menuname"],"Price"=>$row["Price"]));
	
}
echo json_encode($response);
mysqli_close($con);
?>