//production.js
var BinaryMatch = {
	find: function(num)
	{
		if(num<=1)
			return 0;
		var listaBinarios = this.obterListaBinarios(num);
		var qtdQueNaoAtendeOCriterio = listaBinarios.length;
		for(i=0;i<listaBinarios.length;i++)
			if(listaBinarios[i].lastIndexOf('11')!=-1)
				qtdQueNaoAtendeOCriterio--;
				
		return qtdQueNaoAtendeOCriterio;
	},

	obterListaBinarios: function(bits) {
		if(bits==0)
			return [];
		var listaBinarios = ['0'];
		for(i=1; i < Math.pow(2, bits); i++){
			var binario = this.converterNumeroParaStringBinaria(i);
			listaBinarios.push(binario);
		}
		return listaBinarios;
	},
	
	converterNumeroParaStringBinaria: function(numero)
	{
		var restos='';
		while(numero > 0){
			var resto = numero%2;
			numero = parseInt(numero/2,10);
			restos = resto + restos;
		}
		return restos;
	}
};
