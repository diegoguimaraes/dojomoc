"""

"""

import unittest

class AreasTest(unittest.TestCase):

    #def setUp(self):
    def testSeForemPassadasCoordenadasZeroRetornaTrue(self):
        a = Areas()
        retangulo1 = Retangulo((0,0),(0,0))
        retangulo2 = Retangulo((0,0),(0,0))
        
        saida = a.estaSobreposto(retangulo1,retangulo2)
        self.assertTrue(saida)

    def testSeForemPassadasCoordenadasPuntuaisDiferentesRetornaFalse(self):
        a = Areas()
        
        retangulo1 = Retangulo((1,1),(1,1))
        retangulo2 = Retangulo((2,2),(2,2))

        saida = a.estaSobreposto(retangulo1,retangulo2)
        self.assertFalse(saida)
        
    def testSeOsDoisRetangulosTemOsMesmosPontosIniciaisRetornaTrue(self):
        a = Areas()
        retangulo1 = Retangulo((2,2),(6,4))
        retangulo2 = Retangulo((2,2),(2,2))

        saida = a.estaSobreposto(retangulo1,retangulo2)
        self.assertTrue(saida)
        
    def testSeOsDoisRetangulosTemOsMesmosPontosFinaisRetornaTrue(self):
        a = Areas()
        retangulo1 = Retangulo((2,4),(6,4))
        retangulo2 = Retangulo((2,2),(6,4))

        saida = a.estaSobreposto(retangulo1,retangulo2)
        self.assertTrue(saida)

    def testSeOsDoisRetangulosTemPontosIniciaisEFinaisDiferentesRetornaTrue(self):
        a = Areas()
        retangulo1 = Retangulo((2,2),(4,4))
        retangulo2 = Retangulo((3,3),(6,6))
        saida = a.estaSobreposto(retangulo1,retangulo2)
        self.assertTrue(saida)

    def testSe11EstaContidoEm0022(self):
        r = Retangulo((0,0),(2,2))
        saida = r.contemPonto((1,1))
        self.assertTrue(saida)
    
        
class Retangulo:
    def  __init__(self, ponto_inicial, ponto_final):
        self.ponto_inicial = ponto_inicial
        self.ponto_final = ponto_final

    def contemPonto(self,tupla):
        return True
        
        
class Areas:

    def estaSobreposto(self,retangulo1,retangulo2):
        if retangulo2.ponto_inicial >= retangulo1.ponto_inicial or retangulo2.ponto_inicial <= retangulo1.ponto_final:
            return True
        if retangulo1.ponto_final == retangulo2.ponto_final or retangulo1.ponto_inicial == retangulo2.ponto_inicial:
            return True

        return False
    
    

suite = unittest.TestLoader().loadTestsFromTestCase(AreasTest)
unittest.TextTestRunner(verbosity=2).run(suite)
