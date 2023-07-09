def gcd(a, b)
  gcd = 1
  k = 2 # possible gcd
  while k <= a && k <= b
    gcd = k if (a % k).zero? && (b % k).zero?
    k += 1
  end
  gcd
end

puts gcd 16, 24
puts 16.gcd 24
