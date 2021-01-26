def dec_to_hex(num)
  res = ''

  until num.zero?
    rem = num % 16
    hex_value = rem.between?(0, 9) ? rem : (rem - 10 + 'A'.ord).chr
    res = hex_value.to_s + res
    num /= 16
  end

  res.empty? ? '0' : res
end

puts dec_to_hex 123 # 7B
puts dec_to_hex 1234 # 4D2
puts dec_to_hex 1_234_567 # 12D687
puts dec_to_hex 3245 # CAD

# built in functionality
puts 123.to_s 16
puts 1_234_567.to_s 16

puts '7b'.to_i 16
