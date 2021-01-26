LINES = 15
puts 'Pattern A'
(1..LINES).each { |row| print '*' * row; puts; }

puts "\nPattern B"
(0...LINES).each { |row| print '*' * (LINES - row); puts }

puts "\nPattern C"
(1..LINES).each { |row| print ' ' * (LINES - row) + '*' * row; puts }

puts "\nPattern D"
(0...LINES).each { |row| print ' ' * row + '*' * (LINES - row); puts }
