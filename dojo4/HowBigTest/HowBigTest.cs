using HowBigKata;
using Microsoft.VisualStudio.TestTools.UnitTesting;
namespace HowBigTest
{
    
    
    /// <summary>
    ///This is a test class for HowBigTest and is intended
    ///to contain all HowBigTest Unit Tests
    ///</summary>
    [TestClass()]
    public class HowBigTest
    {


        private TestContext testContextInstance;

        /// <summary>
        ///Gets or sets the test context which provides
        ///information about and functionality for the current test run.
        ///</summary>
        public TestContext TestContext
        {
            get
            {
                return testContextInstance;
            }
            set
            {
                testContextInstance = value;
            }
        }

        #region Additional test attributes
        // 
        //You can use the following additional attributes as you write your tests:
        //
        //Use ClassInitialize to run code before running the first test in the class
        //[ClassInitialize()]
        //public static void MyClassInitialize(TestContext testContext)
        //{
        //}
        //
        //Use ClassCleanup to run code after all tests in a class have run
        //[ClassCleanup()]
        //public static void MyClassCleanup()
        //{
        //}
        //
        //Use TestInitialize to run code before running each test
        //[TestInitialize()]
        //public void MyTestInitialize()
        //{
        //}
        //
        //Use TestCleanup to run code after each test has run
        //[TestCleanup()]
        //public void MyTestCleanup()
        //{
        //}
        //
        #endregion


        

        HowBig howBig;

        [TestInitialize()]
        public void IniciarTeste(){
            howBig = new HowBig();
        }

        [TestMethod()]
        public void QuantidadeDigitos_ValorNumerico1000_Retorna10Digitos() {            
            var quantidadeDigitos = howBig.PegarQuantidadeDigitos(1000);
            Assert.AreEqual(10, quantidadeDigitos);
        }

        [TestMethod()]
        public void QuantidadeDigitos_ValorNumericoUmMilhao_Retorna20Digitos()
        {
            var quantidadeDigitos = howBig.PegarQuantidadeDigitos(1000000);
            Assert.AreEqual(20, quantidadeDigitos);
        }

        [TestMethod()]
        public void QuantidadeDigitos_ValorNumericoUmBilhao_Retorna30Digitos()
        {
            var quantidadeDigitos = howBig.PegarQuantidadeDigitos(1000000000);
            Assert.AreEqual(30, quantidadeDigitos);
        }

        [TestMethod()]
        public void QuantidadeDigitos_ValorNumericoUmTrilhao_Retorna40Digitos()
        {
            TestePadraoParaQuantidadeDigitos(40, 1000000000000);
        }

        [TestMethod()]
        public void QuantidadeDigitos_ValorNumericoUmQuadrilhao_Retorna50Digitos()
        {
            TestePadraoParaQuantidadeDigitos(50, 1000000000000000);
        }

        [TestMethod()]
        public void QuantidadeDigitos_ValorNumericoOitoQuadrilhoes_Retorna53Digitos()
        {
            TestePadraoParaQuantidadeDigitos(53, 8000000000000000);
        }

        [TestMethod()]
        public void QuantidadeDigitos_ValorNumerico255_Retorna8Digitos()
        {
            TestePadraoParaQuantidadeDigitos(8, 255);
        }

        [TestMethod()]
        public void QuantidadeDigitos_ValorNumerico256_Retorna9Digitos()
        {
            TestePadraoParaQuantidadeDigitos(9, 256);
        }
        [TestMethod()]
        public void QuantidadeDigitos_ValorNumerico0_Retorna1Digito()
        {
            TestePadraoParaQuantidadeDigitos(1, 0);
        }

        private void TestePadraoParaQuantidadeDigitos(int digitos, long valor)
        {
            var quantidadeDigitos = howBig.PegarQuantidadeDigitos(valor);
            Assert.AreEqual(digitos, quantidadeDigitos);
        }
    }
}
