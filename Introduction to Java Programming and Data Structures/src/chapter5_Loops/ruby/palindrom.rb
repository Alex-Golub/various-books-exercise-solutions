print 'Enter a string ', '->'
str = gets.chomp
is_palindrom = str == str.reverse
puts "#{str} is #{is_palindrom ? '' : 'not '}a palindrome"
