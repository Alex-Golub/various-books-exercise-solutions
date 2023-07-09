print 'Enter +ve number ->'
number = gets.chomp.to_i
raise "Negative number entered: #{number}" if number.negative?

divisor = 2
while divisor <= number / divisor
  while (number % divisor).zero?
    print divisor, ' '
    number /= divisor
  end
  divisor += 1
end

if number > 1
  print number
end

