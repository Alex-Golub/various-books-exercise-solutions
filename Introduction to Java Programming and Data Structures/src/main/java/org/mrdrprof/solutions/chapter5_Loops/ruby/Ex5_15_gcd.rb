print 'Enter first number ->'
n1 = gets.chomp.to_i

print 'Enter second number ->'
n2 = gets.chomp.to_i

raise "One of the numbers is -ve: #{n1}, #{n2}" if n1.negative? || n2.negative?

gcd = n1 > n2 ? n2 : n1
while gcd > 1
  break if (n1 % gcd).zero? && (n2 % gcd).zero?

  gcd -= 1
end

puts format('gcd(%<n1>d, %<n2>d) = %<gcd>d', n1: n1, n2: n2, gcd: gcd)
puts n1.gcd n2
