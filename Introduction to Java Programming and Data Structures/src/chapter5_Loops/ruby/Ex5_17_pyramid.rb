print 'Enter the number of lines:'
lines = gets.chomp.to_i
raise "lines should be +ve number: #{lines}" unless lines.positive?

lines.times do |row|
  line = (1..(lines - row)).to_a.reverse
  puts line.join(' ') + ' ' + line.reverse[1..-1].join(' ')

  # j = diff
  #
  # while j > 1
  #   print format('%-3<j>d', j: j)
  #   j -= 1
  # end
  #
  # while j <= diff
  #   print format('%-3<j>d', j: j)
  #   j += 1
  # end
  # puts
end