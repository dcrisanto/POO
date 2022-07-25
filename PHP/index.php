<?php
require_once('car.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('account.php');

$uberX = new UberX("AQW", new Account("Luis Mendoza", 47634892), "Chevrolet", "Sparl");
$uberX->printDataCar();
$uberPool = new UberPool("AORG", new Account("Carlos Rodriguez", 47834945), "Dodge", "Attitude");
$uberPool->printDataCar();

?>