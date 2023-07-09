puts 'Multiplication Table'
9.times { |i| print (i + 1).to_s.rjust(5) }
puts
puts '-' * 47
1.upto(9) do |i|
  print i.to_s + ' | '
  1.upto(9) do |j|
    print (i * j).to_s.ljust(5)
  end
  puts
end