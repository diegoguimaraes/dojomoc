require 'shunting'

describe Shunting do
  before :each do
    @shunting = Shunting.new
  end

  it "deve retornar um token se a entrada for um numero" do
   
    @shunting.input(1)
    @shunting.output.should be_equal(1)

    @shunting.input(2)
    @shunting.output.should be_equal(2)

    @shunting.input(3)
    @shunting.output.should be_equal(3)
  end
  
  it "deve retornar uma string vazia caso somente uma função for passada" do
    @shunting.input("+")
    @shunting.output.should be @shunting.output.eql?("")
    
    @shunting.input("-")
    @shunting.output.should be @shunting.output.eql?("")

    @shunting.input("/")
    @shunting.output.should be @shunting.output.eql?("")  
  end

  it "deve retornar 2 3 + quando o input for 2+3" do
    @shunting.input("2+3")
    @shunting.output.should be @shunting.output.eql?("2 3+")
  end

end
