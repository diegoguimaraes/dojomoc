$(document).ready(function(){
    
	module("Kata 15 - Quantidade de binários que não combinam");
	
	function testeQuantidadeBinariosSemBitsUmAdjacentes(quantidade, esperado) {
		equals(BinaryMatch.find(quantidade), esperado);
	}
	function testeListaBinario(numBits, esperado) {
		same(BinaryMatch.obterListaBinarios(numBits), esperado);
	}
	
	test("Se o valor passado for 0, retorna 0", function() {
		testeQuantidadeBinariosSemBitsUmAdjacentes(0, 0);
	});
	
	test("Se o valor passado for 1, retorna 0", function() {
		testeQuantidadeBinariosSemBitsUmAdjacentes(1, 0);
	});
	
	test("Se o valor passado for 2, retorna 3",function() {
		testeQuantidadeBinariosSemBitsUmAdjacentes(2,3);
	});
	
	test("Se o valor passado for 3, retorna 5", function() {
		testeQuantidadeBinariosSemBitsUmAdjacentes(3,5);
	});
	
	test("Se o valor passado for 4, retorna 8", function(){
		testeQuantidadeBinariosSemBitsUmAdjacentes(4, 8);
	});
	
	test("Se o valor passado for 5, retorna 12", function(){
		testeQuantidadeBinariosSemBitsUmAdjacentes(5, 13);
	});
	
	test("Se o valor passado for 6, retorna 21", function(){
		testeQuantidadeBinariosSemBitsUmAdjacentes(6, 21);
	});
	
	module("Pegar lista de strings binárias")
	
	test("Se o valor for 0 return lista vazia",function()
	{
		testeListaBinario(0, []);
	});
	
	test("Se o valor for 1 return lista com 2 numeros binarios",function()
	{
		testeListaBinario(1, ['0','1']);
	});
	
	test("Se o valor for 2 return lista com 4 numeros binarios",function()
	{
		testeListaBinario(2, ['0','1', '10', '11']);
	});
	
	test("Se a quantidade de digitos for 3, lista com 8 números binários", function(){
		testeListaBinario(3, ['0', '1', '10', '11', '100', '101', '110', '111']);
	});
	
	module("Converter valor decimal para string binária");
	
	test("Se passar 0, retorna 0", function(){		
		testeConverterDecimalParaBinario(0, '');
	});
	
	function testeConverterDecimalParaBinario(valorDecimal, stringBinariaEsperada){
		same(BinaryMatch.converterNumeroParaStringBinaria(valorDecimal), stringBinariaEsperada);
	}
	
	test("Se passar 1, retorna 1", function(){
		testeConverterDecimalParaBinario(1, '1');
	});
	
	
	test("Se passar 2, retorna 10", function(){
		testeConverterDecimalParaBinario(2, '10');
	});
	
	test("Se passar 3, retorna 11", function(){
		testeConverterDecimalParaBinario(3, '11');
	});
	
	test("Se passar 7, retorna 111", function(){
		testeConverterDecimalParaBinario(7, '111');
	});
	
	test("Se passar 254, retorna 11111110", function(){
		testeConverterDecimalParaBinario(254, '11111110');
	});
  });