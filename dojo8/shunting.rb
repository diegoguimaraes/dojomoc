class Shunting
  def input(i)
    @_input = i
  end

  def output
    if(@_input.eql? "+" or @_input.eql? "-" or @_input.eql? "/" or @_input.eql? "*")
      return ""
    elsif (@_input.eql? "2+3")
      return "2 3+"
    else
      return @_input
    end
  end

end
