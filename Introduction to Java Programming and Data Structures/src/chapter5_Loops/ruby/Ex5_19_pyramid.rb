LINES = 8
NUMBER = 3
VALUES = Array.new(LINES) { [] }

VALUES.each_with_index do |arr, i|
  j = 0
  while j < i
    arr << NUMBER**j
    j += 1
  end

  while j >= 0
    arr << NUMBER**j
    j -= 1
  end
end

WIDTH = 5
LINES.times do |i|
  print ' ' * ((LINES - 1) * WIDTH - WIDTH * i)
  print VALUES[i]
  puts
end


