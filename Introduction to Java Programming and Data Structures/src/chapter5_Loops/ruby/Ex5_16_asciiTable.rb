PER_LINE = 10
char = '!'
count = 0

while char.ord <= '~'.ord
  print char.chr
  count += 1

  if (count % PER_LINE).zero?
    puts
  else
    print ' '
  end

  char = char.ord + 1
end
