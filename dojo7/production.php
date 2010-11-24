<?php
/**
 * Código de Produção
 *
 * @author DojoMoc
 * @version 0.1
 * @package production 
 */

class Chica
{
  public $admirada=false;

}

class Gato
{
  public $vivo=true;
  public $berrou=false;
}

class Eu
{
  
  function atirarPauNoGato($gato,$chica=null)
  {
    $gato->berrou=true;
    if($chica!=null)
    {
      $chica->admirada = true;
    }
  }
}
?>
