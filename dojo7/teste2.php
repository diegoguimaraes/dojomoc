<?php
require_once 'PHPUnit/Framework.php';
require 'production.php';

/**
 * Minha classe de teste no PHPUnit
 * 
 * @author DojoMoc
 * @version 0.1
 * @package Tests
 */
class MyTestClass extends PHPUnit_Framework_TestCase
{
  var $gato;
  var $eu;
  var $chica;
  //method called before each test method
  public function setUp()
  {
    $this->gato = new Gato();
    $this->eu = new Eu();
    $this->chica = new Chica();
  }

  public function testSeOPauNaoForAtiradoNoGatoDonaChicaNaoDeveEstarAdmirada()
  {
    $this->assertFalse($this->chica->admirada);
  }

  public function testSeOPauForAtiradoNoGatoOMesmoNaoDeveMorrer()
  {
    $this->eu->atirarPauNoGato($this->gato);

    $this->assertTrue($this->gato->vivo);

  }

  public function test_AtireiOPauNoGato_GatoTemQueBerrar()
  {
    $this->eu->atirarPauNoGato($this->gato);
    $this->assertTrue($this->gato->berrou);
  }
  
  public function test_AtireiOPauNoGato_GatoTemQueBerrar_DonaChicaAdmira_se()
  {
    $this->eu->atirarPauNoGato($this->gato,$this->chica);
    $this->assertTrue($this->chica->admirada);
  }

}

?>
