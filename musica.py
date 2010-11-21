import unittest

class musicaPlagio:
	def verificaPlagio(self, musicaOriginal, musicaParaVerificar):
		ehPlagio = True
		if len(musicaOriginal.split(' ')) == 1 and len(musicaParaVerificar.split(' '))==1:
			return ehPlagio

		if musicaOriginal == musicaParaVerificar:
			return ehPlagio

		else:
			original = musicaOriginal.split(" ")
			possivelPlagio = musicaParaVerificar.split(" ")
			i = 0
			while ehPlagio and (i<(len(possivelPlagio)-1)):
				distanciaOriginal = self.calculaDistancia(original[i],original[i+1])
				distanciaPossivelPlagio = self.calculaDistancia(possivelPlagio[i],possivelPlagio[i+1])
				ehPlagio = (distanciaOriginal == distanciaPossivelPlagio)
				i=i+1
			return ehPlagio

	def calculaDistancia(self, primeiraNota, segundaNota):
		dic = {'A':0, 'A#':1, 'Bb':1, 'B':2,'C':3,'C#':4,'Db':4, 'D':5, 'D#':6,
			   'Eb':6, 'E':7, 'F':8,'F#':9,'Gb':9, 'G':10,'G#':11}

		return dic[primeiraNota] - dic[segundaNota]


class testeMusicaPlagio(unittest.TestCase):

	musicaOriginal = "A"

	def testPassando_Musica_A_Plagio_B_A_musica_eh_plagio(self):
		musica = musicaPlagio()
		musicaParaVerificar = "B"
		ehPlagio = musica.verificaPlagio(self.musicaOriginal, musicaParaVerificar)
		self.assertTrue(ehPlagio)

	def testSe_Somente_Uma_Nota_For_Passada_Eh_Plagio(self):
		musica = musicaPlagio()
		self.assertTrue(musica.verificaPlagio("A","B"))


	def testSe_Duas_Notas_De_Diferentes_Tonalidades_Nao_Eh_plagio(self):
		musica = musicaPlagio()
		self.assertFalse(musica.verificaPlagio("A C","A E"))

	def testSe_Uma_Sequencia_For_Igual_A_outra_eh_plagio(self):
		musica = musicaPlagio()
		self.assertTrue(musica.verificaPlagio("A B C","A B C"))

	def testVerifica_Distancia_Das_Notas(self):
		musica = musicaPlagio()
		self.assertFalse(musica.verificaPlagio("A B C","C B A"))

	def testVerifica_Excecao_Das_Distancias_Das_Notas(self):
		pass



if __name__ == '__main__':
	unittest.main()
