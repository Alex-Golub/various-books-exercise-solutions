loop do
  print 'Enter number to check if palindrome:'
  num = gets.chomp.to_i
  puts "#{num} is #{num == num.to_s.reverse.to_i ? '' : 'not '}palindrome"
  puts
end

