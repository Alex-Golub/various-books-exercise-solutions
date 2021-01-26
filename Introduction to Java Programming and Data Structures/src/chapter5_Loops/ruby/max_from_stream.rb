number = gets.chomp.to_i
max = number
until number.zero?
  print 'Enter number', '->'
  number = gets.chomp.to_i
  max = [number, max].max
end
puts "Max number is #{max}"
